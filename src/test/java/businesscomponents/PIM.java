package businesscomponents;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.xml.sax.SAXException;

import com.util.frameworkutils.Status;
import com.util.frameworkutils.Util;

import objectrepositories.GTC;
import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;

public class PIM extends ReusableLibrary
{
	
	 public static int OneVotEcommerceTitleLength;
	 public String strValue ="Search Term_Test";
	 public String strValue1="LONG FORM PRODUCT DESCRIPTION_TEST";
	 public String SapName=""; 
	 public String OneVotEcommerceTitle="";
	 static Properties prop1 = new Properties();
	 public static  String Caseval1;
	 public static int propno=1;
	 private static Date startTime;
	 //ravi
	 private static Date endTime;
	 public static long totalTime=0;	
	 public static int total_count=0;
	 public static long avg_time;
	 public static String time_avg;
	 public static int maxval=0;
	 public static String time_max;
	 private static ArrayList<String> executiontime1 = new ArrayList<String>();
	 public static String executionTime;
		
	 Properties prop = new Properties();


	public PIM(ScriptHelper scriptHelper)
	{
		super(scriptHelper);
	}
	
	//ravi
	GenericFunctions GF = new GenericFunctions(scriptHelper);
	WebElement element;
	private Actions action ;
	public static String sapName;
	public static String productDesc;
	public static String record; 
	
	boolean success1 ;
	WebElement sap;
	WebElement vot;
	WebDriverWait wait = new WebDriverWait(driver, 500);
	
	 public void waitForPageLoaded() 
	 {
	        ExpectedCondition<Boolean> expectation = new
	        ExpectedCondition<Boolean>() 
	        {
	             public Boolean apply(WebDriver driver) 
	             {
	                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
	             }
	          };
	          
	          try 
	          {
	              Thread.sleep(1000);
	              WebDriverWait wait = new WebDriverWait(driver, 30);
	              wait.until(expectation);
	          } catch (Throwable error) 
	          {
	              Assert.fail("Timeout waiting for Page Load Request to complete.");
	          }
	          
	         
	 }
	                
	public void loginMDM_test() throws Exception 
	{		
		//driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		startTime = Util.getCurrentTime();
		
		String strAppURL = properties.getProperty("ApplicationURL");
		String uid = dataTable.getData("General_Data", "UserID");	
		String pwd = dataTable.getData("General_Data", "Password");
		driver.get(strAppURL);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GTC.TXT_LOGIN_USER_txt)));
		WebDriverWait wait = new WebDriverWait(driver, 500);
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GTC.TXT_LOGIN_USER_ID)));
			if(GF.isElementPresent(By.xpath(GTC.TXT_LOGIN_USER_ID)))
				driver.findElement(By.xpath(GTC.TXT_LOGIN_USER_ID)).sendKeys(uid);
			if(GF.isElementPresent(By.xpath(GTC.TXT_LOGIN_PWD)))
				driver.findElement(By.xpath(GTC.TXT_LOGIN_PWD)).sendKeys(pwd);
			report.updateTestLog("PIM", "Application is opened ", Status.SCREENSHOT);
			driver.findElement(By.xpath(GTC.BTN_LOGIN)).click();
			try
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GTC.BTN_LOGOUT)));
				GF.waitForObject(By.xpath(GTC.BTN_LOGOUT), "Logout");
				if(GF.isElementPresent(By.xpath(GTC.BTN_LOGOUT)))
				{
					element = driver.findElement(By.xpath(GTC.BTN_LOGOUT));					
					report.updateTestLog("PIM", "Login Successful ", Status.PASS);
				}
			}
			catch(Exception e)
			{
				report.updateTestLog("PIM", "Login Success But Page are taking longer time to load ", Status.FAIL);
			}

		}catch(Exception e)
		{
			report.updateTestLog("PIM", "Login Failed due to Login Screen Load Delay", Status.FAIL);
		}

		ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() 
				{
                    public Boolean apply(WebDriver driver) 
                    {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");                        
                    }
				};
		 
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);        
		endTime = Util.getCurrentTime();
		
		String executionTimeInSeconds = Util.getTimeDifferenceInSeconds(startTime, endTime);
		executionTime = Util.getTimeDifference(startTime, endTime);	
		System.out.println("Execition time in seconds 123 :" + executionTimeInSeconds);		
		executiontime1.add(executionTimeInSeconds);
		
		System.out.println("arrey value in string : "+executiontime1);
		System.out.println("Count : "+executiontime1.size());
		totalTime=0;
		for (int i=0;i<executiontime1.size();i++)
		{
			int elementval=Integer.parseInt(executiontime1.get(i));
			System.out.println("Element value : "+elementval);
			if(maxval<elementval)
			{
				maxval=elementval;
			}
			totalTime=totalTime+elementval;
		}
	System.out.println("Max value : "+maxval);
	System.out.println("Total Value : "+totalTime);
	avg_time=totalTime/executiontime1.size();
	System.out.println("Avg time of execution: "+avg_time);
	int sec=(int)(avg_time%60);
	int min=(int)((avg_time/60)%60);
	time_avg= String.valueOf(min)+" minute(s), "+String.valueOf(sec)+" seconds";
	
	int sec1=maxval%60;
	int min1=(maxval/60)%60;
	time_max= String.valueOf(min1)+" minute(s), "+String.valueOf(sec1)+" seconds";
	
		
	}


	
}


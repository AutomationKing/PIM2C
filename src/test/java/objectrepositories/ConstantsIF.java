package objectrepositories;

// import org.openqa.selenium.By;

public class ConstantsIF
{

	//  ##### Login Page Objects #####
	
	public static final String TXT_LOGIN_USER_ID = "//input[@id='userName']";   
	public static final String TXT_LOGIN_PWD = "//input[@id='password']";   
	public static final String BTN_LOGIN = "//input[@id='login-button']";
	
	//public static final By TXT_USERID = By.id("userName");
	
	public static final String BTN_LOGOUT = "//button[@id='link_logout']";
 
	public static final String TAB_TASKS = "//span[contains(text(),'Tasks')]";
	public static final String TAB_MY_TASK = "//div[contains(text(),'My tasks')]";
	public static final String TAB_TASK_NOT_ACCEPTED = "//div[contains(text(),'Tasks not accepted')]";
	public static final String TAB_MY_RESPONSIBILITY = "//div[contains(text(),'My responsibilities')]";
	//public static final String TAB_QUERIES = "//span[contains(text(),'Queries')]";
	public static final String TAB_QUERIES = ".//*[@id='view.container.context.iconstrip']/div/div/div[1]/div/div/div/div/div/div/div/div[2]/button";
	//public static final String TAB_SEARCH = "//span[contains(text(),'Search')]";
	public static final String TAB_SEARCH = "//span[contains(text(),'Search')]";
	public static final String TAB_DASHBOARD = "//span[contains(text(),'Dashboard')]";
	
	public static final String DIV_TABLE_VIEW_SEARCH = "//div[contains(text(),'Table view')]";
	
	public static final String TASK_ECOMM_TEAM_MANAGER = "//div[contains(text(),'eCommerce Team Manager - China')]";
	
	public static final String FIRST_TASK = "//td[3]/div/div";
	
	public static final String FIRST_PRODUCT_TASK = "//div[2]/div/table/tbody/tr/td[5]/div";
	
	public static final String SECOND_PRODUCT_TASK = "//div[2]/div/table/tbody/tr[2]/td[5]/div";
	
	
	public static final String BTN_FULLTEXT_SEARCH = "//div[@id='fulltextsearch_button']/span";
	
	public static final String TXT_FULLTEXT_SEARCH = "search_input_textfield";
	
	public static final String SRCH_PROD_COUNT = "//div[2]/div/div/div/div/div/button";
	
	public static final String lan_Sel =".//*[@id='language']";
	
	public static final String VER_ATR_CHI = ".//*[@id='MainLayout']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div/div";
	
    public static final String QRY_CLK = ".//*[@id='view.container.context.iconstrip']/div/div/div[1]/div/div/div/div/div/div/div/div[2]/button";
    
    public static final String ITM_DRPDWN = ".//*[@id='search-select-menu-%entity.Article.name']/span";
	public static final String ITM_SELC = "//span[text()='Items in a catalog']";
	
	public static final String SRCH_BTN = "//div[9]/div/span/span";
	
	public static final String PRDCT_CLK = ".//*[@id='article_table']/div[2]/div[1]/table/tbody/tr[1]/td[5]/div";
	
	public static final String GEN_VIEW = "//td[5]/div/div/div";
	
	public static final String PRD_TLTIP = "//tr[7]/td[3]/div/div/div[2]/div/div";
	
	
	public static final String BB_VIEW = "//div[contains(text(),'Brand Building View')]";
	
	public static final String Target_Market = "//tr[2]/td[3]/div/div";
	public static final String Target_Market1 = "//div[2]/div/div/div/div/div/div/div/div/table/tbody/tr/td[3]/div/div";
	
	public static final String SLCT_CHINA = "//span[text()='China']";
	
	public static final String DRPDOWN = "//tr[2]/td[3]/div/div";
	
	public static final String Ecom_VIEW = "//div[contains(text(),'eCommerce View')]";
	
	public static final String EcomDrop = "//div[2]/div/div/div/div/div/div/div/div/table/tbody/tr/td[3]/div/div";
	
	public static final String Reatiler_range ="//div[2]/div/div/div/div/div/div/div/div/table/tbody/tr/td[3]/div/div";
	
	public static final String Retalier_range2 = "//tr[2]/td[3]/div/div";
	
	public static final String Assortment_No =".//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr[5]/td";
	
	public static final String Retailer_Flipkart = "//span[text()='AZ']";
	
	public static final String Retai_Desc = "//tr[10]/td[3]/div/div/div[2]/div/div";
	
	public static final String REF_Type = "//div[contains(text(),'References')]";
	
	public static final String REF_Item ="//div[2]/div/div[2]/div/table/tbody/tr/td[3]/div";
	
	public static final String TAB_STRUCTURES = "//span[contains(text(),'Structures')]";
	
	public static final String Struc_Drop = ".//*[@id='system_select_menu']/div";
	
	public static final String Unil_gpc = "//span[text()='UnileverGPC']";
	
	public static final String Tree =".//*[@id='structure_tree']/div[2]/div[1]/table/tbody/tr[2]/td[1]/div/span"; 
	
	public static final String Tree1 =".//*[@id='structure_tree']/div[2]/div[1]/table/tbody/tr[3]/td[1]/div/span";
	
	public static final String Tree2 =".//*[@id='structure_tree']/div[2]/div[1]/table/tbody/tr[4]/td[1]/div/span";  
	
	public static final String Tree3 = "//tr[9]/td/div";
	
	public static final String TREE4 ="//tr[4]/td/div/span";
	
	public static final String ITM_ASRTMNT = "//span[text()='Items in assortment (Master catalog)']";
	
	public static final String ASSORTMENT_LIST =".//*[@id='search']/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div";
	
	public static final String IMAGE_PRESENT = "//div[2]/div/img";
	
	public static final String MEDIA_VIEW = "//div[contains(text(),'Media')]";
	
	public static final String IMAGE_MEDIA_VIEW = "//div[2]/div/div/div/div/img";
	
	public static final String MEDIA_DROPDOWN ="//div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr/td[3]/div/div";
	
	public static final String MEDIA_CHINESE = "//span[text()='Chinese']";
	
	public static final String SHOW_ALL_ENRICHMENT_VIEW = "//td[3]/div/span/span";
	
	public static final String eCOMMENRICHMENT_APPROVE_YES ="//tr[14]/td[3]/div/div/div[2]/div/div";
	
	public static final String ITEM_IN_XML = "//div[2]/div/div[2]/div/div[2]/div/div";
	
	public static final String ECOMM_MANGER_COMMENTS = "//tr[17]/td[3]/div/div/div[2]/div/div";
	
	public static final String ECOMM_ENRICHMENT_APPROVED_NO = "//div[2]/div/table/tbody/tr[15]/td[3]/div/div/div[2]/div/div";
	
	public static final String NO = "//span[text()='No']";
	
	public static final String  SERACH_BUTTON_XPATH = "//div[@id='search']/..//span[contains(text(),'Search')]";
	
	public static final String ACTION_BUTTON_XPATH = "//span[contains(text(),'Actions')]";
	
	public static final String CREATE_TASK_XPATH = ".//*[@id='pimwebaccess-1169917604-overlays']/div[2]/div/div/span[8]/span";
	
	public static final String TASK_NAME_XPATH = "//*[@id='Task.Name']";
	
	public static final String TASK_DESC_XPATH = "//*[@id='Task.Description']";
	
	public static final String TASK_USER_XPATH = "//*[@id='Task.User']/div";

	public static final String TASK_USER_INPUT_XPATH = ".//*[@id='Task.User']/input";
	
	public static final String TASK_USER_INPUT_DROP_XPATH = ".//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr/td";
	
	public static final String TASK_USER_INPUT_DROP_XPATH_2 = ".//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr[1]/td";
	
	public static final String TASK_RESPOSIBLE_INPUT_XPATH = "//div[@id='Task.Responsible']/input";
	
	public static final String CREATE_TASK_OK_XPATH = "//span[contains(text(),'OK')]";
	
	public static final String TASK_LIST_XPATH = "//*[@id='task_table']/div[2]/div/table/tbody/tr";
	
	public static final String MARK_AS_COMPLETED_XPATH = "//span[contains(text(),'Mark as completed')]";
	
	public static final String ITEM_LIST_XPATH = "//*[@id='pimwebaccess-1169917604-overlays']/div[2]/div/div/span";
	
	public static final String MAIN_LAYOUT_LIST_VIEW_XPATH = "//div[@id='MainLayout']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div";
	
	public static final String SHOW_ALL_XPATH = "//span[contains(text(),'Show all')]";
	
	public static final String ECOM_ENRICHMENT_APPROVED_XPATH = "//tr[12]/td[3]/div/div/div[2]/div/div";
	
	public static final String ECOM_MANAGER_COMMENTS_XPATH = "//div[2]/div/table/tbody/tr[13]/td[3]/div/div/div[2]/div/div";
	
	public static final String DASHBOARD_BUTTON_XPATH = "//div[@id='MainLayout']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div/div/div[3]/div/span[4]";
	
	public static final String DATAQUALITY_DASHBOARD_VIEW_XPATH = "//div[@id='MainLayout']/div/div[2]/div/div/div[3]/div/div/div/div/div/div/span";
	
	public static final String TASK_BB_TEAM_MANAGER = "//div[contains(text(),'Marketing /BB Manager - Dove HairCare')]";
	
	public static final String TASK_ECOMM_TEAM_TASK = "//div[contains(text(),'eCommerce Team - China')]";  
	
	public static final String NEW_PRODUCT_DEV_ENRICHMENT_FOR_CHINA = "//tr[2]/td[3]/div/div";
	
	public static final String Ecomm_PROD_SET_YES = "//tr[8]/td[3]/div/div/div[2]/div/div";
	
	public static final String ONEVOT_ECOMM_TITLE="//tr[12]/td[3]/div/div/div[2]/div/div"; 
	
	public static final String show_ALL_BB_VIEW ="//td[3]/div/span/span";
	
	public static final String Lang_Specific_Brand_name = "//tr[2]/td[3]/div/div/div[2]/div/div";
	
	public static final String e_SUBBRAND ="//tr[9]/td[3]/div/div/div[2]/div/div";
	
	public static final String e_FunctionalName = "//tr[11]/td[3]/div/div/div[2]/div/div";
	
	public static final String e_Variant = "//tr[10]/td[3]/div/div/div[2]/div/div";
	
	public static final String e_size = "//div[2]/div/table/tbody/tr[3]/td[3]/div/div/div[2]/div/div";
	
	public static final String ITEM_NO = "//div[2]/div/div[2]/div/div[2]/div/div";
	
	public static final String REFRESH ="//div[3]/div/span[2]";
	
	public static final String PSO_SUB_CATEGORY = "//div[2]/div/div/div/div/div/div/div/div/table/tbody/tr/td[3]/div/div";
	
	public static final String PSO_SUB_CATEGORY_LABEL = "//div[2]/div/table/tbody/tr[10]/td/div/span";
	
	public static final String PSO_SUB_CATEGORY_DRP_DWN = ".//*[@id='detail_edit_d340c099fc33ecacfa45b457dbe1d5e2']/div/div[2]/div/div/div";
	
	public static final String PSO_SUB_CATEGORY_DRP_DWN_LIST = ".//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr";
	
	public static final String BB_SAP_NAME = "//tr[7]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_1VOT_ECOMMERCE_TITLE = "//tr[11]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_BRAND = "//tr[2]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_SUB_BRAND = "//tr[4]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_FUNCTIONAL_NAME = "//tr[5]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_VARIANT = "//tr[6]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_NET_CONTENT = "";
	
	public static final String BB_NET_CONTENT_UOM = "";
	
	public static final String BB_ESUB_BRAND = "//tr[11]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_EFUNCTIONAL_NAME = "//tr[13]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_EVARIANT = "//tr[12]/td[3]/div/div/div[2]/div/div";
	
	public static final String BB_ESIZE = "//div[2]/div/table/tbody/tr[3]/td[3]/div/div/div[2]/div/div";
	
	public static final String NAME_LABEL_FOR_TASK = "//span[contains(text(),'Name:')]";
	
	public static final String BB_Target_Market = "//span[contains(text(),'Target Market')]";
	
	
	//=================================================
	//Ecomm SAP Attributes
	public static final String Ecomm_Retailer_GLN = "//tr[5]/td[3]/div/div/div[2]/div/div";
	
	public static final String Ecomm_Trade_Item_Group_Desc = "//div[2]/div/table/tbody/tr[5]/td[3]/div/div/div[2]/div/div";
	
	public static final String Ecomm_Category = "//div[2]/div/table/tbody/tr[4]/td[3]/div/div/div[2]/div/div";
	
	public static final String Ecomm_Category_Group = "//tr[7]/td[3]/div/div/div[2]/div/div";
	
	public static final String Ecomm_Market = "//div[2]/div/table/tbody/tr[6]/td[3]/div/div/div[2]/div/div";
	
	public static final String Ecomm_Hazard_Stmt = "//div[2]/div/table/tbody/tr[3]/td[3]/div/div/div[2]/div/div";
	
	public static final String Ecomm_Target_Market = "//span[contains(text(),'Target Market')]";
	
	//Handling and Delivery View SAP Attributes
	
	public static final String Handling_And_Delivery_View = "//div[contains(text(),'Handling and Delivery View')]";
	
	
	public static final String HD_Alternate_Item_Class_Code = "//td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Import_Class_Type = "//tr[3]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Import_Class_Value = "//tr[4]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Stacking_Factor = "//tr[5]/td[3]/div/div/div[2]/div/div";
	
	
	public static final String HD_DC_Temp_Max = "//tr[7]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_DC_Temp_Max_UOM = "//tr[8]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_DC_Temp_Min = "//tr[9]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_DC_Temp_Min_UOM = "//tr[10]/td[3]/div/div/div[2]/div/div";
	
	
	public static final String HD_Temp_Max = "//tr[11]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Temp_Max_UOM = "//tr[12]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Temp_Min = "//tr[13]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Temp_Min_UOM = "//tr[14]/td[3]/div/div/div[2]/div/div";
	
	
	public static final String HD_Storage_handling_Temp_Max = "//tr[15]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Storage_handling_Temp_Max_UOM = "//tr[16]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Storage_handling_Temp_Min = "//tr[17]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Storage_handling_Temp_Min_UOM = "//tr[18]/td[3]/div/div/div[2]/div/div";
	
	
	public static final String HD_Qty_Of_Nxt_LW_Lvl_Items = "//tr[19]/td[3]/div/div/div[2]/div/div";
	
	public static final String HD_Specific_Handling_Code_Transportation = "//tr[20]/td[3]/div/div/div[2]/div/div";
	

	
	//Product Description View SAP Attributes
	
	public static final String Product_Desc_View = "//div[contains(text(),'Product Description')]";
	
	public static final String Product_Sap_Name = "//td[3]/div/div/div[2]/div/div";
	
	public static final String Product_Gtin_Name = "//tr[4]/td[3]/div/div/div[2]/div/div";
	
	public static final String Product_Functional_Name = "//tr[5]/td[3]/div/div/div[2]/div/div";
	
	public static final String Product_Desc = "//tr[6]/td[3]/div/div/div[2]/div/div";
	
	
	public static final String Product_Short_Desc = "//tr[7]/td[3]/div/div/div[2]/div/div";
	
	public static final String Product_Sub_Brand = "//tr[8]/td[3]/div/div/div[2]/div/div";
	
	public static final String Product_Variant = "//tr[9]/td[3]/div/div/div[2]/div/div";
	
	
	
	//Time Constants
	public static final int SECOND_1000 = 1000;
	
	public static final int SECOND_2000 = 2000;
	
	public static final int SECOND_3000 = 3000;
	
	public static final int SECOND_4000 = 4000;
	
	public static final int SECOND_5000 = 5000;
	
	public static final int SECOND_6000 = 6000;
	
	public static final int SECOND_7000 = 7000;
	
	public static final int SECOND_8000 = 8000;
	
	
	
	
	
	
	
}
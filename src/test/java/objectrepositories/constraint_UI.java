package objectrepositories;


public class constraint_UI 
{
	
	
	//  ##### Login Page Objects #####

	public static final String TXT_LOGIN_USER_ID = "//input[@id='userName']";   
	public static final String TXT_LOGIN_PWD = "//input[@id='password']";   
	public static final String BTN_LOGIN = "//input[@id='login-button']";
	public static final String BTN_LOGOUT = "//button[@id='link_logout']";
	
//  ##### After Login Objects #####
	
	public static final String TAB_QUERIES = "//span[contains(text(),'Queries')]";
	public static final String Item_list=".//*[@id='search-select-menu-%entity.Article.name']/span";
	public static final String Item_in_Catalog="//span[contains(text(),'Items in a catalog')]";
	public static final String Search_bttn="//div[9]/div/span/span";
	
//  ##### Filter Objects #####
	
	public static final String Filter_bttn=".//*[@id='MainLayout']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div[3]/div/span[1]";
	public static final String Filter_by=".//*[@id='article_search_combo']/div";
	public static final String Filter_by_GTIN=".//*[@id='article_search_field']";
	public static final String Filter_bttn1="//span[contains(text(),'Filter')]";
	public static final String First_Item=".//*[@id='article_table']/div[2]/div[1]/table/tbody/tr/td[5]/div";
	public static final String Filter_Icn="//div[2]/div/div/div/div/div/div[3]/div/span";
	public static final String FILTER_BY="//div/div[2]/div/div/div/div/div/div/div/div[3]/div/div";
	public static final String Filter_Data=".//*[@id='article_search_field']";
//	##### References Tab object #####
	public static final String References_Tab="//div[contains(text(),'References')]";
	public static final String goesWellWith_path="//tr[.//div[contains(text(),'Goes Well With')]]";
//  ##### Header Tab Objects #####
	public static final String Refresh_btn_path=".//*[@id='MainLayout']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div[3]/div/span[2]";
	public static final String Header_Tab="//div[contains(text(),'Header')]";
	public static final String IPGLN_value="//td[.//div[.//span[contains(text(),'IPGLN:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String GTIN_name_EN="//td[.//div[.//span[contains(text(),'GTIN name')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Matrl_nmbr="//td[.//div[.//span[contains(text(),'Material Number:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String prdct_nmbr="//td[.//div[.//span[contains(text(),'Product type:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String language_header=".//*[@id='article_head_tab']/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div";
	public static final String eanucc_code="//td[.//div[.//span[contains(text(),'EAN UCC Code:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String eanucc_typ="//td[.//div[.//span[contains(text(),'EAN UCC Type:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String manufactur_pth="//td[.//div[.//span[contains(text(),'Manufacturer:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Header_Tab_Target_mkt=".//*[@id='article_head_tab']/div/div/div/div[2]/div/table/tbody/tr[4]/td[3]/div/div";
//  ##### General Tab Objects #####
	
	public static final String General_Tab="//div[contains(text(),'General')]";
	public static final String brnd_nme="//td[.//div[.//span[contains(text(),'Brand name:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String bse_unit_indc="//td[.//div[.//span[contains(text(),'Is base unit:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String consu_unit_indc="//td[.//div[.//span[contains(text(),'Is consumer unit:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String invc_unit_indc="//td[.//div[.//span[contains(text(),'Invoice Unit Indicator:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String variable_wt_indc="//td[.//div[.//span[contains(text(),'Variable Weight Trade Item:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String pack_mrkt_vrbl="//td[.//div[.//span[contains(text(),'Packaging Marked Returnable:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String qnty_nxt_lbl="//td[.//div[.//span[contains(text(),'Quantity Of Next Lower Level Items:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String invoice_indicator="//td[.//div[.//span[contains(text(),'Invoice Unit Indicator:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String ordering_indicator="//td[3]/div/span";
	public static final String disp_unt_indc="//td[.//div[.//span[contains(text(),'Dispatch Unit Indicator:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String end_avai_dt="//td[.//div[.//span[contains(text(),'End availability date:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String strt_avai_dt="//td[.//div[.//span[contains(text(),'Start availability date:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String IS_Private_field="//td[.//div[.//span[contains(text(),'Is private:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String prd_desc="//td[.//div[.//span[contains(text(),'Product description')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String funct_NAME="//td[.//div[.//span[contains(text(),'Functional name')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String language2_general=".//*[@id='article_General_tab']/div/div/div/div[2]/div/table/tbody/tr[16]/td[3]/div/div";
	public static final String brnd_owner_path="//td[.//div[.//span[contains(text(),'Brand owner:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String baseunit_path="//td[.//div[.//span[contains(text(),'Is base unit:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String consumerunit_path="//td[.//div[.//span[contains(text(),'Is consumer unit:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String netcontent_path="//td[.//div[.//span[contains(text(),'Net content')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String netcontent_UOM_path="//td[.//div[.//span[contains(text(),'Net content UOM')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String shortdescription_path="//td[.//div[.//span[contains(text(),'Short Description')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String productdescription_path="//td[.//div[.//span[contains(text(),'Product description')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String General_Tab_Target_mkt=".//*[@id='article_General_tab']/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div";
	
	
	public static final String right_scroll=".//*[@id='article_details']/div[1]/div/button[2]";
	public static final String left_scroll=".//*[@id='article_details']/div[1]/div/button[1]";
	
	//#### Brand building View
	public static final String BB_Tab="//div[contains(text(),'Brand Building View')]";
	public static final String product_desc_path="//td[.//div[.//span[contains(text(),'EAN UCC Code:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String oneVOT_ecomTitle_path="//td[.//div[.//span[contains(text(),'1VOT eCommerce Title:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String eFunction_path="//td[.//div[.//span[contains(text(),'eFunctionalName:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String eSub_brand_path="//td[.//div[.//span[contains(text(),'eSubbrand:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String evarient_path="//td[.//div[.//span[contains(text(),'eVariant:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String eSize_path="//td[.//div[.//span[contains(text(),'eSize:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Feature_benfit1_path="//td[.//div[.//span[contains(text(),'Feature and Benefit 1:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Feature_benfit2_path="//td[.//div[.//span[contains(text(),'Feature and Benefit 2:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Feature_benfit3_path="//td[.//div[.//span[contains(text(),'Feature and Benefit 3:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Feature_benfit4_path="//td[.//div[.//span[contains(text(),'Feature and Benefit 4:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Feature_benfit5_path="//td[.//div[.//span[contains(text(),'Feature and Benefit5:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Feature_benfit6_path="//td[.//div[.//span[contains(text(),'Feature and Benefit 6:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String long_from_prd_desc_path="//td[.//div[.//span[contains(text(),'LongForm Product Description:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String search_keyword_list_path="//td[.//div[.//span[contains(text(),'Search Keyword List:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String search_term_path="//td[.//div[.//span[contains(text(),'Search Terms:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String no_one_searchterm_path="//td[.//div[.//span[contains(text(),'Number 1 Search Term:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String pririty_searchterm_path="//td[.//div[.//span[contains(text(),'Priority Search Terms:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String brand_provided_path="//td[.//div[.//span[contains(text(),'Brand Provided Search Terms:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String combinedbrand_SKL_path="//td[.//div[.//span[contains(text(),'Combined Brand SKL Search Terms:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String BB_Tab_Target_mkt1=".//*[@id='article_BrandBuildingView_tab']/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/div/div";
	public static final String BB_Tab_Target_mkt2=".//*[@id='article_BrandBuildingView_tab']/div/div/div/div[2]/div/table/tbody/tr[21]/td[3]/div/div";
	
	public static final String Ecom_Tab_Target_mkt1=".//*[@id='article_ECommerceView_tab']/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/div/div";
	public static final String Ecom_Tab_Target_mkt2=".//*[@id='article_ECommerceView_tab']/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/div/div";
	//#### Brand building View
	public static final String eCom_Tab="//div[contains(text(),'eCommerce View')]";
	public static final String category_path="//td[.//div[.//span[contains(text(),'Category:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String category_group_path="//td[.//div[.//span[contains(text(),'Category Group:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String precautionary_sts_desc_path="//td[.//div[.//span[contains(text(),'Precautionary Statement Description:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String Retailer_dro_dwn=".//*[@id='article_ECommerceView_tab']/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div";
	public static final String Retailer_name_path="//td/span";
	public static final String retailer_product_code_path="//td[.//div[.//span[contains(text(),'Retailer Product Code:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String retailer_strt_avai_path="//td[.//div[.//span[contains(text(),'Start Availability Date:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String retailer_end_avai_path="//td[.//div[.//span[contains(text(),'End Availability Date:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String searchterm_path="//td[.//div[.//span[contains(text(),'Search Terms:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String NoOnesearchterm_path="//td[.//div[.//span[contains(text(),'Number 1 Search Term:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String SearchKeywordList_path="//td[.//div[.//span[contains(text(),'Search Keyword List:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String PrioritySearchTerms_path="//td[.//div[.//span[contains(text(),'Priority Search Terms:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String BrandProvidedSearchTerms_path="//td[.//div[.//span[contains(text(),'Brand Provided Search Terms:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String CombinedBrandSKLSearchTerms_path="//td[.//div[.//span[contains(text(),'Combined Brand SKL Search Terms:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String eSubBrand_path="//td[.//div[.//span[contains(text(),'eSubbrand:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String eFunctionalName_path="//td[.//div[.//span[contains(text(),'eFunctionalName:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String eVariant_path="//td[.//div[.//span[contains(text(),'eVariant:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	
	
	// #######Ordering Information TAB object
	
	public static final String ordrinfo_Tab="//div[contains(text(),'Ordering Information')]";
	public static final String invoice_name_val="//td[.//div[.//span[contains(text(),'Invoice Name:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String language2_ordering=".//*[@id='article_ordering_tab']/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div";
	public static final String isIngredient_path="//td[.//div[.//span[contains(text(),'Is Ingredient Irradiated:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String firstOderdte_path="//td[.//div[.//span[contains(text(),'First Order Date:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String minOrdrquantity_path="//td[.//div[.//span[contains(text(),'Minimum order quantity:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String sellingUnitOfMeasure_path="//td[.//div[.//span[contains(text(),'Selling UOM:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String multiOrdrquantity_path="//td[.//div[.//span[contains(text(),'Order Quantity Multiple:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String leadtime_path="//td[.//div[.//span[contains(text(),'Lead Time:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String leadtime_uom_path="//td[.//div[.//span[contains(text(),'Lead Time UoM:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String ordrinfo_Tab_Target_mkt1=".//*[@id='article_ordering_tab']/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div";
	public static final String ordrinfo_Tab_Target_mkt2=".//*[@id='article_ordering_tab']/div/div/div/div[2]/div/table/tbody/tr[2]/td[3]/div/div";
	
	// #######Logistic Information TAB object
	public static final String logistic_tab="//div[contains(text(),'Logistic')]";
	public static final String height_val="//td[.//div[.//span[contains(text(),'Height (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String height_UOM_val="//td[.//div[.//span[contains(text(),'Height UOM (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String width_val="//td[.//div[.//span[contains(text(),'Width (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String width_UOM_val="//td[.//div[.//span[contains(text(),'Width UOM (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String depth_val="//td[.//div[.//span[contains(text(),'Depth (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String depth_UOM_val="//td[.//div[.//span[contains(text(),'Depth UOM (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String volume_val="//td[.//div[.//span[contains(text(),'Volume (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String volume_UOM_val="//td[.//div[.//span[contains(text(),'Volume UOM (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String grossweight_val="//td[.//div[.//span[contains(text(),'Gross weight (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String grossweight_UOM_val="//td[.//div[.//span[contains(text(),'Gross weight UOM (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String netweight_val="//td[.//div[.//span[contains(text(),'Net weight (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String netweight_UOM_val="//td[.//div[.//span[contains(text(),'Net weight UOM (metric):')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String logistic_Tab_Target_mkt1=".//*[@id='article_logistics_tab']/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div";
	public static final String logistic_Tab_Target_mkt2=".//*[@id='article_logistics_tab']/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div";
	
	
	public static final String SERACH_AND_REPLACE_IN_COLUMN_DROPDOWN_APPROVED1 = "//span[contains(text(),'BB Enrichment Complete')]";
	
	public static final String SEARCH_FOR_NONE="//div[2]/table/tbody/tr[1]/td";
	public static final String TAB_QUERIES_FRENCH="//span[contains(text(),'Interrogations')]";
	public static final String BB_GDSNPKG_BUTTON="//div[1]/div/div/div[3]/div/span[5]";
	public static final String GDSN_VIEW="//div[1]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div";
	

	public static final String TAB_TASKS = "//span[contains(text(),'Tasks')]";
	public static final String TAB_MY_TASK = "//div[contains(text(),'My tasks')]";
	public static final String TAB_TASK_NOT_ACCEPTED = "//div[contains(text(),'Tasks not accepted')]";
	public static final String TAB_MY_RESPONSIBILITY = "//div[contains(text(),'My responsibilities')]";	
	
	public static final String TAB_SEARCH = "//span[contains(text(),'Search')]";
	public static final String TAB_DASHBOARD = "//span[contains(text(),'Dashboard')]";

	public static final String DIV_TABLE_VIEW_SEARCH = "//div[contains(text(),'Table view')]";

}

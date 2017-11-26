package objectrepositories;

public class ConstantsGPC {
	public static final String user_text="//input";
	public static final String pwd_text="//tr[3]/td[2]/input";
	public static final String login_button="//tr[5]/td/input";
	public static final String logout="//button";
	public static final String task="//span[contains(text(),'Tasks')]";
	
	public static final String task_not_accepted=".//*[@id='task_tree']/div[2]/div[1]/table/tbody/tr[3]/td/div/div/div";
	public static final String is_ecom_validation="//div[contains(text(),'New Product Validation For USA - Is eCommerce product')]";
	public static final String ecom_enrichment_task="//div[contains(text(),'New Product Development - eCommerce Enrichment for eContent Team')]";
	public static final String ecom_enrichment_approved_task="//div[contains(text(),'New Product Development - eCommerce Enrichment Approval for eContent Team')]";
	public static final String bb_enrichment_task="//div[contains(text(),'New Product Development - Brand Building Enrichment for eCommerce Marketing Team')]";
	public static final String bb_manager_enrichment_task="//div[contains(text(),'New Product Development - Brand Building Enrichment Approval for eCommerce Marketing Team')]";
	public static final String update_assortment_task="//div[contains(text(),'Update Assortment Information')]";
	public static final String update_rpc_task="//div[contains(text(),'Update Retailer Product Code information')]";
	
	
	public static final String list_view_lastcreated_on=".//*[@id='article_table']/div[1]/div[1]/div/table/tbody/tr/td[16]/div[3]";//"//div[contains(text(),'Last changed on')]";
	public static final String ecom="//div[contains(text(),'eCommerce View ')]";
	public static final String ECOM_TAB_Isecom="//td[.//div[.//span[contains(text(),'Is Ecom Product:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String ECOM_TAB_ecomrichment_complete="//td[.//div[.//span[contains(text(),'eCom Enrichment Complete:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String ECOM_TAB_ecom_enrichment_approved="//td[.//div[.//span[contains(text(),'eCom Enrichment Approved:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String BB_TAB_bbenrichment_complete="//td[.//div[.//span[contains(text(),'BB Enrichment Complete:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String BB_TAB_bb_enrichment_approved="//td[.//div[.//span[contains(text(),'BB Enrichment Approved:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String refresh_button="//div[3]/div/span[2]";
	public static final String BB_tab_us_bb_task="//div[contains(text(),'Brand Building View')]";//Brand Building View
	public static final String ECOM_TAB_reatiler_attribute=".//*[@id='article_ECommerceView_tab']/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div";
	public static final String ECOM_TAB_retailerstart_date="//td[.//div[.//span[contains(text(),'Start Availability Date:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String ECOM_TAB_retailer_product_code_updated="//td[.//div[.//span[contains(text(),'Retailer Product Code Updated:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	public static final String ECOM_TAB_retailer_data_updated="//td[.//div[.//span[contains(text(),'Retailer Data Updated:')]]]/following-sibling::td[contains(@class,'v-formlayout-contentcell')]/div/div/div[contains(@class,'v-panel-captionwrap')]/following-sibling::div[1]/div/div";
	
	
	
	public static final String queries="//span[contains(text(),'Queries')]";
	public static final String item="//span[contains(text(),'Item')]";
	public static final String item_catalog="//span[contains(text(),'Items in a catalog')]";
	public static final String search_icon=".//*[@id='MainLayout']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div[3]/div/span[1]";
	public static final String filetr_dropdown=".//*[@id='article_search_combo']/input";
	public static final String filter_target_market=".//*[@id='article_search_field']/input";
	public static final String filter_button=".//*[@id='article_search_button']/span";
	public static final String first_element="//div[2]/div/table/tbody/tr/td[5]/div ";//div[2]/div/table/tbody/tr/td[5]/div
    	
	public static final String BB_tab=".//*[@id='gwt-uid-52']/div";
	public static final String reference_tab="//div[contains(text(),'References')]";
	public static final String reference_add=".//*[@id='article_detail_tab_references']/div/div/div[1]/div/div/div/span[1]";
	public static final String reference_tab_delete=".//*[@id='article_detail_tab_references']/div/div/div[1]/div/div/div/span[3]";
	public static final String reference_type_dropdown=".//*[@id='pimwebaccess-1169917604-overlays']/div[3]/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/div/div";
	public static final String reference_object_number="//td[3]/input";
	public static final String referecne_sequence_number="//tr[5]/td[3]/input";
	public static final String reference_creation_ok_button="//span[contains(text(),'OK')]";
	public static final String reference_tab_first_goes_well_with=".//*[@id='detail_references_table']/div[2]/div[1]/table/tbody/tr[1]/td[1]/div";
	public static final String refernce_tab_object_number=".//*[@id='detail_references_table']/div[2]/div[1]/table/tbody/tr[1]/td[3]";
	public static final String reference_goes_well_with_deletion_="//span[contains(text(),'Yes')]";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static final String longform="//tr[32]/td[3]/div/div/div[2]/div/div";////tr[32]/td[3]/div/div/div[2]/div/div
	public static final String longform_maximise="//div[2]/button[2]";
	public static final String longform_save="//div[3]/div/div/div/div[2]/div/div/div/span/span";
	public static final String Action_buton="//div[3]/div/div[2]/div/div/div/div/div/div/div/span";
	public static final String execute_dq="//span[contains (text(),'Execute data quality rules')]";
	public static final String uk_label=".//*[@id='cb2014022584']/label";
	public static final String uk_label_checkbox="//tr[9]/td/div/span[2]/input";////tr[9]/td/div/span[2]/input
	public static final String dq_ok_button="//div[2]/div/div/div[3]/div/span";
	public static final String dq_close_button="//span[contains(text(),'Close')]"; 
	public static final String right_button="//button[2]";
	public static final String Quality_status_tab="//td[14]/div/div";
	public static final String dq_tab_dropdown=".//*[@id='dataquality_channel_combobox']/div";
	public static final String dw_dropdown_inner_click=".//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[3]/span";
	public static final String uk_dq_dropdown_selection=".//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr[5]/td";
	public static final String firstelement="//div[2]/div/div[2]/div/table/tbody/tr/td";
	public static final String fifthelement="//div[2]/div/div[2]/div/table/tbody/tr[5]/td";
	public static final String ninthelement="//div[2]/div/div[2]/div/table/tbody/tr[9]/td";
	public static final String ninth_status="//div[2]/div/div[2]/div/table/tbody/tr[9]/td[2]";
		
	public static final String classification="//div[contains(text(),'Classification')]"; 
	public static final String claissification_unilever_gpc="//div[contains(text(),'UnileverGPC')]";
	public static final String classification_hierarchy=".//*[@id='detail_classification_table']/div[2]/div[1]/table/tbody/tr[2]/td[2]";
	
	public static final String structures="//span[contains(text(),'Structures')]";
	public static final String queries_search="//div[9]/div/span";
	public static final String gpc_button=".//*[@id='system_select_menu']/div";
	public static final String gpc_unilever="//span[contains(text(),'UnileverGPC')]";
	public static final String gpc_item_dropdown="//span[contains(text(),'Item')]";
	public static final String gpc_item_click=".//*[@id='entiy_mode_select_menu']/div";
	
	public static final String arrow_first_hierarchy="//tr[2]/td/div/span";
	
	
	
	
	
	
	public static final String first_arrow="//tr[2]/td/div/span";
	public static final String second_arrow="//tr[3]/td/div/span";
	public static final String third_arrow="//tr[4]/td/div/span";
    public static final String firstnode="//div[contains(text(),'Cleaning/Hygiene Products')]";
    public static final String secondnode="//div[contains(text(),'Cleaning Products')]";
    public static final String thirdnode="//div[contains(text(),'Cleaners')]";
    public static final String search="//span[contains(text(),'Search')]";
    public static final String search_box=".//*[@id='search_input_textfield']";
    public static final String search_button=".//*[@id='fulltextsearch_button']/span";
    public static final String EAN=".//span[contains(text(),'EAN UCC Code')]";
    public static final String first_click="//span/input";
    public static final String first_EANUCC="//label";
    public static final String first_EANUCC_count="//div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div";
    public static final String first_list_EANUCC_count=".//*[@id='button_back']";
    public static final String first_list_click=".//*[@id='fulltextsearch_result_table']/div[2]/div[1]/table/tbody/tr[1]/td[6]/div";
    public static final String header_EAN="//div[2]/div/table/tbody/tr[2]/td[3]/div/div/div[2]/div/div";
    
    
}

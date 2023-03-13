package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;

/*select a.statuscodeid,a.* from cases a
where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='14300000797')
order by caseid desc
--update cases set statuscodeid=5 where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='14300000797')
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

/*case creation by CA for SSC=Customer Initiated Info Maintenance
Source=Branch Walkin

*/


   public class SC_018_Case_ContactInformation extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    CaseJourneyPageMethod CJPM=new CaseJourneyPageMethod();
    CaseStagePageMethod  cs1pm = new CaseStagePageMethod();

    HomePageMethod home = new HomePageMethod();
	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_018_TC_001() throws Exception
	{

    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(2000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(500);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        CheckRole();
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        Thread.sleep(2000);
        CJPM.FillSSC("Contact Information");
       	CJPM.Source("Branch Walkin");
	    Thread.sleep(1000);
		cs1pm.ContactInformationactipntype("Contact Creation");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    Thread.sleep(1000);
		CJPM.NextOnCasePage();
		//scrollBy();
		Thread.sleep(2000);
	   //Stage1 Case Journey


		Thread.sleep(1000);
		cs1pm.casecountry("Albania");
		Thread.sleep(1000);
		cs1pm.CaseHosueNumber();
		cs1pm.caseStreet();
		cs1pm.casemobile();
        screen.ScreenshotMethod("SC_018_ContactInformation-");

		//cs1pm.CaseCustomerType("Employed");
		//Thread.sleep(1000);
		//cs1pm.ForEmployement("Yes");

        cs1pm.attachCIFdcmnt();

		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		Thread.sleep(1000);
	    //cs1pm.SelectComputationRequest("Available Balance Computation");
		cs1pm.CaseTypeofRequest("Loan Availment");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
		Thread.sleep(1000);
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");		
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
		//LogoutButtonClick();
		QuiteBrowser();

		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    EnterPassword(TestDataFromExcel.Password);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    LoginButtonClick();
	    Thread.sleep(1000);
        CheckRole();
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    Thread.sleep(500);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    cs1pm.sel_depetdecison("Accept");
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
	    cs1pm.waitTillClosed();

	    screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");		
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_018_ContactInformation-");
		//LogoutButtonClick();
		QuiteBrowser();


	}
    }





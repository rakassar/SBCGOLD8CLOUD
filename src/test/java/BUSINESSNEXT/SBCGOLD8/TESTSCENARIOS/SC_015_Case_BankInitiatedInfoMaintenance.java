package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;



/*select a.statuscodeid,a.* from cases a
where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='12400000117')
order by caseid desc
--update cases set statuscodeid=5 where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='12400000117')
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

/*case creation by CCA for SSC=Bank Initiated Info Maintenance
 * CCRSC=No
Source=Branch Walkin

*/


   public class SC_015_Case_BankInitiatedInfoMaintenance extends HomePageMethod
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
	public void SC_015_TC_001() throws Exception
	{

    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CCA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        Thread.sleep(2000);
        CJPM.FillSSC("Bank Initiated Info Maintenance");
       	CJPM.Source("Call Center");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
	    CJPM.PIDStatus("Pass");
	    Thread.sleep(1000);
	    //CJPM.ComplaintCategory("CCU");
		CJPM.NextOnCasePage();
		home.scrollBy();
		Thread.sleep(1000);
		cs1pm.UpdateCRRSC("No");
		cs1pm.TaxExemptionStatus("Yes");
		cs1pm.ReasonforTagging("Tagging");
		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
	   //Stage1 Case Journey
		//cs1pm.ReportedSystem("SBOL1");
		//cs1pm.EmployeeInvolved("EmployeeInvolved");
		//cs1pm.UnitGroup("UnitGroup");
		//cs1pm.Employeeoutsource("Employeeoutsource");
		//cs1pm.Position("Position");
		//cs1pm.ActionTaken("ActionTaken");
		//cs1pm.OtherAction("OtherAction");

		//cs1pm.SourceAccountNumber("787873281837");
		//cs1pm.DestinatuionAccountNumber("78787328188");

	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
		Thread.sleep(1000);
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000);
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
		Thread.sleep(1000);
		//LogoutButtonClick();
		QuiteBrowser();



		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
	    EnterPassword(TestDataFromExcel.Password);
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
	    cs1pm.sel_depetdecison("Accept");
	    Thread.sleep(1000);
	    //cs1pm.ValidityTagging("VALID");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        CJPM.casesaveAndProceed();
        Thread.sleep(5000);

	    cs1pm.waitTillClosed();
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_015_BankInitiatedInfoMaintenance-");
		//LogoutButtonClick();
		QuiteBrowser();

	}
    }





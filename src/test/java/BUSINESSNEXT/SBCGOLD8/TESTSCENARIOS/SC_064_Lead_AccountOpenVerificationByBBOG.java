package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;

/*Customer Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_064_Lead_AccountOpenVerificationByBBOG extends HomePageMethod
{

    //Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX=new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    Screenshot screen=new Screenshot();
    OracleDbConnection db =new OracleDbConnection();
	CreateLeadAppointmentPageMethod CAPM=new CreateLeadAppointmentPageMethod();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();



    @Test
 	public void SC_064_TC_001() throws InterruptedException, IOException
 	{
    	launchBrowser();
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
        EnterPassword(TestDataFromExcel.Password);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        LoginButtonClick();
        CheckRole();
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.selfassignlead("Account Opened");
        lopm.leadview("Assigned Leads");
        Thread.sleep(500);
        lopm.onMyBucketlead();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        lopm.BBOGlogExceptionButton();
        lopm.SwitchToLastWindow();
        lopm.logException("No deficiency");
        lopm.LeadRemarks("No defect");
        lopm.clickFinsih();
        lopm.SwitchToParentWindow();
        
        lopm.BBOGVerify();
        lopm.LeadRemarks("No defect");
        lopm.BmApproveUpdate();
        Thread.sleep(1000);
        scrollToTop();
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        System.out.println("Lead status code is "+lopm.getStatusCode());
        lopm.goToCustomer360();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        cspm.switchCustomerView();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
        QuiteBrowser();

    
        
        


	}
	/*
	 * //screen shot using listner class
	 *
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */

     }



package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;

/* Lead creation process for NTB Individual

 */
import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class SC_026_Lead_NTBIndiPitches extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();


	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_026_TC_001() throws Exception
	{

    	//rizwan

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        CheckRole();
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");

        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        ClickOnsalesJouney();

        lopm.ClickOnOnBoardingJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
	}

    @Test(priority=2)
	public void SC_026_TC_002() throws Exception
	{

        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        NTBSJPM.pitchMultipleProduct("Yes");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        Thread.sleep(1000);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        NTBSJPM.SDBranch("Acropolis");
        Thread.sleep(500);
        CLDLPM.salesID("0014-Velasco, Jacqueline L.");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
    }


    @Test(priority=3)
	public void SC_026_TC_003() throws Exception
	{
        scrollBy();
        NTBSJPM.checkboxSaving();
        NTBSJPM.checkboxChecking();
        NTBSJPM.checkboxDeal();
        NTBSJPM.checkboxPersonalLoan();
        NTBSJPM.checkboxAutoloan();
        NTBSJPM.checkboxHomeLoan();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        NTBSJPM.checkboxCreditCard();
        NTBSJPM.checkboxOtherloan();
        NTBSJPM.checkboxTrust();
        NTBSJPM.checkboxUITF();
        NTBSJPM.checkBoxBanca();
        NTBSJPM.checkboxTreasury();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        scrollBy();
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        lopm.saveAndProceed();




    }
    @Test(priority=4)
	public void SC_026_TC_004() throws Exception
	{
    	Thread.sleep(7000);
        lopm.GetLeadId();

        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        scrollBy();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        scrollBy();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_026_Lead_NTBIndiPitches-");
        LogoutButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
    	QuiteBrowser();

	}

  //screen shot using listner class
	/*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */
   }



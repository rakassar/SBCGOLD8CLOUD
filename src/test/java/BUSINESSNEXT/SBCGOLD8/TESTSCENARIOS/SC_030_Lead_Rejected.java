package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;


/* Lead creation process for NTB Individual

 */

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
@Listeners(BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.ListnersClassAnotation.class)

   public class SC_030_Lead_Rejected extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
   // BrowserStart br=new BrowserStart(); 
    //HomePageMethod home=new HomePageMethod();

	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_030_TC_001() throws Exception
	{

    	//rizwan

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        CheckRole();
        screen.ScreenshotMethod("SC_030_TC_001-");

        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        ClickOnsalesJouney();

        lopm.ClickOnOnBoardingJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_030_TC_001-");
	}

    @Test(priority=2)
	public void SC_030_TC_002() throws Exception
	{
    {
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        Thread.sleep(1000);
        lopm.GetLeadId();
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        lopm.btn_LeadReject();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_030_TC_001-");
    	QuiteBrowser();

        //CLDLPM.CreatedNewLeadEdit();
        //LoginPageRedircet();
        //LogoutButtonClick();

    }
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

package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;

/* lead for high risk BCM jourmey
*/
import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_019_Lead_BCMJourneyNewAccountOpen extends HomePageMethod
{

    //Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX=new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    Screenshot screen=new Screenshot();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();



    @Test(priority=1)
	public void SC_019_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
	}


    @Test(priority=2)
	public void SC_019_TC_002() throws InterruptedException, IOException
	{
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        lopm.GetLeadId();
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);

	}

    @Test(priority=3)
	public void SC_019_TC_003() throws InterruptedException, IOException
	{
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
	}


    @Test(priority=4)
	public void SC_019_TC_004() throws InterruptedException, IOException
	{
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.occupation("Laborers and Unskilled Workers");
        CLDLPM.IncomeRange("305k to 470k");
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        CLDLPM.EconomicActivity("Other Service Activities");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.Industry_Classification("ACTIVITIES OF BUSINESS AND EMPLOYERS MEMBERSHIP ORGANIZATIONS");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.NatureOfWorkNEW("Social Services");
        CLDLPM.NatureOfWorkNEW_SC( "Social Services - other");
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        /*employed steps end */

	}


    @Test(priority=5)
	public void SC_019_TC_005() throws InterruptedException, IOException
	{
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        // CRRSC section
        CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
        CRRSC.Sbol(TestDataFromExcel.Sbol);
        
        //Communication Channel Preference
        CLDLPM.ChannelPreference_PhoneCall();
        Thread.sleep(500);
        CLDLPM.ChannelPreference_SMS();
        Thread.sleep(500);
        scrolldown();
         CLDLPM.ChannelPreference_Viber();
         Thread.sleep(500);
          CLDLPM.ChannelPreference_Email();
          screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");

          
        scrollToTop();
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");


        //LogoutButtonClick();
        }


    @Test(priority=6)
 	public void SC_019_TC_006() throws InterruptedException
 	{
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    	//CLDLPM.leadredbutton();

/*
        //  OLD CRRSC
     	CRRSC.AmlcUnJmf("No");
     	CRRSC.BankInternalChecklist("No");
     	CRRSC.AllegedPerdsonf("No");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.HPIOrJoint("No");
     	CRRSC.BenifOFW("No");
     	CRRSC.ForeignNational("No");
     	CRRSC.NumberAccount("No");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.EmploymentTypeCRRSC("Employed");
     	CRRSC.IndustryCRRSC("CARPENTRY");
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC("No");
     	CRRSC.DirectDealingCRRSC("No");
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC("Aglipay");
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.vicinityRRSC("Yes");

        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.intialdepositeRRSC("No");

     	CRRSC.InwprdOutwordRRSC("Yes");

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC("Yes");



        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
     	CRRSC.ComfortableInformationRRSC("Yes");
     	CRRSC.ComfortableDocumentsRRSC("Yes");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");

*/

         /*     //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
         CRRSC.Finish(); */
         
         //Latest CRRSC
         CRRSC.OtherRskFctr("Unreasonable reliance on the gatekeeper such as lawyers and accountants");
         screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
         CRRSC.OFAC_mashup();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
         CRRSC.Finish(); 
      

         Thread.sleep(1000);
 	}


    @Test(priority=7)
 	public void SC_019_TC_007() throws InterruptedException
 	{
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	 screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        QuiteBrowser();

 	}

    @Test(priority=8)
 	public void SC_019_TC_008() throws InterruptedException, IOException
 	{
    //LogoutButtonClick();
    launchBrowser();
    TestDataFromExcel.DataRead();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    EnterUserName(TestDataFromExcel.UserName_BranchBCM);
    EnterPassword(TestDataFromExcel.Password);
	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    LoginButtonClick();
    CheckRole();
	Thread.sleep(500);
    clk_leadobject();
    lopm.categoryview("Deposit-Individual");
    lopm.selfassignlead("Need Approval");
    lopm.leadview("Assigned Leads");
    Thread.sleep(500);
    lopm.onMyBucketlead();
    Thread.sleep(500);
    lopm.BmApproveButtonclk();
    Thread.sleep(500);
    lopm.BmApproveComments("BM Comments");
    lopm.BmApproveUpdate();
    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
    QuiteBrowser();
 	}

    @Test(priority=9)
 	public void SC_019_TC_009() throws InterruptedException

 	{

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.leadview("Assigned Leads");
        Thread.sleep(1000);
        lopm.onMyBucketlead();
        Thread.sleep(1000);

 	}


    @Test(priority=10)
 	public void SC_019_TC_010() throws InterruptedException
 	{
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        Thread.sleep(400);
        scrollBy();

        FAIPM.PromoCode();
        //FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
      FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");

        //


 	}


      @Test(priority=11)
 	public void SC_019_TC_011() throws InterruptedException
 	{
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        Thread.sleep(1000);
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        scrollToTop();
        lopm.GetLeadId();
        lopm.waitTillAccountOpen();
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
        QuiteBrowser();
 	}
      @Test(priority=12)
     	public void SC_019_TC_012() throws InterruptedException, IOException
     	{
         	launchBrowser();
          screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
         	TestDataFromExcel.DataRead();
      		EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
             EnterPassword(TestDataFromExcel.Password);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             LoginButtonClick();
             CheckRole();
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             clk_leadobject();
             lopm.categoryview("Deposit-Individual");
             lopm.selfassignlead("Account Opened");
             lopm.leadview("Assigned Leads");
             Thread.sleep(500);
             lopm.onMyBucketlead();
             Thread.sleep(500);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             CLDLPM.clickClosePopup();
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
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
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             System.out.println("Lead status code is "+lopm.getStatusCode());
             lopm.goToCustomer360();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             cspm.switchCustomerView();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_019__Lead_BCMJourneyNewAccount-");
             QuiteBrowser();


     	}




     }



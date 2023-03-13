package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;

import java.io.IOException;

import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.OBJECT.LeadObjectPageObject;

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_041_Lead_ETBTreasuryIndi extends HomePageMethod {

	// Object for methods class
	CustomerSerachPageMethod cspm = new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM = new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM = new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC = new CRRSCLeadPageMethod();
	Screenshot screen = new Screenshot();
	FillAccountInformationPageMethod FAIPM = new FillAccountInformationPageMethod();

	@Test(priority = 1)
	public void SC_041_TC_001() throws InterruptedException, IOException {
		launchBrowser();
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		EnterUserName(TestDataFromExcel.UserName_CA);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		CheckRole();
		Thread.sleep(100);
		ClickOnsaleswidget();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		ClickOnsalesJouney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		lopm.ClickOnOnBoardingJourney();
		cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
		Thread.sleep(1000);
		cspm.ClickOnOnBoardingJourneynext();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		cspm.ChooseBBNfromList();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		cspm.clickstartjourney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		cspm.ETBIndividualSalesJorney();
		// cspm.clickonredbutton();
		// cspm.ClickOnOnBoardingJourneynext2();

		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");

	}

	@Test(priority = 2)
	public void SC_041_TC_002() throws Exception {

		NTBSJPM.LeadRating("Hot");
		NTBSJPM.InterestedIn("Treasury");

		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		NTBSJPM.NTBJourneynext1();
		Thread.sleep(1000);

		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");

		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		NTBSJPM.ProductCategory("COMPLEX DERIVATIVES");
		Thread.sleep(500);
		NTBSJPM.Product("COMPLEX DERIVATIVES");
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(1000);
		System.out.print("Trust ");
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		CLDLPM.CheckEmployeetype();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);

	}

	@Test(priority = 3)
	public void SC_041_TC_003() throws InterruptedException, IOException {

		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");

		CLDLPM.settlementaccntType("Choose from Existing Account");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		CLDLPM.settlementaccntPickerclk();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		CLDLPM.settlementaccntclk();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrolldown();
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");

		CLDLPM.SoleOwner("Yes");
		CLDLPM.GroupID("Groupid123");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");

	}

	@Test(priority = 4)
	public void SC_041_TC_004() throws InterruptedException, IOException {
		if (CollectDocsLeadPageMethod.Employeetype.equals("Self-Employed")) {

			CLDLPM.businessname();
			CLDLPM.Sourceoffunds("Business");
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
			// CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);

			Thread.sleep(2000);
			System.out.println("EmployeeType is self-employed");

		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Unemployed"))

		{
			CLDLPM.Sourceoffunds("Inheritance");
			screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
			Thread.sleep(1000);
			System.out.println("EmployeeType is unemployed");
		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Employed")) {
			CLDLPM.employername();
			CLDLPM.Sourceoffunds("Salary");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
			CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
			Thread.sleep(1000);
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);

			// CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
			System.out.println("EmployeeType is Employed");
		}

	}

	@Test(priority = 5)
	public void SC_041_TC_005() throws InterruptedException, IOException {
		CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
		CLDLPM.IDNumner();
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");

		// CLDLPM.Tin("");
		CLDLPM.dosriFlag("No");
		CLDLPM.fatcaFlag("Yes");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		CLDLPM.UpdateDetailsTrustTreasury("Yes");
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		CLDLPM.ClickOnAddress();
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");

		Thread.sleep(1000);
		scrollBy();
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		CLDLPM.PermanentAddresssameasPresentAddress("Yes");
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		lopm.saveAndProceed();
		NTBSJPM.CaseDedupeOnDocsLead();
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
	}

	@Test(priority = 6)
	public void SC_041_TC_006() throws InterruptedException {
		lopm.waitTillAccountOpen();
		lopm.waitTillCSQPerform();
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		QuiteBrowser();

	}

	@Test(priority = 7)
	public void SC_041_TC_007() throws InterruptedException, IOException {
		launchBrowser();
		TestDataFromExcel.DataRead();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		EnterUserName(TestDataFromExcel.UserName_TreasuryOps);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		clk_leadobject();
		lopm.categoryview("Treasury-Individual ");
		lopm.selfassignlead("Assigned to Treasury");
		lopm.leadview("Assigned Leads");
		Thread.sleep(500);
		lopm.onMyBucketlead();
		Thread.sleep(500);
		lopm.ProcessApplication();
		Thread.sleep(1500);
		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
		Thread.sleep(1500);
		lopm.TustOpsConvertLeadCLK();
		Thread.sleep(500);
		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_041_Lead_ETBTreasuryIndi-");
		QuiteBrowser();
	}

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

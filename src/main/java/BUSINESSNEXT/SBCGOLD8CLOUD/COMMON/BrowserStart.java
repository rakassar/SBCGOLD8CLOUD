package BUSINESSNEXT.SBCGOLD8CLOUD.COMMON;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.OBJECT.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.REPOSITORY.*;

public class BrowserStart implements Properties{
	public static WebDriver driver=null;

	//@BeforeClass
	public void launchBrowser()
	{

    System.setProperty(ChromeWebDriver, ChromeDriverPath);
	driver =new ChromeDriver();
	//driver.close();
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--start-maximized");
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	new LoginPageObject(driver);
	new HomePageObject(driver);
	new LeadObjectPageObject(driver);
	new CustomerSearchPageObject(driver);
	new IndividualSalesJourneyPageObject(driver);
	new CreateLeadAppointmentPageObject(driver);
	new CollectDocsLeadPageObject(driver);
	new CustomerCareExecutiveObjects(driver);
	new ExecutiveAssistantSalesObjects_ea_sales(driver);
	new CRRSCLeadPageObject(driver);
	new FillAccountInformationPageObject(driver);
	new CaseJourneyPageObject(driver);
	new CaseStagePageObject(driver);
	new ReportPageObject(driver);

	}




	public void LoginPageRedircet()

	{
		driver.navigate().to(URL);
	}


	// @AfterClass
	public void QuiteBrowser()

	{

		 driver.quit(); }

	public void Refresh() {
		driver.navigate().refresh();
	}
	
}



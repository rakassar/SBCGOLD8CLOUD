package BUSINESSNEXT.SBCGOLD8CLOUD.OBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerSearchPageObject extends LoginPageObject{

public CustomerSearchPageObject (WebDriver driver)

{

	super(driver);

}

@FindBy(xpath="//span[normalize-space()='Next']")
public static WebElement clk_salesonbaordingjourneynext;

@FindBy(css="a[title='Next'] span")
public static WebElement clk_salesonbaordingjourneynext2;

@FindBy(css="input[name='100000012']")
public static WebElement ent_fillBBNnumber;

@FindBy(css="input[name='100000007']")
public static WebElement ent_fillBBNnumberNonIndi;


/*
 * //gold5.5
 *
 * @FindBy(xpath="//a[@class='tb button-icon-text f13']/span[1]") public static
 * WebElement clk_topBBN;
 *
 */

@FindBy(xpath="//a[@data-autoid='F266_0']")
public static WebElement clk_topBBN;


@FindBy(xpath="//a[@data-autoid='F360_0']")
public static WebElement clk_topBBNNonIndi;

@FindBy(xpath="//select[@class ='selectbox']")
public static WebElement sel_chooseCstmerToSrch;

@FindBy(xpath="//*[@id=\\\"newobject\\\"]/div[3]/div/div")
public static WebElement btn_redbutton;

@FindBy(xpath="(//a[@title='Start Your Journey'])[1]")
public static WebElement btn_clickstartjourney;

@FindBy(xpath="//a[@data-autoid = 'btn_toggle']")
public static WebElement btn_clickSwitchView;

@FindBy(xpath="//span[@title ='Bulk Account Opening']")
public static WebElement btn_BulkAccountOpening;

@FindBy(xpath="//a[@title ='New Payroll Request']")
public static WebElement btn_clickNewPayrollRequest;

@FindBy(css="a[id=\"1\"]")
public static WebElement btn_ETBIndividualSalesJorney;

@FindBy(css="a[id=\"2\"]")
public static WebElement clk_CustomerServiceJourney;


@FindBy(xpath="//*[@id=\\\"1\\\"]")
public static WebElement btn_ETBJourney;



@FindBy(xpath="//*[@id=\"object-action-button\"]/div/a[1]")
public static WebElement clk_NextOnCustomerSerach1;

//span[normalize-space()='Next']


}

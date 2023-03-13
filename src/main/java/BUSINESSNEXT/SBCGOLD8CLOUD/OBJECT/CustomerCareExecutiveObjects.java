package BUSINESSNEXT.SBCGOLD8CLOUD.OBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerCareExecutiveObjects extends LoginPageObject {

	public CustomerCareExecutiveObjects (WebDriver driver)

	{
		super(driver);

	}


	//***********Start*************Fill the Info for SD process*****************************-------------//

		//Fill the all textbox type info//
	@FindBy(id="LEA_EX3_41month")
	public static WebElement sel_SDdobmonth;
	@FindBy(id="LEA_EX3_41day")
	public static WebElement sel_SDdobday;
	@FindBy(id="LEA_EX3_41year")
	public static WebElement sel_SDdobyear;
	@FindBy(id="ZipCode")
	public static WebElement sel_SDZipCode;
}

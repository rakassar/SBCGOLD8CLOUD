package BUSINESSNEXT.SBCGOLD8CLOUD.OBJECT;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseJourneyPageObject extends LoginPageObject{

public CaseJourneyPageObject (WebDriver driver)

{
	super(driver);

}


//***********End*************Fill the Info for  Indivdual process*****************************-------------//




@FindBy(className="firstchar")
public static WebElement clk_IndividualCaseJorney;

@FindBy(xpath="//input[@name='CASE_SUBCATEGORY1']")
public static WebElement fillSSC;

@FindBy(xpath="//a[@data-autoid='CASE_PRDHOLDINGNUMBER_srch']")
public static WebElement fillcardproduct;

@FindBy(xpath="//div[@data-autoid='Name_3']")
public static WebElement loanProduct;



@FindBy(xpath="//div[contains(@data-autoid,'Name')]")
public static List<WebElement> fillcreditcardproduct;

@FindBy(name="cust_114")
public static WebElement sel_PIDSTTAUS ;

@FindBy(css="input[name='CASE_RESOLUTIONCODE']")
public static WebElement pic_ComplaintCategory;


@FindBy(name="cust_1349")
public static WebElement ent_mobileForDedupe;

@FindBy(xpath="//a[@data-autoid='FlowNext']")
public static WebElement clk_NextOnCasePage;


@FindBy(xpath="//span[normalize-space()='Enter Customer Details']")
public static WebElement bttn_enterCustomerDetails;

@FindBy(xpath="//span[normalize-space()='Tag Customer']")
public static WebElement bttn_tagCustomer;

@FindBy(xpath="//span[normalize-space()='Switch Case']")
public static WebElement clk_SwitchCase;

@FindBy(css="a[data-autoid='FlowNext']")
public static WebElement clk_casesaveandproceed ;

@FindBy(css="select[data-autoid='pagesize_listing']")
public static WebElement clk_pagingdropdownlist ;


@FindBy(css="a[data-autoid='abcFilter_M']")
public static WebElement clk_sortingM ;

@FindBy(css="div[title='Product']")
public static WebElement clk_productssorting ;

@FindBy(css="select[name='CASE_ORIGIN']")
public static WebElement clk_casesource ;





}

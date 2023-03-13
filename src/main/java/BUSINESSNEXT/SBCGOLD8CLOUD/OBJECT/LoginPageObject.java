package BUSINESSNEXT.SBCGOLD8CLOUD.OBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject
{
	public LoginPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

 @FindBy(id="TxtName")
 public static WebElement txt_userName ;

 @FindBy(id="TxtPassword")
 public static WebElement txt_password ;


 @FindBy(name="command")
 public static WebElement btn_loginButton ;

 @FindBy(name="ProfileImage_header")
 public static WebElement clk_ProfileImage_header ;

 @FindBy(linkText="Logout")
 public static WebElement clk_logoutButton ;
 @FindBy(css="select[data-autoid='pagesize_listing']")
 public static WebElement clk_pagingdropdownlist ;

 }



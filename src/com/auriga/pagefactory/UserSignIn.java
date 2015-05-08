package com.auriga.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.auriga.common.Log;
import com.auriga.factorydata.FirstSign;

public class UserSignIn 
{
	protected WebDriver driver;
	private By userLoginText = By.xpath("//span[@class='profile-name-cont']");
	private By loginEmail = By.xpath("//input[@class='form-control login-user']");
	private By loginPassword = By.xpath("//input[@placeholder='Enter Password']");
	private By loginButton = By.xpath("//button[text()='Login']");
	private By loginErrorMsg = By.xpath("//div[text()='Invalid Username or Password.']");
	private By loginFacebookText = By.xpath("//a[@href='/auth/facebook']");
	private By loginFacebookEmail = By.id("email");
	private By loginFacebookPass = By.id("pass");
	private By loginFacebookButton = By.id("u_0_2");
	private By loginGoogleText = By.xpath("//a[@class='social-btn gp-btn']");
	private By loginGoogle = By.id("grant_heading");
	private By loginGoogleCancelButton = By.id("submit_deny_access");
	private By loginGoogleAcceptButton = By.id("submit_approve_access");
	private By popupPage = By.xpath("//div[@id='LandingPopup']/div/div/div[1]/button");
	private By signin = By.xpath("//a[text()=' Sign In ']");
	
	public UserSignIn(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void clickPopUp()
    {
	   driver.findElement(popupPage).click();
	}
	
	
	public void addLoginDetails()
	   {
		   //driver.findElement(loginEmail).sendKeys(MainPage.Signin.enterYourEmail);    (use later)
		  // driver.findElement(loginPassword).sendKeys(MainPage.Signin.password);       (use later)
		
		   Log.info("Adding Login Details");
		   driver.findElement(signin).click();
		   driver.findElement(loginEmail).sendKeys(FirstSign.Signin.emailid);    
		   driver.findElement(loginPassword).sendKeys(FirstSign.Signin.password);   
		   driver.findElement(loginButton).click();
		   
	   }
}


package com.auriga.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.auriga.common.TestBaseSetUp;
import com.auriga.pagefactory.LogOut;
import com.auriga.pagefactory.UserSignIn;

public class SignInTest extends TestBaseSetUp
{
	private WebDriver driver;
	  
    UserSignIn usersign;
    LogOut out;

@BeforeClass
public void setup() 
{
	driver = getDriver();
	
	usersign = new UserSignIn(driver);
	out = new LogOut(driver);
}



@Test(priority = 0, enabled = true)
public void clickPopUpTest() 
{
	usersign.clickPopUp();
}

@Test(priority = 1, enabled = true)
public void addSigninDetailsTest() 
{
	usersign.addLoginDetails();
}


@Test(priority = 4, enabled = true)
public void Test()
{
	out.logoutButtonClick();
	
}

}

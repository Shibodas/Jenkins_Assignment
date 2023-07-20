package testcases;

import org.testng.annotations.Test;

import base.Basepage;
import pages.LoginPage;

public class login extends Basepage{
	
	@Test
	public void login() {
		
		driver.findElement(LoginPage.user).sendKeys("Admin");
		driver.findElement(LoginPage.pass).sendKeys("admin123");
		driver.findElement(LoginPage.sub).click();
	}

}

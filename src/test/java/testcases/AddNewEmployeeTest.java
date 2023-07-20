package testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.log4j;
import base.Basepage;
import pages.HomePage;
import pages.LoginPage;
import pages.PimPage;

public class AddNewEmployeeTest extends Basepage{
	Logger log = log4j.getLogger(log4j.class);
	
	@Test
	public void AddNewEmployeeTes() throws InterruptedException  {
		//Thread.sleep(2000);
		
		driver.findElement(HomePage.pim_btn).click();
		log.info("pim button succesfully clicked");
		//Thread.sleep(2000);
		/*driver.findElement(PimPage.add_btn).click();
		Thread.sleep(1000);
		driver.findElement(PimPage.first_name).sendKeys("Shibo");
		driver.findElement(PimPage.middle_name).sendKeys("Das");
		driver.findElement(PimPage.last_name).sendKeys("Mallick");
		log.info("full name succesfully entered");
		Thread.sleep(2000);
		driver.findElement(PimPage.save_btn).click();
		Thread.sleep(1000);
		driver.findElement(PimPage.nickname).sendKeys("tubu");
		driver.findElement(PimPage.drv_license).sendKeys("GM1234");
		Thread.sleep(1000);
		driver.findElement(PimPage.SSN_number).sendKeys("5678");
		driver.findElement(PimPage.SIN_number).sendKeys("0000");
		Thread.sleep(1000);
		
		*/
		
	}

}

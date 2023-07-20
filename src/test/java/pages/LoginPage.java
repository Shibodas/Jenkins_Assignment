package pages;

import org.openqa.selenium.By;

import base.Basepage;

public class LoginPage extends Basepage{
	
	public static  By user = By.xpath("//input[@class=\"oxd-input oxd-input--active\"]");
	public static By pass = By.xpath("//input[@type=\"password\"]");
	public static By sub = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
}

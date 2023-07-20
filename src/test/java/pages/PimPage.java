package pages;

import org.openqa.selenium.By;

public class PimPage {
	public static By add_btn = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
	public static By first_name =By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\"]");
	public static By middle_name =By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]");
	public static By last_name = By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]");
	public static By save_btn = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
	public static By nickname = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input");
	public static By drv_license = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input");
	public static By SSN_number = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input");
	public static By SIN_number = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input");
}

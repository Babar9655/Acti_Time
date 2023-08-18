package Automation.Test_Script;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Automation.genericLib.Base_Class;
import Automation.genericLib.CommonUtilty;
import Automation.genericLib.DataUtility;

public class AlertHandling extends Base_Class{
	@Test(groups= {"system"})
	public void m1() throws IOException 
	{
		DataUtility du = new DataUtility();
		CommonUtilty cu = new CommonUtilty();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(du.getDataFromProperties("Url"));
		driver.findElement(By.name("username")).sendKeys(du.getDataFromProperties("Username"), Keys.TAB,
				du.getDataFromProperties("Password"), Keys.TAB, Keys.TAB, Keys.ENTER);
		driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings ")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.className("i")).click();
		driver.findElement(By.id("name")).sendKeys(du.getDataFromExcelSheet("Sheet1", 3, 1));
		driver.findElement(By.xpath("//input[@type='submit']/following-sibling::input[1]")).click();
		System.out.println(cu.alertgettext(driver));
		cu.alertdismiss(driver);
		driver.close();

	}
}
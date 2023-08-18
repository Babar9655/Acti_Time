package Automation.Test_Script;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Automation.genericLib.Base_Class;
@Listeners(Automation.genericLib.Listener_Implementation.class)
public class Create_Customer extends Base_Class {
	@Test()
	public void Create_Customer() throws EncryptedDocumentException, IOException {
		// DataUtility du = new DataUtility();
		// CommonUtilty cu = new CommonUtilty();
		int num = cu.getRandomNum();
		String custName = du.getDataFromExcelSheet("sheet1", 3, 1);
		custName = custName + num;
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.className("addNewButton")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameFiel")).sendKeys(custName);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		cu.textToBePresentInElementLocated(driver,By.xpath("//div[@class='titleEditButtonContainer']/div[1]"), custName);
		String expcustomername = driver.findElement((By) By.xpath("//div[@class='titleEditButtonContainer']/div[1]"))
				.getText();
		System.out.println(expcustomername);
	}
	

/*	@Test
	public void title() {
		System.out.println(driver.getTitle());
	}

	@Test
	public void Url() {
		System.out.println(driver.getCurrentUrl());
	}*/
	
}

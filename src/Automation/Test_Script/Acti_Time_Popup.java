package Automation.Test_Script;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Automation.genericLib.Base_Class;
import Automation.genericLib.CommonUtilty;
import elementRepository.Popups_Page;
import elementRepository.UserGroups;

public class Acti_Time_Popup extends Base_Class {
//	@Test(groups={"smoke","system"})
	@Test
	public void DragAndDrop() {
		Popups_Page pp = new Popups_Page(driver);
		// driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings
		// ")).click();
		pp.getSettingPopupClick().click();
		// driver.findElement(By.xpath("//div[contains(text(),'Manage system
		// settings')]/..")).click();
		pp.getClickGeneralSettings().click();
		// (this is for normal order)
//	List<WebElement> options=cu.getOptions(custom);
//	for(WebElement opt:options)
//	{
//		System.out.println(opt.getText());
//	}

		// List<WebElement> alloptions=;

		// (this is for reverse order)
		UserGroups ug=new UserGroups(driver);
		ug.fetchElements(cu);
//		WebElement custom = driver.findElement(By.id("userGroupNamingCodeSelect"));
//		ArrayList<String> all = new ArrayList<>();
//		for (WebElement options : cu.getOptions(custom)) {
//			all.add(options.getText());
//		}
//		Collections.sort(all);
//		System.out.println(all);
	}
}

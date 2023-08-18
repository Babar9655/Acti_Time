package elementRepository;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.genericLib.CommonUtilty;

public class UserGroups {
	
	@FindBy(id="userGroupNamingCodeSelect")private WebElement groupsGD;
	
	public UserGroups(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<String> fetchElements(CommonUtilty c) {
		ArrayList<String> all = new ArrayList<>();
		for (WebElement options : c.getOptions(groupsGD)) {
			all.add(options.getText());
		}
		Collections.sort(all);
		System.out.println(all);
		return all;
	}
	

}

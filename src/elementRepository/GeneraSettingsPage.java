package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneraSettingsPage {
	public GeneraSettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userGroupNamingCodeSelect")
	private WebElement usergroupsDD;
	
	@FindBy(id="FormModifiedTextCell")
	private WebElement getModificationMsg;
	
	public WebElement usergroupsDD()
	{
		return usergroupsDD;
	}
	public String getModificationMsg() 
	{
		return getModificationMsg.getText();
	}

}

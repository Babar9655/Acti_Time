package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popups_Page {
	public Popups_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".popup_menu_button.popup_menu_button_settings ")
	private WebElement SettingPopupClick;
	
	@FindBy(xpath="//div[contains(text(),'Manage system settings')]/..")
	private WebElement ClickGeneralSettings;
	
	
	public WebElement getSettingPopupClick()
	{
		return SettingPopupClick;
	}
	
	public WebElement getClickGeneralSettings()
	{
		return ClickGeneralSettings;
	}

}

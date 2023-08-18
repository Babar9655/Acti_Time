package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	public WebElement getusernameTB()
	{
		return usernameTB;
	}
	public WebElement getpasswordTB()
	{
		return passwordTB;
	}
	public WebElement getloginButton()
	{
		return loginButton;
	}
	
	public void loginApp(String un,String password)
	{
		usernameTB.sendKeys(un);
		getpasswordTB().sendKeys(password);
		getloginButton().click();
	}

}

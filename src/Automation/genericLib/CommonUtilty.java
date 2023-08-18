package Automation.genericLib;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilty {
	public int getRandomNum() {
		Random r = new Random();
		int num = r.nextInt(10000);
		return num;
	}
	
	public void alertOk(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public void alertdismiss(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public String alertgettext(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String value=alt.getText();
		return value;
	}
	public void textToBePresentInElementLocated(WebDriver driver,By locatot,String customername) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locatot, customername));
	}
	public void getSelectByVisibleText(WebElement dropdown,String visibleText)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}
	public void moveToElement(WebElement wb,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
	}
	public void  doubleClick(WebElement wb,WebDriver driver)
	{
		Actions act = new Actions (driver);
		act.doubleClick(wb).perform();
	}
    public void selectByVisibleText(WebElement wb,String text)
    {
    	Select s = new Select(wb);
    	s.selectByVisibleText(text);
    }
    
    public List<WebElement> getOptions(WebElement wb)
    {
    	Select s = new Select(wb);
    	List<WebElement> sb = s.getOptions();
		return sb;
    }
    
}

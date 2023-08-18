package Automation.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import elementRepository.Login_Page;

public class Base_Class {
	public WebDriver driver;
	public static WebDriver listenerDriver;
	public DataUtility du = new DataUtility();
	public CommonUtilty cu = new CommonUtilty();

	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() {
		
			EdgeOptions opt = new EdgeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(opt);
			listenerDriver=driver;
//		} else if (browser.equals("chrome")) {
//			ChromeOptions opt = new ChromeOptions();
//			opt.addArguments("--remote-allow-origins=*");
//			driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	@Parameters({"Url","Username","Password"})
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		driver.get(du.getDataFromProperties("Url"));
		Login_Page lp=new Login_Page(driver);
		lp.loginApp(du.getDataFromProperties("Username"), du.getDataFromProperties("Password"));
		//driver.findElement(By.id("loginButton")).click();
	}

	@AfterMethod(alwaysRun = true)
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}

	@AfterClass(alwaysRun = true)
	public void close() {
		driver.close();
	}
}

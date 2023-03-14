package cross_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verify_title {
WebDriver driver;
 @Test
 @Parameters("browser")
public void verifypagetitle(String browserName) {
	if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","E:\\Selenium_1.0\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_1.0\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(browserName.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver","E:\\Selenium_1.0\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
	}
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	driver.quit();
		
}

	

}


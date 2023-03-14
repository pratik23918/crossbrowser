package cross_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.concurrent.TimeUnit;
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_1.0\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		    capabilities.setCapability("marionette",true);  
		    WebDriver driver= new FirefoxDriver(capabilities);  
		          
		         // Launch Website  
		    driver.navigate().to("http://www.javatpoint.com/");  
	}

}

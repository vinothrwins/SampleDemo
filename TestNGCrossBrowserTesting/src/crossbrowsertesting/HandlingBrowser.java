package crossbrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandlingBrowser {

		public WebDriver driver;
		
		@Parameters({"browser","url"})
		//@Parameters("browser") - Single Parameter syntax
		@BeforeClass
	 		public void launchApplication(String browser,String url) {
			
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
						
			// Implicit Wait  - findelement and findelments ONLY
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Below code is only for the page load - Browser
			driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
			
			// Launch the Home URL
			driver.get(url);
	        
			// To Maximize Window
			driver.manage().window().maximize();
		  
			System.out.println("Application is launched");
	  }

		@AfterClass
		public void closeApplication() {
			driver.close();
			System.out.println("Application is Closed");
		}
}

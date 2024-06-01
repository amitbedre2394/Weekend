package Com.EC.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void init(String s) {
		if(s.equals("chrome")) {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
		else if(s.equals("firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dinesh\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.automationpractice.pl/index.php");
			
			
			
			
		}
			

}}

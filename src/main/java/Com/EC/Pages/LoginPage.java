package Com.EC.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EC.Base.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userid;
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pass;
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	private WebElement button;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void  login(String id, String pwd) {
		userid.sendKeys(id);
		pass.sendKeys(pwd);
		button.click();
		
		
	}
	
	}



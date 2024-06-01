package Com.EC.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EC.Base.BaseTest;

public class IndexPage extends BaseTest {
	
	      @FindBy(xpath="//img[@alt='My Shop']")
	      private WebElement logo;
	      @FindBy(xpath="//input[@id='search_query_top']")
	      private WebElement searchBox;
	      @FindBy(xpath="//a[@title='Log in to your customer account']")
	      private WebElement button;
	      
	      public IndexPage(WebDriver driver) {
	    	  PageFactory.initElements(driver,this);
	      }
	      
	      public Boolean verifylogo() {
	    Boolean logo2= logo.isDisplayed();    /// boolean  --- true or fase
	    return logo2;
	      }
	      
	      public LoginPage verifysearchBox(String input) {
	    	  searchBox.sendKeys(input);
	    	  button.click();
	    	  return new LoginPage(driver);
	    	  
	      }
	      

}

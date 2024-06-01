package Com.EC.TestCases;

import org.testng.annotations.Test;

import Com.EC.Pages.LoginPage;

public class LoginTest extends IndexTest {
	
	
	@Test
	public void verifyLogin() {
		LoginPage ref= new LoginPage(driver);
		ref.login("lirdorurdu@gufum.com", "Test@1234");
	}

}

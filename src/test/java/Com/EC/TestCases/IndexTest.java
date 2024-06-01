package Com.EC.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.EC.Base.BaseTest;
import Com.EC.Pages.IndexPage;

public class IndexTest extends BaseTest {
	
	IndexPage ref;
	@Test
	public void validatelogo() {
		 ref=new IndexPage(driver);
Boolean logo3=ref.verifylogo();
     Assert.assertTrue(logo3);

		
	}
	@Test
	public void validateserachBox() {
		ref.verifysearchBox("sneker for men");
	}
	
	

}

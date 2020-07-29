package automationpage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testmystore {

	mystorepageobject ms= new mystorepageobject();
	
	
	@Test
	public void displaytabs(){
		Assert.assertTrue(ms.women.isDisplayed());
		System.out.println(ms.women.getText());
		Assert.assertTrue(ms.dresses.isDisplayed());
		System.out.println(ms.dresses.getText());
		Assert.assertTrue(ms.tshirts.isDisplayed());
		System.out.println(ms.tshirts.getText());
	}
	
	@Test
	public void navigateb(){
		ms.women.click();
		Assert.assertTrue(ms.gettitle().contains("Women"));
		System.out.println(ms.gettitle());
		ms.navigateback();
		ms.dresses.click();
		Assert.assertTrue(ms.gettitle().contains("Dresses"));
		ms.navigateback();
		ms.tshirts.click();
		Assert.assertTrue(ms.gettitle().contains("T-shirts"));
		ms.navigateback();
	}
	
	@Test
	public void msg(){
		ms.newsletter.sendKeys("ckibrahimali@gmail.com");
		ms.btn.click();
		Assert.assertTrue(ms.getattribute(ms.newsletter()).contains("You have successfully subscribed to this newsletter."));
	//Assert.assertTrue(ms.gettext(ms.newsletter).equals("You have successfully subscribed to this newsletter."));
	}
	

	
	
}
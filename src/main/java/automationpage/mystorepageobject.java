package automationpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mystorepageobject extends basepage {

	public mystorepageobject(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement women;
	
	public WebElement women(){
		return women;
	}
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement dresses;
	
	public WebElement dresses(){
		return dresses;
	}
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	WebElement tshirts;
	
	public WebElement tshirts(){
		return tshirts;
	}
	
	
	@FindBy(xpath = "//*[@id='newsletter-input']")
	WebElement newsletter;
	
	public WebElement newsletter(){
		return newsletter;
	}
	
	
	@FindBy(xpath = "//*[@id='newsletter_block_left']/div/form/div/button")
	WebElement btn;
	
	public WebElement btn(){
		return btn;
	}
	
	@FindBy(xpath= "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement proceed;
	
	public WebElement proceed(){
		return proceed;
	}
	
	@FindBy(xpath="//*[@id='cart_quantity_up_3_13_0_0']/span/i")
	WebElement plusbtn;
	
	public WebElement plusbtn(){
		return plusbtn;
	}
	
	//@FindBy(xpath="//*[@id='total_price']")
	
	
	
	
}

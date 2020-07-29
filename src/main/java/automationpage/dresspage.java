package automationpage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dresspage extends basepage{

	public dresspage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBys(@FindBy(className= "product-container"))
	List <WebElement> s;
	
	public int count(){
		int a= s.size();
		return a;
	}
	
	@FindBy(xpath = "//*[@id='center_column']/h1/span[2]")
	WebElement num;
	
	public int num(){
		String a= num.getText();
		String b []= a.split(" ");
		System.out.println(b[2]);
		int ab= Integer.parseInt(b[2]);
		return ab;
	}
	
	
}

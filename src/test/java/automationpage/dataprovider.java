package automationpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launch(){
	System.setProperty("webdriver.chrome.driver", "D:\\ali\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@DataProvider(name= "login")
	public Object [][] data(){
		return new Object[][] {{"Admin" , "admin123"} ,{"Admin", "admin123"}, {"Admin", "admin123"}};
	}
	
	@Test(dataProvider= "login")
	
	public void verifylogin(String Username, String Password){
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	
}

	
	
	


package automationpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testannotation {

	/*@Test(priority= 1)
	public void testcase1(){
		System.out.println("testcase 1");
	}
	
	//@Test(priority= 1)
	public void testcase2(){
		System.out.println("testcase 2");
	}
	
	@Test
	public void testcase3(){
		System.out.println("testcase 3");
	}
	
	
	//@BeforeMethod
	public void beforemethod(){
		System.out.println("before method");
	}
	
	//@AfterMethod
	public void aftermethod(){
		System.out.println("after method");
	}
	
	//@BeforeClass
	public void BeforeClass(){
		System.out.println("BeforeClass");
	}
	
	//@AfterClass
	@Test
	public void AfterClass(){
		System.out.println("AfterClass");
	}
	
	
	
	//@BeforeTest
	@Test
	public void BeforeTest(){
		System.out.println("BeforeTest");
	}
	
	//@AfterTest
	@Test
	public void AfterTest(){
		System.out.println("AfterTest");
	}
	

	//@BeforeSuite
	@Test
	public void BeforeSuite(){
		System.out.println("BeforeSuite");
	}
	
	
	//@AfterSuite
	@Test
	public void AfterSuite(){
		System.out.println("AfterSuite");
	}*/
	public static WebDriver driver;
	@BeforeMethod
	public void launch(){
	System.setProperty("webdriver.chrome.driver", "D:\\ali\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@Test
	@Parameters({"Username", "Password"})
	public void parameters(String Username, String Password ) {
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	}

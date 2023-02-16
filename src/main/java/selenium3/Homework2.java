package selenium3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {

	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		@Test
		public void LoginTest1() {
	WebElement Username_Element = driver.findElement(By.xpath("//input[@id='username']"));
	WebElement Password_Element = driver.findElement(By.xpath("//input[@id='password']"));
	WebElement SignIn_Element = driver.findElement(By.xpath("//button[@name='login']"));
	
	Username_Element.sendKeys("demo@techfios.com");
	Password_Element.sendKeys("abc123");
	SignIn_Element.click();
 
	WebElement Dashboard_Element = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
	Assert.assertTrue("Dashboard page not found",Dashboard_Element.isDisplayed());
		
		
	WebElement Customers_Element = driver.findElement(By.xpath("//span[contains(text(),'Customers')]"));
	Customers_Element.click();
	
	WebElement AddCustomer_Element = driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
	AddCustomer_Element.click();
	ThreadSleep(2000);
	WebElement AddContact_Element = driver.findElement(By.xpath("//h5[contains(text(),'Add Contact')]"));
	Assert.assertTrue("Add Contact page not found",AddContact_Element.isDisplayed());
	
	driver.manage().window().maximize();
	WebElement FullNameAccount_Element = driver.findElement(By.xpath("//input[@id='account']"));
	WebElement Email_Element = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement Password1_Element = driver.findElement(By.xpath("//input[@id='password']"));
	WebElement ConfirmPassword_Element = driver.findElement(By.xpath("//input[@id='cpassword']"));
	WebElement Phone_Element = driver.findElement(By.xpath("//input[@id='phone']"));
	WebElement Address_Element = driver.findElement(By.xpath("//input[@id='address']"));
	WebElement City_Element = driver.findElement(By.xpath("//input[@id='city']"));
	WebElement State_Element = driver.findElement(By.xpath("//input[@id='state']"));
	WebElement ZipCode_Element = driver.findElement(By.xpath("//input[@id='zip']"));
	WebElement Company_Element = driver.findElement(By.xpath("//select[@id='cid']"));
	WebElement Currency_Element = driver.findElement(By.xpath("//select[@id='currency']"));
	WebElement Group_Element = driver.findElement(By.xpath("//select[@id='group']"));
	WebElement Country_Element = driver.findElement(By.xpath("//select[@id='country']"));
    WebElement Tags_Element = driver.findElement(By.xpath("//select[@id='tags']"));
	WebElement Save_Element = driver.findElement(By.xpath("//button[@id='submit']"));
	
    
	FullNameAccount_Element.sendKeys("Rachana Devkota");
	Email_Element.sendKeys("rachana@gmail.com");
	Password1_Element.sendKeys("xyz123");
	ConfirmPassword_Element.sendKeys("xyz123");
	Phone_Element.sendKeys("098dhtvj54321");
	Address_Element.sendKeys("Blue Gray Circle");
	City_Element.sendKeys("Reston");
	State_Element.sendKeys("Virginia");
	ZipCode_Element.sendKeys("234567");
	
ThreadSleep(2000);
	Select sel = new Select(Company_Element);
	sel.selectByVisibleText("Amazon");
	
	Select sel1 = new Select(Currency_Element);
	sel1.selectByVisibleText("USD");
	
	Select sel2 = new Select(Group_Element);
	sel2.selectByVisibleText("SQL");
	
	Select sel3 = new Select(Country_Element);
	sel3.selectByVisibleText("Nepal");
	
	Select sel4 = new Select(Tags_Element);
	sel4.selectByVisibleText("Ann");
	
	Save_Element.click();
	
	
		
		}
		private void ThreadSleep(int i) {
			// TODO Auto-generated method stub
			
		}
			
		}
			
		
	
		
			
		


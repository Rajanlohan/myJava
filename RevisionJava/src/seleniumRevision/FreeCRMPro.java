package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FreeCRMPro {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://classic.crmpro.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TesterUser");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rajan@012");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Home']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Calendar']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Companies']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Deals']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Tasks']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Cases']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Call']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Email']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Text/SMS']"))).build().perform();	
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Print']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Campaigns']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Docs']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Forms']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='New Contact']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='New Contact']")).click();
		
		Select value = new Select(driver.findElement(By.xpath("//select[@name='title']")));
		value.selectByVisibleText("Mr.");
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name='middle_initial']")).sendKeys("User");
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Auto");
		
		Select value1 = new Select(driver.findElement(By.xpath("//select[@name='suffix']")));
		value1.selectByVisibleText("III");
		driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys("Tester5");
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("Infoicon");
		driver.findElement(By.xpath("//input[@name='company_position']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='contact_lookup_sup']")).sendKeys("Rakesh");
		driver.findElement(By.xpath("//input[@name='contact_lookup_ass']")).sendKeys("Pintu");
		driver.findElement(By.xpath("//input[@name='contact_lookup_ref']")).sendKeys("Anisha");
				
		Select value2 = new Select(driver.findElement(By.xpath("//select[@name='category']")));
		value2.selectByVisibleText("Lead");
		
		Select value3 = new Select(driver.findElement(By.xpath("//select[@name='status']")));
		value3.selectByVisibleText("Active");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9758226727");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9758226727");
		driver.findElement(By.xpath("//input[@name='home_phone']")).sendKeys("0133202150");
		driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("Tfdv2153");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Tester5@infoicon");
		driver.findElement(By.xpath("//input[@name='email_alt']")).sendKeys("User@infoicon");
		driver.findElement(By.xpath("//input[@value='N']")).click();
		driver.findElement(By.xpath("//input[@name='receive_sms']")).sendKeys("No");
		driver.findElement(By.xpath("//input[@value='N']")).click();
		driver.findElement(By.xpath("//input[@name='im_id']")).sendKeys("Tester123345");
		
		Select value4 = new Select(driver.findElement(By.xpath("//select[@name='im_netowrk']")));
		value4.selectByVisibleText("Google Talk");
		
		driver.findElement(By.xpath("//input[@name='skype_id']")).sendKeys("Test456");
		
		Select value5 = new Select(driver.findElement(By.xpath("//select[@name='source']")));
		value5.selectByVisibleText("Import");
		
		driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("21/01/2000");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("mole on left hand");
		
		driver.findElement(By.xpath("//input[@name='address_title']")).sendKeys("Company address");
		
		Select value6 = new Select(driver.findElement(By.xpath("//select[@name='type']")));
		value6.selectByVisibleText("Shipping Address");
		
		driver.findElement(By.xpath("//*[@name='address']")).sendKeys("E-32, Sector-8, Noida");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Noida");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Uttar Pradesh");
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("201301");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("INDIA");
		driver.findElement(By.xpath("//input[@name='tags']")).sendKeys("public");
		driver.findElement(By.xpath("//*[@name='description']")).sendKeys("It is an e-commerce site company, where every employee works "
				+ "smartly with passion and dedication towards it.");
		
		Select value7 = new Select(driver.findElement(By.id("//select[@id='timezone']")));
		value7.selectByVisibleText("WET");
		
		Select value8 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		value8.selectByVisibleText("India");
		
		
		
	}

}

package firstRevisionStart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("TesterUser");
		driver.findElement(By.name("password")).sendKeys("Rajan@012");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
		Thread.sleep(2000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//*[text()='Calendar']")).click();

		String date = "33/May/2022";
		String dateArr[] = date.split("/");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";

		String dayList = null;
		boolean value = false;

		for (int r = 2; r <= 7; r++) {
			for (int c = 1; c <= 7; c++) {
				try {
					dayList = driver.findElement(By.xpath(beforeXpath + r + afterXpath + c + "]")).getText();
				} catch(NoSuchElementException e) {
					System.out.println("please enter a correct date");
					value = false;
					break;
				}

				System.out.println(dayList);
				if (dayList.equals(day)) {
					driver.findElement(By.xpath(beforeXpath + r + afterXpath + c + "]")).click();
					value = true;
					break;
				}
			}
			if (value) {
				break;
			}
		}

	}

}

package jtt;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Facebook {
	public static void main(String []args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","c:\\ashwini\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.name("firstname")).sendKeys("sannidhi");
		driver.findElement(By.name("lastname")).sendKeys("HS");
		driver.findElement(By.id("u_0_s")).sendKeys("7483819391");
		driver.findElement(By.id("u_0_x")).sendKeys("7483819391");
		//WebElement ele=driver.findElement(by.)
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.id("day")));
		//Thread.sleep(3000);
		//s.selectByValue("22");
	//WebElement l=new WebElement(s);
		Select s1=new Select(driver.findElement(By.id("month")));
		//Thread.sleep(3000);
		s1.selectByIndex(4);
		Select s2=new Select(driver.findElement(By.id("year")));
		//Thread.sleep(3000);
		s2.selectByIndex(5);
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_7")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_8")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("u_0_14")).click();
		Select s4=new Select(driver.findElement(By.name("preferred_pronoun")));
		s4.selectByIndex(2);
		driver.findElement(By.id("u_0_14")).click();
		
	//	driver.findElement(By.id("cookie-use-link")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8762554247");
		//driver.findElement(By.name("pass")).sendKeys("94493406");
		
		
		

		
		
		
		
		
	}

}

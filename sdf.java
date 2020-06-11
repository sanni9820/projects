package jtt;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sdf {
public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","c:\\ashwini\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.get("http://portalqa.pt-sdam.com/");
	driver.findElement(By.name("userName")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("12345");
	driver.findElement(By.name("submit")).click();
	driver.get("http://portalqa.pt-sdam.com/dashboard");
	driver.findElement(By.xpath("(//div[.='please Select']")).click();


}
}


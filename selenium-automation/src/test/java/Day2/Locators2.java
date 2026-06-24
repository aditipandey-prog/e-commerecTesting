package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
public static void main(String[] args) throws InterruptedException {
	String name="Paro";
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.findElement(By.xpath(" //div[@class='login-container']/p")).getText(),"You are successfully logged in.");
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
	
	
}
}

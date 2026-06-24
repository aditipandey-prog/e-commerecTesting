package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("paro");
	driver.findElement(By.className("reset-pwd-btn")).click();
	String passwordtxt=driver.findElement(By.cssSelector("p.infoMsg")).getText();
	String[] passwordArray= passwordtxt.split("'");
	String password= passwordArray[1].split("'")[0];
	System.out.println(password);
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("paro");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
}
}

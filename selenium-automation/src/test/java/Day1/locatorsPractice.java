package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsPractice {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("User");
	driver.findElement(By.name("inputPassword")).sendKeys("password");
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.id("chkboxTwo")).click();
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("paro");
	driver.findElement(By.className("reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("paro");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	System.out.println(driver.findElement(By.xpath(" //div[@class='login-container']/p")).getText());
}
}

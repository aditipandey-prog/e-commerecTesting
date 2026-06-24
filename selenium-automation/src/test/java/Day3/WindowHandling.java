package Day3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windowId=driver.getWindowHandles();
		Iterator<String>it= windowId.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
	String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("with")[0].split("at ")[1].trim();
		driver.switchTo().window(ParentId);
		driver.findElement(By.id("username")).sendKeys(email);
}
}

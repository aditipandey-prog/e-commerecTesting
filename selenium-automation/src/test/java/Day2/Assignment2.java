package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("Paro");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("QWERTY123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDownValue = new Select(dropDown);
		dropDownValue.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("10-11-1999");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());

	}
}

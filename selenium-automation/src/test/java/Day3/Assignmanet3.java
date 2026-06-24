package Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmanet3 {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--incognito");
	WebDriver driver = new ChromeDriver(options);
	//WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	
	//Login
	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");
	driver.findElement(By.xpath("//input[@value='user']")).click();
	WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
	driver.findElement(By.cssSelector("button#okayBtn")).click();
	WebElement ele=driver.findElement(By.xpath("//div[@class='form-group']/select"));
	Select role= new Select(ele);
	role.selectByValue("consult");
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("signInBtn")).click();
	
	//Add to Cart
	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button.btn")));
   List<WebElement>products=driver.findElements(By.cssSelector("button.btn"));
			for(WebElement product:products) {
			  product.click();	
			}
	
			//Proceed to checkout Page
		driver.findElement(By.cssSelector("a.btn")).click();
	
}
}

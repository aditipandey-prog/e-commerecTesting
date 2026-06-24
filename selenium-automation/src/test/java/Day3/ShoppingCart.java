package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise");
	driver.manage().window().maximize();
	List<WebElement>productList=driver.findElements(By.cssSelector("h4.product-name"));
	for(int i=0;i<productList.size();i++)
	{
		String productName=productList.get(i).getText();
		if(productName.contains("Cauliflower")) {
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
		}
	}
}
}

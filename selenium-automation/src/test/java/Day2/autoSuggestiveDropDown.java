package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	driver.findElement(By.id("autosuggest")).sendKeys("uni");
	Thread.sleep(1000);
	List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	for(WebElement option:options) {
		if(option.getText().equalsIgnoreCase("United States (USA)"))
		{
			option.click();
		}
	}
}
}

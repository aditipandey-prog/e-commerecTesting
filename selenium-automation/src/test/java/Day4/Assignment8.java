package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String expectedCountry= "United States (USA)";
		driver.findElement(By.id("autocomplete")).sendKeys("Uni");
		Thread.sleep(1000);
		List<WebElement> countryList= driver.findElements(By.className("ui-menu-item-wrapper"));
		for(int i=0;i<countryList.size();i++)
		{
			String country= countryList.get(i).getText();
			System.out.println(country);
			Actions action= new Actions(driver);
			action.keyDown(Keys.ARROW_DOWN).build().perform();
			if(country.equals(expectedCountry))
			{
				break;
			}
		}
		Assert.assertEquals(driver.findElement(By.id("autocomplete")).getAttribute("value"),expectedCountry);
	}

}

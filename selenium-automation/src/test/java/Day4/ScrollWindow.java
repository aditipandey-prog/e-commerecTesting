package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindow {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=3000");
		int totalAmount=0;
		List<WebElement> amounts=driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)"));
		for(int i=0;i<amounts.size();i++)
		{
			totalAmount+=Integer.valueOf(amounts.get(i).getText());
		}
		System.out.println(totalAmount);
}
 
}

package Day3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement footerDriver= driver.findElement(By.id("gf-BIG"));
	int size=footerDriver.findElements(By.tagName("a")).size();
	System.out.println(size);
	WebElement columnSizedriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columnSizedriver.findElements(By.tagName("a")).size());
    Thread.sleep(2000);
    String keysSet=Keys.chord(Keys.CONTROL,Keys.ENTER);
    for(int i=1;i<columnSizedriver.findElements(By.tagName("a")).size();i++)
    {
    	//driver.findElements(By.tagName("a")).get(i).click();
    	columnSizedriver.findElements(By.tagName("a")).get(i).sendKeys(keysSet);
    }
    
    Set<String> windows= driver.getWindowHandles();
    Iterator<String> it= windows.iterator();
    while(it.hasNext())
    {
    	driver.switchTo().window(it.next());
    	System.out.println(driver.getTitle());
    }
	
	}
		



}

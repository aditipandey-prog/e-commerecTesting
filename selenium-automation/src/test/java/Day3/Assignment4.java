package Day3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
public static void main(String[] args) {

	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.findElement(By.linkText("Click Here")).click();
	Set<String> windows= driver.getWindowHandles();
	Iterator<String> it= windows.iterator();
	String Parent = it.next();
	String child=it.next();
	driver.switchTo().window(child);
	System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
	driver.switchTo().window(Parent);
	System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
}
}

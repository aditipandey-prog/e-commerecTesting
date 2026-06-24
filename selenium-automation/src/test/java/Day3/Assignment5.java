package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {

		

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	     driver.switchTo().frame(driver.findElement(By.tagName("frame")));
	     int numberofFrame= driver.findElements(By.tagName("frame")).size();
	     driver.switchTo().frame(1);
	     System.out.println(driver.findElement(By.id("content")).getText());
	
	}

}

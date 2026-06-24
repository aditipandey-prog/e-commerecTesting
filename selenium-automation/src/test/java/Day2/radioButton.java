package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver driver=new ChromeDriver();
           driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       	driver.manage().window().maximize();
       	driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
       	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}

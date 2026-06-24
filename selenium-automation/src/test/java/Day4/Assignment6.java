package Day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String label1=driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		driver.findElement(By.id("checkBoxOption1")).click();
		Select dropdown= new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByContainsVisibleText(label1);
		driver.findElement(By.id("name")).sendKeys(label1);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert= driver.switchTo().alert();
		String alertText=alert.getText();
		alert.accept();
		String name= alertText.split(",")[0].split(" ")[1];
		Assert.assertEquals(name, label1);
		
		
	}

}

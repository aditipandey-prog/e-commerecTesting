package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			int colSize=driver.findElements(By.cssSelector("table.table-display th")).size();
			int rowSize= driver.findElements(By.cssSelector("table.table-display tr")).size();
			System.out.println("Column Size: "+colSize+ " Row Size: "+rowSize);
			List<WebElement>data =driver.findElements(By.cssSelector("table.table-display tr:nth-child(3) td"));
			for(int i=0;i<colSize;i++)
			{

				System.out.println(data.get(i).getText());
				
			}
	}

}

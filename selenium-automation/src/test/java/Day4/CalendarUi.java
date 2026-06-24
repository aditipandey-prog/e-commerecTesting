package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUi {
public static void main(String[] args) throws InterruptedException {
	String[] months = {
		    "January", "February", "March", "April", "May", "June",
		    "July", "August", "September", "October", "November", "December"
		};
	String date="15";
	String month="6";
	String year="2027";
	int monthNumber=Integer.valueOf(month);

	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
	//Year Selection
	driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
	driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
	
	String years=driver.findElement(By.cssSelector("button.react-calendar__navigation__label span")).getText();
	String[]yearsArr=years.split(" – ");
	
	//Month Selection
	
	/**driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
	List<WebElement> monthsOfCalendar=driver.findElements(By.xpath("//div[@class=\"react-calendar__viewContainer\"]/div/div/button"));
	for(int i=0;i<monthsOfCalendar.size();i++)
	{
		if(monthsOfCalendar.get(i).getText().equals(months[monthNumber-1]))
			monthsOfCalendar.get(i).click();
	}**/
	
}
}

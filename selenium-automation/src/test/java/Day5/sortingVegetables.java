package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sortingVegetables {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("span.sort-descending")).click();
	List<String> PriceList;
	do {
		List<WebElement> vegetables=driver.findElements(By.xpath("//td[1]"));
		 PriceList=vegetables.stream().filter(s->s.getText().contains("Strawberry"))
		.map(s->getPriceValue(s)).collect(Collectors.toList());
		if(PriceList.size()<1)
		{
			driver.findElement(By.xpath("//*[@aria-label='Next']")).click();
			Thread.sleep(2000);
		}
	}while(PriceList.size()<1);
	PriceList.stream().forEach(s->System.out.println(s));
	
	
}
public static void checkSortedList(WebDriver driver) {
	List<WebElement> vegetables=driver.findElements(By.cssSelector("table  tr td:nth-child(1)"));
	List<String >originalList=vegetables.stream().map(s->s.getText()).collect(Collectors.toList());
	//originalList.stream().forEach(s->System.out.println(s));
	List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
}
public static String getPriceValue(WebElement s) {
	String priceVal= s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return priceVal;
	
}
}

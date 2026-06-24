package Day3;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartMultiple {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise");
	driver.manage().window().maximize();
	List<WebElement>productList=driver.findElements(By.cssSelector("h4.product-name"));
	String [] itemList= {"Cauliflower","Potato"};
	int j=0;
	for(int i=0;i<productList.size();i++)
	{
		List neededItem=Arrays.asList(itemList);
		String productName=productList.get(i).getText().split("-")[0].trim();
		System.out.println(productName);
		if(neededItem.contains(productName))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==neededItem.size())
			{

			break;

			}
		}
		
		
	}
}
	
}

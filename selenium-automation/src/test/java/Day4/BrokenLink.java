package Day4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
public static void main(String[] args) throws MalformedURLException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	List<WebElement> urlList =driver.findElements(By.cssSelector("li.gf-li a"));
	for(int i=0;i<urlList.size();i++)
	{
		String urlExpected=urlList.get(i).getAttribute("href");
		HttpURLConnection conn=(HttpURLConnection) new URL(urlExpected).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode=conn.getResponseCode();
		System.out.println(respCode);
		if(respCode>=400) {
			System.out.println("Broken List Found !!!");
			break;
		}
	}
	
	
	
}
}

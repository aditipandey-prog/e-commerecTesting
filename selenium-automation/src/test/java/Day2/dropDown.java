package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
             WebDriver driver=new ChromeDriver();
             driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
             driver.manage().window().maximize();
             WebElement ele= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
             Select sel=new Select(ele);
             sel.selectByValue("AED");
             Thread.sleep(2000);
             sel.selectByIndex(0);
             Thread.sleep(2000);
             
             driver.findElement(By.className("paxinfo")).click();
             Thread.sleep(2000);
             int i=1;
             while(i<5) {
            	 driver.findElement(By.id("hrefIncAdt")).click();
            	 i++;
             }
             driver.findElement(By.id("btnclosepaxoption")).click();
             
           driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
             Thread.sleep(2000);
             driver.findElement(By.xpath("//a[@value='BLR']")).click();
             Thread.sleep(2000);
            // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();**/
             
             //Without index
             driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//             
	}

}

package Day6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class addToCart {
	
	
	@Parameters({"url"})
	@Test
public void selectItem(String urlname) {
	System.out.println("Items Selected");
	System.out.println(urlname);
}
	
	@Test
	public void addToCart() {
		System.out.println("Utems Added !!");
	}
}

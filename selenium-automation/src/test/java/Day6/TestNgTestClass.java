package Day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgTestClass {
	@Test(dataProvider="getData")
public void WebLogin(String username,String password) {
	System.out.println("Web Login Successful");
	System.out.println(username);
	System.out.println(password);
}
	@DataProvider
	public Object[][] getData() {
		Object[][]data= new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondtusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		
		
		return data;
	}

}

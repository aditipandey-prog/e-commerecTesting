package Day6;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChildClass extends parentClass {
@Test
	public void childStatement() {
		System.out.println("In child");
	}
@BeforeMethod
 public void beforestatement() {
	System.out.println("In child Before Method");
}
	
}

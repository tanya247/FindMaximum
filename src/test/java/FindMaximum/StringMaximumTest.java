package FindMaximum;
import org.junit.Test;
import org.junit.Assert;


public class StringMaximumTest {
	StringMaximum SM = new StringMaximum();
	@Test
	 public void givenMaximumStringAtPosition1_ReturnMaximumStringOfPosition1_TC1() {
		String result= SM.maximum("Name","Fruit","Apples");
		Assert.assertSame("Name",result);
	}
	@Test
	 public void givenMaximumStringAtPosition2_ReturnMaximumStringOfPosition2_TC2() {
		 String result=SM.maximum("Fruit","Name","Apples");
	     Assert.assertSame("Name",result);
	 }
	 @Test
	 public void givenMaximumStringAtPosition3_ReturnMaximumStringOfPosition3_TC3() {
		 String result= SM.maximum("Fruit","Apples","Name");
	     Assert.assertSame("Name",result);
	 }
}
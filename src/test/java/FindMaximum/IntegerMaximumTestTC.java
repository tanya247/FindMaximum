package FindMaximum;
import org.junit.Test;
import org.junit.Assert;


public class IntegerMaximumTestTC {
	IntegerMaximum IM = new IntegerMaximum();
	@Test
	 public void givenMaximumIntegerAtPosition1_ReturnMaximumIntegerOfPosition1_TC1() {
		Integer result= IM.maximum(7,5,1);
		Assert.assertSame(7, result);
	 }
	 @Test
	 public void givenMaximumIntegerAtPosition2_ReturnMaximumIntegerOfPosition2_TC2() {
		 Integer result=IM.maximum(1,15,4);
	     Assert.assertSame(15,result);
	 }
	 @Test
	 public void givenMaximumIntegerAtPosition3_ReturnMaximumIntegerOfPosition2_TC3() {
		 Integer result= IM.maximum(15,3,40);
	     Assert.assertSame(40,result);
	 }
}

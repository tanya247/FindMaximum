package FindMaximum;
import org.junit.Test;
import org.junit.Assert;


public class IntegerMaximumTestTC {
	IntegerMaximum IM = new IntegerMaximum();
	@Test
	 public void givenMaximumIntegerAtPosition1_ReturnMaximumIntegerOfPosition1_TC1() {
		Integer result= IM.maximum(3,4,5);
		Assert.assertSame(5, result);
	 }
	 @Test
	 public void givenMaximumIntegerAtPosition2_ReturnMaximumIntegerOfPosition2_TC2() {
		 Integer result=IM.maximum(3,5,4);
	     Assert.assertSame(5,result);
	 }
	 @Test
	 public void givenMaximumIntegerAtPosition3_ShouldReturnIntegerOfPosition3() {
		 Integer result= IM.maximum(5,3,4);
	     Assert.assertSame(5,result);
	 }
}

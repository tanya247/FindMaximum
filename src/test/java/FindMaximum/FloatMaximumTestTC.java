package FindMaximum;
import org.junit.Test;
import org.junit.Assert;


public class FloatMaximumTestTC {
	FloatMaximum FM = new FloatMaximum();
	@Test
	public void givenMaximumFloatAtPosition1_ReturnMaximumFloatOfPosition1_TC1() {
		Float result= FM.maximum(7.5f,5.6f,1.0f);
		Assert.assertEquals(7.5, result, 0.0f);
	}
	@Test
	public void givenMaximumFloatAtPosition2_ReturnMaximumFloatOfPosition2_TC2() {
		Float result= FM.maximum(5.6f,7.5f,1.0f);
		Assert.assertEquals(7.5, result, 0.0f);
		
	} 
	@Test
	public void givenMaximumFloatAtPosition3_ReturnMaximumFloatOfPosition3_TC3() {
		Float result= FM.maximum(1.0f,5.6f,7.5f);
		Assert.assertEquals(7.5, result, 0.0f);
		
	 }
}
package FindMaximum;
import org.junit.Test;
import org.junit.Assert;

public class Refactor1TestTC {
	@Test
	public void ReturnMaximizedFloat_WhenVariableIsFloatTC2() {
		Refactor1<Float> r = new Refactor1<Float>(7.5f,1.5f,2.0f);
		Float result = r.maximum(7.5f, 1.5f, 3.5f);
		Assert.assertEquals(7.5, result, 0.0f);
	}
	@Test
	public void ReturnMaximizedString_WhenVariableIsStringTC2() {
		Refactor1<String> r = new Refactor1<String>("Name","Fruit","Apples");
		String result = r.maximum("Name","Fruit","Apples");
		Assert.assertSame("Name",result);
	}
	@Test
	public void ReturnMaximizedInteger_WhenVariableIsIntegerTC2() {
		Refactor1<Integer> r = new Refactor1<Integer>(7,5,6);
		Integer result = r.maximum(7,5,6);
		Assert.assertSame(7,result);
	}
	
	
	
}
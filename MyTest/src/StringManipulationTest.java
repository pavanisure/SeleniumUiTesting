import org.junit.Assert;
import org.junit.Test;

public class StringManipulationTest {

	@Test
	public void testComparingStringLengthNotSame() {
		StringManipulation s1 = new StringManipulation();
		Assert.assertFalse(s1.comparingStrings("pavani", "sai"));
	}
	
	@Test
	public void testComparingStringLengthSame() {
		StringManipulation s1 = new StringManipulation();
		Assert.assertTrue(s1.comparingStrings("pop", "pop"));
	}
	
	@Test
	public void testComparingStringLengthSameButDifferentValue() {
		StringManipulation s1 = new StringManipulation();
		Assert.assertTrue(s1.comparingStrings("pop", "sap"));
	}
	
	public void testComparingStringWhenNull() {
		StringManipulation s1 = new StringManipulation();
		Assert.assertTrue(s1.comparingStrings(null, null));
	}
	
	public void testComparingStringWhenEmpty() {
		StringManipulation s1 = new StringManipulation();
		Assert.assertTrue(s1.comparingStrings("", ""));
	}
}

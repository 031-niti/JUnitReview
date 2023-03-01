
import junit.framework.TestCase;

public class CalculatorTest3 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAddNumberPositive() {
		Calclator c1 = new Calclator();
		assertEquals(14, c1.addNumber(5, 9));
		assertEquals(57, c1.addNumber(5, 52));
	}
	
	public void testAddNumberNegative() {
		Calclator c1 = new Calclator();
		assertEquals(-4, c1.addNumber(5, -9));
		assertEquals(-107, c1.addNumber(-55, -52));
	}

}

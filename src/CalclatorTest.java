import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalclatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddNumberPositive() {
		Calclator c1 = new Calclator();
		assertEquals(14, c1.addNumber(5, 9));
		assertEquals(57, c1.addNumber(5, 52));
	}
	
	@Test
	void testAddNumberNegative() {
		Calclator c1 = new Calclator();
		assertEquals(-4, c1.addNumber(5, -9));
		assertEquals(-107, c1.addNumber(-55, -52));
	}

}

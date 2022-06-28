import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void addTest() {
		Calculation cal = new Calculation();
		assertEquals(10,cal.add(5,5));
	}
	
	@Test
	public void subTest() {
		Calculation cal = new Calculation();
		assertEquals(0,cal.sub(5,5));
	}

}

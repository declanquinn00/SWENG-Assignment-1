import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	
	@Test 
	public void testadd() {
		
		Calculator calc =new Calculator();
		String expectedResult ="100";
		String in = "50+50";
		
		assertEquals(calc.equate(in), expectedResult);
		
	}

	@Test
	public void testminus() {
		
		Calculator calc =new Calculator();
		String expectedResult ="10";
		String in = "100-90";
		
		assertEquals(calc.equate(in), expectedResult);
		
	}
	
}

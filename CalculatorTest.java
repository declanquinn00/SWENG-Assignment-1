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
	
	@Test 
		public void testMul() {
		
		Calculator calc =new Calculator();
		String expectedResult ="100";
		String in = "10*10";
		
		assertEquals(calc.equate(in), expectedResult);
		
	}
	
	@Test 
		public void testDivide() {
		
		Calculator calc =new Calculator();
		String expectedResult ="5";
		String in = "50/10";
		
		assertEquals(calc.equate(in), expectedResult);
	
	}
	
	@Test
	public void testNeg() {
		
		Calculator calc =new Calculator();
		String expectedResult ="-100";
		String in = "100-200";
		
		assertEquals(calc.equate(in), expectedResult);
		
	}
	
	
	@Test 
		public void testInput1() {
		
		Calculator calc =new Calculator();
		String expectedResult ="125";
		String in = "100+50/2";
		
		assertEquals(calc.equate(in), expectedResult);
	
	}
	@Test 
		public void testInput2() {
			
			Calculator calc =new Calculator();
			String expectedResult ="725";
			String in = "100+50/2*25";
			
			assertEquals(calc.equate(in), expectedResult);
		
	}
	
	@Test 
		public void testInput3() {
			
			Calculator calc =new Calculator();
			String expectedResult ="-76396";
			String in = "12435+34569-12345*10+50";
			
			assertEquals(calc.equate(in), expectedResult);
		
	}
	
}

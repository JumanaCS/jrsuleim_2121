/**
* @author Jumana Suleiman 
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class DieTester{
	private Die defaultDie;
	private Die fiveSidedDie;

	@Before
	public void setup(){
		defaultDie = new Die();
		fiveSidedDie = new Die(5);
	}

	@Test 
	public void testDefaultRoll(){
		int maxValue = 6;
		int minValue = 1;
		int rollValue = defaultDie.roll();
		assertTrue(rollValue >= minValue && rollValue <= maxValue);
	}

	@Test
	public void test5SideRoll(){
		int maxValue = 5;
		int minValue = 1;
		int rollValue = fiveSidedDie.roll();
		assertTrue(rollValue <= maxValue && rollValue >= minValue);
	}

	@Test
	public void testdefaultNumSides(){
		int numSides = defaultDie.getNumSides();
		assertEquals(numSides, 6);
	}

	@Test
	public void test5NumSides(){
		int numSides = fiveSidedDie.getNumSides();
		assertEquals(numSides, 5);
	} 

	@Test
	public void testGetDefaultResult(){
		int result = defaultDie.getResult();
		int rollValue = defaultDie.roll();
		assertEquals(rollValue, result);
	}

	@Test
	public void testGet5Result(){
		int result = fiveSidedDie.getResult();
		int rollValue = fiveSidedDie.roll();
		assertEquals(rollValue, result);
	}

	@Test
	public void testEqualsTrue(){
		assertEquals(true, defaultDie.equals(defaultDie));
	}

	@Test 
	public void testEqualsFalse(){
		assertEquals(false, defaultDie.equals(fiveSidedDie));
	}

	@Test 
	public void testDefaultToString(){
		//Die dieOne = defaultDie;
		assertEquals(defaultDie.toString(), "Num sides 6 result 1");
	}

	@Test 
	public void test5SideToString(){
		//Die dieOne = fiveSidedDie;
		assertEquals(fiveSidedDie.toString(), "Num sides 5 result 1");
	}
}
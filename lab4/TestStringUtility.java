import static org.junit.Assert.*;
import org.junit.*;

public class TestStringUtility {
    @Test
    public void testReverse() {
        assertEquals("this is sentence", StringUtility.reverse("sentence is this"));
        assertEquals("", StringUtility.reverse(""));
        assertEquals("sentence is this", StringUtility.reverse("This is Sentence"));
        assertEquals("sentence is this", StringUtility.reverse("This is    Sentence"));
        assertEquals("sentence is this", StringUtility.reverse("  This is    Sentence  "));
        assertEquals("this", StringUtility.reverse("this"));
        assertEquals("sentence this", StringUtility.reverse("THIS SENTENCE"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxOccuringCharacterException() {
        StringUtility.maxOccuringCharacter("");
    }

    @Test
    public void textMaxOccuringCharacter() {
        assertEquals('i', StringUtility.maxOccuringCharacter("iiiiiii"));
        assertEquals('i', StringUtility.maxOccuringCharacter("i"));
        assertEquals('i', StringUtility.maxOccuringCharacter("I"));
        assertEquals('t', StringUtility.maxOccuringCharacter("IiiTTTTTT"));
        assertEquals('a', StringUtility.maxOccuringCharacter("This is an apple"));
        assertEquals('i', StringUtility.maxOccuringCharacter("Iiijjj"));
        assertEquals('i', StringUtility.maxOccuringCharacter("Iii1234jjj"));

    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtility.isPalindrome(""));
        assertTrue(StringUtility.isPalindrome("aa"));
        assertFalse(StringUtility.isPalindrome("abc"));
        assertTrue(StringUtility.isPalindrome("abcba"));
        assertTrue(StringUtility.isPalindrome("the eht"));
        assertFalse(StringUtility.isPalindrome("This is not"));
    }
}

package test;

import com.palindromechekerstartup.PalindromeChecker;
import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeCheckerTest
{
    @Test
    public void checkTruePalindrome()
    {
        Boolean result = new PalindromeChecker().isPalindrome("abba");
        assertEquals("The true palindrome was not detected", result, true);
    }

    @Test
    public void checkNegativePalindrome()
    {
        Boolean result = new PalindromeChecker().isPalindrome("abbae");
        assertEquals(result, false);
    }

    @Test(expected = NullPointerException.class)
    public void checkNullPalindrome()
    {
        new PalindromeChecker().isPalindrome((char[]) null);
    }

    @Test
    public void checkTruePalindromeOnOneChar()
    {
        Boolean result = new PalindromeChecker().isPalindrome("x");
        assertEquals(result, true);
    }

    @Test
    public void checkTruePalindromeOnEmptyString()
    {
        Boolean result = new PalindromeChecker().isPalindrome("");
        assertEquals(result, true);
    }

    @Test
    public void checkTruePalindromeVeryBig()
    {
        char[] bytes = new char[100000000];
        Arrays.fill(bytes, 'a');

        Boolean result = new PalindromeChecker().isPalindrome(new String(bytes));
        assertEquals(result, true);
    }

    @Test(expected = OutOfMemoryError.class)
    public void checkTruePalindromeTooBig()
    {
        char[] bytes = new char[2000000000];
        Arrays.fill(bytes, 'a');

        new PalindromeChecker().isPalindrome(bytes);
    }

    @Test
    public void checkNegativePalindromeVeryBig()
    {
        char[] bytes = new char[100000000];
        Arrays.fill(bytes, 'a');

        Boolean result = new PalindromeChecker().isPalindrome(new String(bytes) + "b");
        assertEquals(result, false);
    }
}
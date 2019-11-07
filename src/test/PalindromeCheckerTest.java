package test;

import com.palindromechekerstartup.PalindromeChecker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeCheckerTest
{
    @Test
    public void checkTruePalindrome()
    {
        Boolean result = new PalindromeChecker().isPalindrome("abba");
        assertEquals("The false palindrome was not detected", result, true);
    }
}
package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyBracketsReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void backwardBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void actualCorrectStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[does this bullshit work?]"));
    }

    @Test
    public void unevenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }

    @Test
    public void unevenBracketsReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }

    @Test
    public void curlyBraceReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
    }

    @Test
    public void curlyBraceReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));
    }

    @Test
    public void concatBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[" + "]"));
    }

    @Test
    public void stringBreakReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch\nCode"));
    }

//    I have no fucking clue what's going on. So much lost. Didn't even do the reading yet.
}

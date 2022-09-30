package test;

import org.junit.Test;

import static main.BonusBinarySearch.binarySearch;
import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testOne() {
        int[] tester = new int[] {1,2,3};
        assertEquals(binarySearch(tester, 1),0);
    }

    @Test
    public void testTwo() {
        int[] tester = new int[] {3,1,2};
        assertEquals(binarySearch(tester, 1),0);
    }
}

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void testSimpleExample() {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(1);
        nums1.add(3);

        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(2);

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertTrue(result == 2);
    }

    @Test
    public void testEvenNumberOfIntegers() {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(1);
        nums1.add(2);

        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(3);
        nums2.add(4);

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertTrue(result == 2.5);
    }

    @Test
    public void testThreeZeroes() {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(0);
        nums1.add(0);

        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(0);

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertTrue(result == 0);
    }

    @Test
    public void testFirstListEmpty() {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();

        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(1);

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertTrue(result == 1);
    }

    @Test
    public void testSecondListEmpty() {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(2);

        ArrayList<Integer> nums2 = new ArrayList<Integer>();

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertTrue(result == 2);
    }
}

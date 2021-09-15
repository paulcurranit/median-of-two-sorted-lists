import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void testSimpleExample() {
        List<Integer> nums1 = Arrays.asList(1, 3);

        List<Integer> nums2 = Collections.singletonList(2);

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertEquals(result, 2);
    }

    @Test
    public void testEvenNumberOfIntegers() {
        List<Integer> nums1 = Arrays.asList(1, 2);

        List<Integer> nums2 = Arrays.asList(3, 4);

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertEquals(result, 2.5);
    }

    @Test
    public void testThreeZeroes() {
        List<Integer> nums1 = Arrays.asList(0, 0);

        List<Integer> nums2 = Collections.singletonList(0);

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertEquals(result, 0);
    }

    @Test
    public void testFirstListEmpty() {
        List<Integer> nums1 = Collections.emptyList();

        List<Integer> nums2 = Collections.singletonList(1);

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertEquals(result, 1);
    }

    @Test
    public void testSecondListEmpty() {
        List<Integer> nums1 = Collections.singletonList(2);

        List<Integer> nums2 = Collections.emptyList();

        double result = MedianOfTwoSortedArrays.execute(nums1,nums2);
        assertEquals(result, 2);
    }
}

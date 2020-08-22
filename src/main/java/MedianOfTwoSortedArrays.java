import java.util.ArrayList;

public class MedianOfTwoSortedArrays {
    private static int INDEX1 = 0;
    private static int INDEX2 = 1;
    private static int INDEX = 0;
    private static int NEXTNUMBER = 1;

    public static double execute(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int length1 = nums1.size();
        int length2 = nums2.size();

        int totalLength = length1 + length2;
        boolean even = totalLength % 2 == 0;
        int midPoint = totalLength / 2 + totalLength % 2 - 1;

        int[] listIndicies = {0,0};
        int result = 0;

        while(listIndicies[INDEX1] + listIndicies[INDEX2] <= midPoint) {
            ArrayList<Integer> nextNumber = getNextInt(nums1, listIndicies[INDEX1],
                                                nums2, listIndicies[INDEX2]);

            if(listIndicies[INDEX1]  + listIndicies[INDEX2] == midPoint) {
                if(even) {
                    result += nextNumber.get(NEXTNUMBER);
                    listIndicies[nextNumber.get(INDEX)]++;
                    nextNumber = getNextInt(nums1, listIndicies[INDEX1],
                            nums2, listIndicies[INDEX2]);
                    result += nextNumber.get(NEXTNUMBER);
                    return result / 2.0;

                } else {
                    return nextNumber.get(NEXTNUMBER);
                }
            } else {
                listIndicies[nextNumber.get(INDEX)]++;
            }
        }

        return result;
    }

    private static ArrayList<Integer> getNextInt
            (ArrayList<Integer>nums1, int index1, ArrayList<Integer>nums2, int index2) {
        int int1 = 0;
        int int2 = 0;

        if(index1 < nums1.size()) {
            int1 = nums1.get(index1);
        } else {
            int1 = nums2.get(index2);
        }
        if(index2 < nums2.size()) {
            int2 = nums2.get(index2);
        } else {
            int2 = nums1.get(index1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(int1 < int2) {
            result.add(INDEX1);
            result.add(int1);
        } else {
            result.add(INDEX2);
            result.add(int2);
        }
        return  result;
    }
}

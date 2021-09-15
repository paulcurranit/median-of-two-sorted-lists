import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {
    private static final int INTEGERLIST1_INDEX = 0;
    private static final int INTEGERLIST2_INDEX = 1;
    private static final int INDEX = 0;
    private static final int NEXT_NUMBER_INDEX = 1;

    public static double execute(List<Integer> integerList1, List<Integer> integerList2) {
        int length1 = integerList1.size();
        int length2 = integerList2.size();

        int totalLength = length1 + length2;
        boolean combinedListEven = totalLength % 2 == 0;
        int midPointOfCombinedList = totalLength / 2 + totalLength % 2 - 1;

        int[] currentPositionOfArraysList = {0,0};
        int result = 0;

        while(currentPositionOfCombinedList(currentPositionOfArraysList) <= midPointOfCombinedList) {
            List<Integer> nextNumber = getNextInt(integerList1, currentPositionOfArraysList[INTEGERLIST1_INDEX],
                                                integerList2, currentPositionOfArraysList[INTEGERLIST2_INDEX]);

            if(currentPositionOfCombinedList(currentPositionOfArraysList) == midPointOfCombinedList) {
                if(combinedListEven) {
                    result += nextNumber.get(NEXT_NUMBER_INDEX);

                    currentPositionOfArraysList[nextNumber.get(INDEX)]++;
                    nextNumber = getNextInt(integerList1, currentPositionOfArraysList[INTEGERLIST1_INDEX],
                            integerList2, currentPositionOfArraysList[INTEGERLIST2_INDEX]);
                    result += nextNumber.get(NEXT_NUMBER_INDEX);

                    return result / 2.0;

                } else {
                    return nextNumber.get(NEXT_NUMBER_INDEX);
                }
            }

            currentPositionOfArraysList[nextNumber.get(INDEX)]++;
        }

        return result;
    }

    private static int currentPositionOfCombinedList(int[] currentPositionOfArraysList) {
        return currentPositionOfArraysList[INTEGERLIST1_INDEX] + currentPositionOfArraysList[INTEGERLIST2_INDEX];
    }

    private static List<Integer> getNextInt(
            List<Integer>nums1,
            int index1,
            List<Integer>nums2,
            int index2
    ) {
        int int1 = index1 < nums1.size() ? nums1.get(index1) : nums2.get(index2);
        int int2 = index2 < nums2.size() ? nums2.get(index2) : nums1.get(index1);

        List<Integer> result = new ArrayList<>();
        if(int1 < int2) {
            result.add(INTEGERLIST1_INDEX);
            result.add(int1);
        } else {
            result.add(INTEGERLIST2_INDEX);
            result.add(int2);
        }

        return  result;
    }
}

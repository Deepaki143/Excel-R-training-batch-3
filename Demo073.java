import java.util.*;
public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Original array: " + Arrays.toString(array));
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        for (int num : array) {
            if (!set.add(num)) {
                duplicateSet.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicateSet);
    }
}

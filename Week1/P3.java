package Week1;
import java.util.Set;
import java.util.HashSet;
public class P3 {
    public static boolean arePermutations(int[] seq1, int[] seq2) {
        // Check if the sizes of the sequences are the same
        if (seq1.length != seq2.length) {
            return false;
        }

        // Convert sequences to sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : seq1) {
            set1.add(num);
        }
        for (int num : seq2) {
            set2.add(num);
        }

        // Check if the sets are equal
        return set1.equals(set2);
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(arePermutations(new int[]{1, 2, 3, 4}, new int[]{4, 3, 2, 1})); // YES
        System.out.println(arePermutations(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4})); // YES
        System.out.println(arePermutations(new int[]{1, 2, 3}, new int[]{1, 2, 4}));        // NO
    }
}

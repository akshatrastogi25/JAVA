import java.util.HashSet;
import java.util.Set;

public class HashMet {
    public static void main(String[] args) {
        int[] array = { 0, 1, 0, -2, 4, -4, 6, 7, 9, 8 };
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (set.add(array[i]) == false) {
                System.out.println("Duplicate elements are : " + array[i]);
            }
        }
    }
}
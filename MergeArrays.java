
import java.util.Arrays;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        // Remove the vacant cells represented by 0 from X
        int m = X.length;
        int n = Y.length;
        int i = m - 1; // Index of last element in X
        int j = n - 1; // Index of last element in Y
        int k = m + n - 1; // Index of last vacant cell in X

        while (j >= 0) {
            if (i >= 0 && X[i] > Y[j]) {
                X[k] = X[i];
                i--;
            } else {
                X[k] = Y[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        // Ensure X has enough space to accommodate merged elements
        int m = X.length;
        int n = Y.length;
        int[] mergedArray = Arrays.copyOf(X, m + n);

        // Merge X and Y
        mergeArrays(mergedArray, Y);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}

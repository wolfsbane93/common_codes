package commonCode;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] arg) {
        boolean swapped ;
        int[] arr = {4, 8, 3, 6, 70};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}

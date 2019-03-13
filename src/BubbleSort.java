import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        assert n > 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scann.nextInt();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

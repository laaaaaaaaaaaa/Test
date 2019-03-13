import java.util.Random;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        assert n > 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scann.nextInt();
        }

        sort (arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void  sort(int [] arr, int l , int r){
        if (l>=r){
            return;
        }
        int p = partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    }
    public static  int partition (int [] arr, int l , int r){

        int v = arr[l];
        int j = l;

        for (int i = l+1 ; i <=r ; i++){
            if (arr[i]<v){
                j++;
                swap(arr,j,i);

            }

        }

        swap(arr,l,j);
        return j;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

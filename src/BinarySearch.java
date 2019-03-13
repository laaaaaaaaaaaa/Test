import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner scann = new Scanner (System.in);
        int n = scann.nextInt();
        assert  n >0;
        int [] arr = new int [n];
        for (int i = 0 ; i < n ; i ++){
            arr[i] = scann.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Please input a target!");
        int target = scann.nextInt();
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if (arr[mid] == target){
                System.out.println(mid);
               break;
            }else if (arr[mid] < target){
                l++;
            }else{
                r--;
            }
       }
        if (l>r){
            System.out.println(-1);
        }
    }
}

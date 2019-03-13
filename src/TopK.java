import java.util.Scanner;

public class TopK {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Please input k and n");
        int k = scann.nextInt();
        int n = scann.nextInt();
        assert n > 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scann.nextInt();
        }
        int index = getTopK(arr, 0,n-1, k);
        if (index!=-1){
            for (int i = 0 ; i <k ; i++){
                System.out.print(arr[i]+" ");
            }
        }

    }

    public static int getTopK(int[] arr, int start,int end,int k) {

        int p = 0 ;
        if (start<end){
            p = partition(arr,start,end );
            if (p == k) {
                p = k;
            } else if (p < k) {
                p =  getTopK(arr,p+1,end,k-p);
            } else {
                p = getTopK(arr,start,p-1,k);
            }
        }
        return  p;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int l, int r) {

        //arr[l,j] > v arr[j+1,i) < v
        int v = arr[l];
        int j = l;

        for (int i = l + 1; i <= r; i++) {
            if (arr[i] > v) {
                j++;
                swap(arr, j, i);

            }

        }
        swap(arr, l, j);
        return j;
    }

}


public class MaxHeap{
    int [] data;
    int count;
    int capacity ;

    public MaxHeap (int capacity){
        data = new  int[capacity+1];
        this.capacity = capacity;
        count = 0;
    }

    public int getCount() {
        return count;
    }
    public boolean isEmpty(){
        return count == 0 ;
    }

    public void insert(int item){
       assert count + 1 <=capacity;
       data[count+1] = item;
       count++;
       shiftUp(count);

    }

    public  MaxHeap(int[] arr){
        this.capacity = arr.length;
        data = new int[capacity+1];
        for (int i = 0 ; i < arr.length ; i++){
            data[i+1] = arr[i];
        }
        this.count = arr.length;
        for (int i = count/2 ; i >0;i--){
            shiftDown(i);
        }

    }
    public int extractMax(){
        assert count>0;
        int res = data[1];
        swap(data,1,count);
        count--;
        shiftDown(1);
        return res;

    }
    public int getMax(){
        assert count>0;
        return data[1];

    }
    private void shiftUp(int k){

        while ( k > 1 && data[k/2]<data[k]){
            swap(data,k,k/2);
            k/=2;
        }
    }
    private void shiftDown(int k){
       while (2*k <= count ){
           int j  = 2*k;
           if (j+1<=count && data[j+1]>data[j]){
               j = j+1;
           }
           if (data[j]<data[k]){
               break;
           }
           swap(data,k,j);
           k = j ;

       }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        int N = 10;
        int M = 20;
        for( int i = 0 ; i < N ; i ++ )
            maxHeap.insert( new Integer((int)(Math.random() * M)) );

        int[] arr = new int[N];

        for( int i = 0 ; i < N ; i ++ ){
            arr[i] = maxHeap.extractMax();
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
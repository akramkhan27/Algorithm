// take an element place it in its correct order

public class a03InsertionSort {
    public static void InsertionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=arr.length;
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
        InsertionSort(arr,n);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}

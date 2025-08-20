// push the max element to the last by adjacent swaps
public class a02BubbleSort {
    public static void BubbleSort(int[] arr,int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        BubbleSort(arr,n);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}

public class a05QuickSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
        quickSort(arr,0,arr.length-1);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int partitionIndex=  partition(arr, low, high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}

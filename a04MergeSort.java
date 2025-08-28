public class a04MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length-1);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }

    public static void mergeSort(int[] arr,int low, int high){
        if(low>=high)
            return;
        
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int left=low;
        int right=mid+1;
        int[] temp=new int[high-low+1];
        int i=0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[i++]=arr[left];
                left++;
            }
            else{
                temp[i++]=arr[right];
                right++;
            }
        }

        while(left<=mid){
            temp[i++]=arr[left];
            left++;
        }
        while(right<=high){
            temp[i++]=arr[right];
            right++;
        }
        // for(int e: temp){
        //     System.out.print(e+" ");
        // }
        System.out.println();
        for(int j=low, k=0;j<=high;j++,k++){
            arr[j]=temp[k];
        }
    }
}

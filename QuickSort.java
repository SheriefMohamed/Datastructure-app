package quicksort;
public class QuickSort {
    public static void main(String[] args) {
       int [] arr = new int[]{2,5,6,4,3,1,8,10,9,7}; 
       recQuickSort(arr,0,arr.length-1);
       for(int i=0 ; i<arr.length ; i++){
           System.out.print(arr[i] + " ");
       }
        System.out.println("");
    }  
                                                                //Swap
    public static void swapp(int arr[],int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
                                                                //Partition
    public static int partition(int arr[],int left,int right,int pivot){
        int leftP = left-1;
        int rightP = right+1;
        while(true){
            while(arr[++leftP] < pivot){}
            while(arr[--rightP]>pivot && rightP > 0 ){}
            if(leftP >=rightP)
                break;
            else
                swapp(arr,leftP,rightP);
        }
        swapp(arr,leftP,right);
        return leftP;
    }
    
    public static void recQuickSort(int arr[],int left,int right){
        if(right - left <= 0) {
        } else{
            int pivot = arr[right];
            int partition = partition(arr,left,right,pivot);
            recQuickSort(arr,left,partition-1);
            recQuickSort(arr,partition+1,right);
        }
    }
}

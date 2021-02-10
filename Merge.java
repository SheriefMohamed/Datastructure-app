package merge;
public class Merge {
    
    public static void main(String[] args) {
        int [] arr = new int []{2,3,5,8,7,6,4,1,10,9};
        recMergeSort(arr,0,arr.length-1);
        for (int i : arr){ 
            System.out.println(i);
        }
    }                                                           //  MergeSort
    public static void recMergeSort(int[]arr,int n1,int n2){
        if(n1==n2){}
        else{
            int mid=(n1+n2)/2;
            recMergeSort(arr,n1,mid);
            recMergeSort(arr,mid+1,n2);
            merge(arr,n1,mid,mid+1,n2);
        }
    }                                                           //  Merge
    public static void merge(int[]arr,int n11,int n12,int n21,int n22){
        int [] temp = new int[arr.length];
        int i=n11, j=n21, k=0;
        while (i<=n12&&j<=n22){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while (i<=n12){
            temp[k++]=arr[i++];
        }
        while (j<=n22){
            temp[k++]=arr[j++];
        }
        for (i=n11,j=0;i<=n22;i++,j++){
            arr[i]=temp[j];
        }
    }
}    


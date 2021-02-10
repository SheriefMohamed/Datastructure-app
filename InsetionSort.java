package insetionsort;

class insertionS{
    private int[] data;
    private int nElement=0;
    
    public insertionS(int val){
        data = new int[val];
    }                                                       //insert
    public void insert(int val){
        data[nElement] = val;
        nElement++;
    }                                                       //display
    public void display(){
        for (int i = 0; i < nElement; i++) {
            System.out.print(data[i]+" ");
        }
                    System.out.println("");
    }                                                       //Insertion sort       
    public void insertion(){
        int i,j;
        for(i=1 ; i<nElement ; i++){
            int temp = data[i];
            j=i;
            while(j>0 && data[j-1]>=temp){
                data[j]=data[j-1];j--;
            }
            data[j]=temp;
        }
    }
}

public class InsetionSort {
  public static void main(String[] args) {
      insertionS arr = new insertionS(100);
        arr.insert(6); arr.insert(1); arr.insert(2); arr.insert(5); arr.insert(4); arr.insert(3);
        arr.display();
        arr.insertion();
        arr.display();
    }
}

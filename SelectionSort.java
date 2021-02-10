package selectionsort;

class sesort{
    private int[] data;
    private int nElement=0;
    
    public sesort(int val){
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
    }                                                       //selection sort
    public void SelectionSorting(){
        int swap;
        for(int i=0 ; i<nElement-1 ; i++){
            int min=i;
            for(int j=i+1; j<nElement ; j++){
                if(data[j]<data[min]){
                    min = j;
                }
            }
            swap = data[i];
            data[i]=data[min];
            data[min]=swap;
        }
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        sesort arr = new sesort(100);
        arr.insert(2); arr.insert(3); arr.insert(1); arr.insert(5); arr.insert(6); arr.insert(4);
        arr.display();
        arr.SelectionSorting();
        arr.display();
    }
}

package bubblesort;
class bubsort{
    private int[] data;
    private int nElement=0;
    
    public bubsort(int val){
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
    }                                                       //bubble sort
    public void bubbleSorte(){
        int temp;
        for(int i=nElement-1 ; i>0 ; i--){
            for(int j=0 ; j<i ; j++)
                if(data[j]>data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
        }
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        bubsort arr = new bubsort(100);
        arr.insert(2); arr.insert(3); arr.insert(1); arr.insert(5); arr.insert(6); arr.insert(4);
        arr.display();
        arr.bubbleSorte();
        arr.display();
    }
}

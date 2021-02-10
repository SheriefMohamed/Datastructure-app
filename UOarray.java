package uoarray;

import java.util.Scanner;

 class uoarraay{
    private int [] data;
    private int nElement=0;
    
    public uoarraay(int cap){
        data = new int[cap];
    }                                                   //insert
    public void insert(int newVal){
        data[nElement] = newVal;
        nElement++;
    }                                                   //Search
    public void search(int searchKey){
        int i=0;
        for( ; i<nElement ; i++){
            if(data[i] == searchKey){
                System.out.println("Found "+ searchKey);break;}
        }if(i==nElement){
        System.out.println("Not found "+searchKey);}
    }
                                                        //Delete
    public void delete(int searchKey){
        int i=0;
        for( ; i<nElement ; i++){
            if(data[i]==searchKey)
                break;
        }
        if(i<nElement){
        for(int j=i ; j<nElement ; j++){
            data[j]=data[j+1];
        }
        nElement--; System.out.println("Deleted .. !");}else
            System.out.println("Not found");
    }                                                  //display
    public void display(){
        for(int i =0 ;i<nElement ; i++)
            System.out.print(data[i]+" ");
            System.out.println("\nNelement >> "+nElement );
            System.out.println("");
    }
    
    }
public class UOarray {
    
    public static void main(String[] args) {
        int x;
        Scanner hi = new Scanner(System.in);
        x = hi.nextInt();
        uoarraay arr = new  uoarraay(x);
        arr.insert(1);arr.insert(2);arr.insert(3);arr.insert(4);arr.insert(5);arr.insert(6);
        arr.search(5);
        arr.delete(8);
        arr.display();
    }
}

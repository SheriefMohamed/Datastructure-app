package shellsort;
import java.util.Scanner;
public class ShellSort {
    static void shellSort(int theArray[],int nElems) {
	int j, i,h=1; 
	while(h <= nElems/3)
            h = h*3 + 1; 
        while(h>0){
            for(i=h; i<nElems; i++) {
                int temp = theArray[i];
                j = i; 
                while(j > h-1 && theArray[j-h] >= temp) {
                    theArray[j] = theArray[j-h];
                    j -= h;
                }
                theArray[j] = temp;
            } 
            h = (h-1) / 3; 
        } 
	}
    public static void main(String[] args) {
        int n;
	Scanner hi = new Scanner(System.in);
        n = hi.nextInt();
	int [] data = new int[n];
            for(int i=0 ; i<n ; i++){
        	data[i] = hi.nextInt();
            }
        shellSort(data,n);
        System.out.println("");
        for (int i : data){ 
            System.out.println(i);
        }
    }  
}

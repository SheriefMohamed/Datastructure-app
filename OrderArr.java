package orderarr;
class oarray{
    private int [] data;
    private int nElement;
    
    public oarray(int val){
        data = new int[val];
    }
    
    public void display(){                              //display
        for(int i=0 ; i<nElement ; i++)
            System.out.print(data[i]+" ");
        System.out.println("");
    }
    
    public boolean isFull(){                            //isFull
        return data.length == nElement;
        
    }
    
    public boolean isEmpty(){                           //isEmpty
        return data.length != nElement;
    }
    
    public void insert(int val){                        //insert
        int i = 0;
        for (; i < nElement; i++) {
            if(data[i]>val)
                break;
        }
        for(int j=nElement ; j>i ; j--){
            data[j] = data[j-1];
        }
        data[i]=val;nElement++;
    }
                                                       //Delete
    public Boolean delete(int searchKey){
        int max=nElement, med,min=0;
        while(true){
            med = (max+min)/2;
            if(data[med]==searchKey)
                break;
            else{
                if(searchKey < data[med])
                    max = med-1;
                else
                    min = med+1;
            }
            if(max<min)
                return false;
        }
        for(int j=med ; j<nElement;j++)
            data[j]=data[j+1];
        return true;
    }
                                                      //BinarySearch
    public boolean search(int searchKey){
        int min = 0;
        int max = nElement;
        int med;
        while(true){
            med = (max+min)/2;
            if(data[med]==searchKey)
                return true;
            else{
                if(searchKey < data[med])
                    max = med-1;
                else
                    min = med+1;
            }
            if(max<min)
                return false;
        }
    }
}
public class OrderArr {
    public static void main(String[] args) {
        oarray arr = new oarray(10);
        arr.insert(2); arr.insert(5); arr.insert(3); arr.insert(4); arr.insert(6); arr.insert(5);
        arr.display();
        System.out.println(arr.search(0));
        arr.delete(5);
        arr.display();
    }
}

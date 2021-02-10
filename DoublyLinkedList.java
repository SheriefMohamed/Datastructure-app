package doubly.linkedlist;
                                                //List class
class List{
    public int data;
    public List next;
    public List previos;
    
    public List(int item){
        data = item;
    }
    public void display(){
        System.out.print(data + " ");
    }
}

class doubblyList{
    private List first;
    private List last;

    public doubblyList(){
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insertFirst(int val){
        List newVal = new List(val);
        if(isEmpty())
            last = newVal;
        else
            first.previos = newVal;
        newVal.next = first;
        first = newVal;
    }
    
    public void insertLast(int val){
        List newVal = new List(val);
        if(isEmpty())
            first = newVal;
        else{
            last.next = newVal;
            newVal.previos = last;}
        last = newVal;
    }
    
    public int deleteFirst(){
        List temp = first;
        if(first.next == null)
            last = null;
        else
            first.next.previos = null;
        first = first.next;
        return temp.data;
    }
    
    public int deleteLast(){
        List temp = last;
        if(first.next == null)
            first = null;
        else
            last.previos.next = null;
        last = last.previos;
        return temp.data;
    }
    
    public void DistplayList(){
        System.out.print("The List : ");
        List current = first;
        while (current != null){            
            current.display();
            current = current.next;
        }
        System.out.println("");
    }
    
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        doubblyList x = new doubblyList();
        x.insertFirst(4);
        x.insertFirst(3);
        x.insertFirst(2);
        x.insertFirst(1);
        x.insertLast(5);
        x.insertLast(6);
        x.insertLast(7);
        x.insertLast(8);
        x.DistplayList();
        System.out.println("Deleted > " + x.deleteFirst());
        x.DistplayList();
        System.out.println("Deleted > " + x.deleteLast());
        x.DistplayList();
    }  
}

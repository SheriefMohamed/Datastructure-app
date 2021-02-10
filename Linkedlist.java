package linkedlist;
                                                //List class
class List{
    public int data;
    public List next;
    
    public List(int item){
        data = item;
    }
    public void display(){
        System.out.print(data + " ");
    }
}
                                                //Linked list Class
class MainList{
    private List first;
    private List last;
    private int count;
    
    public MainList(){
        first = last = null;
        count = 0;
    }
    
    public boolean isEmpty(){
        return first==null;
    }
    
    public void insertFirst(int item){
        List newElement = new List(item);
        if(isEmpty())
            last = newElement;
        newElement.next = first;
        first = newElement;
        count++;
    }
    
    public void insertLast(int item){
        List newElement = new List(item);
        if(isEmpty())
            first = newElement;
        last.next = newElement;
        last = newElement;
        count++;
    }
                                                //Reverse Linked list
    public void reverse(){
        List curr,hold,prev;
        prev = null;
        curr = first;
        hold = curr.next;
        while(hold != null){
            hold = curr.next;
            curr.next = prev;
            prev = curr;
            curr = hold; 
        }
        first = prev;
    }
    
    public void displayList(){
        System.out.print("The list : ");
        List current = first;
        while(current!= null){
            current.display();
            current = current.next;
        }
        System.out.println("");
        System.out.println("Count = " + count);
    }
}
                                                //Main class
public class Linkedlist {
    public static void main(String[] args) {
        MainList x = new MainList();
        x.insertFirst(4);
        x.insertFirst(3);
        x.insertFirst(2);
        x.insertFirst(1);
        x.insertLast(5);
        x.insertLast(6);
        x.insertLast(7);
        x.insertLast(8);
        x.displayList();
        x.reverse();
        x.displayList();
    } 
}

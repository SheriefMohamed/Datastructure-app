package stack.linkedlist;

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
    
    public int delete(){
        List temp = first;
        first = first.next;
        count--;
        return temp.data;
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

class LinkedStack{
    private MainList mylist;

    public LinkedStack() {
        mylist = new MainList();
    }
    
    public void push(int val){
        mylist.insertFirst(val);
    }
    
    public int pop(){
        return mylist.delete();
    }
    
    public void display(){
        mylist.displayList();
    }
    
}

public class StackLinkedList {
    public static void main(String[] args) {
        LinkedStack x = new LinkedStack();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        x.display();
        x.pop();
        x.display();
    }  
}

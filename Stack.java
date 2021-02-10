package stack;

class SStack{
    private int[] arr;
    private int top ;
    private int max;
    
    public SStack(int max){
        top = -1;
        this.max = max;
        arr = new int[max];
    }
    
    public void push(int val){
        if(isEmpty()){
            arr[++top] = val;
        }
    }
    
    public int pop(){
        return arr[top--];
    }
    
    public int peak(){
        return arr[top];
    }
    
    public boolean isFull(){
        return (top == max-1);
    }
    
    public boolean isEmpty(){
        return (top != max-1);
    } 
    public void prent(){
        for(int i=0 ; i<=top ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}

public class Stack {
    public static void main(String[] args) {
        SStack x = new SStack(5);
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        x.prent();
        System.out.println(x.pop());
        x.prent();
        System.out.println(x.peak());
        x.prent();
    }
}

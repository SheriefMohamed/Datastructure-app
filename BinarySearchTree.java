package binarysearchtree;
                                                    //NodeClass
class node{
    public int data;
    public node leftP;
    public node rightP;
    
    public void display(){
        System.out.print(data + " ");
    }
}

class BSTree{
    public node root;
                                                    //Insert
    public void insert(int item){
        node newVal = new node();
        newVal.data = item;
        if(root == null){
            root = newVal;
        }else{
            node current = root;
            node up;
            while(true){
                up = current;
                if(item <current.data){
                    current = current.leftP;
                    if(current == null){
                        up.leftP = newVal;
                        return;
                    }
                }
                else{
                    current = current.rightP;
                    if(current == null){
                        up.rightP = newVal;
                        return;
                    }   
                }
            }
        }
    }
                                                    //Search
    public boolean search(int item){
        node current = root;
        while(current.data != item){
            if(item < current.data)
                current = current.leftP;
            else
                current = current.rightP;
            if(current == null)
                return false;
        }
        return true;
    }
                                                    //1 - inOrder display
    private void inOrder(node LocRoot){
        if(LocRoot != null){
            inOrder(LocRoot.leftP);
            LocRoot.display();
            inOrder(LocRoot.rightP);
        }
    }
                                                    //2 - preOrder display
    private void preOrder(node LocRoot){
        if(LocRoot != null){
            LocRoot.display();
            preOrder(LocRoot.leftP);
            preOrder(LocRoot.rightP);
        }
    }
                                                    //3 - postOrder display
    private void postOrder(node LocRoot){
        if(LocRoot != null){
            postOrder(LocRoot.leftP);
            postOrder(LocRoot.rightP);
            LocRoot.display();
        }
    }                                               //Main display function
    public void mainDisplay(){
        System.out.print("PreOrder >> " );
        preOrder(root);
        System.out.print("\nInOrder >> " );
        inOrder(root);
        System.out.print("\nPostOrder >> " );
        postOrder(root);
        System.out.println("");
    }
}

public class BinarySearchTree {

    public static void main(String[] args) {
        BSTree x = new BSTree();
        x.insert(5);
        x.insert(2);
        x.insert(3);
        x.insert(4);
        x.insert(6);
        x.insert(1);
        x.mainDisplay();
        if(x.search(5) == true)
            System.out.println("Search (5) >> Found " + 5);
        else
            System.out.println("Search (5) >> Not found ... !");
        if(x.search(7) == true)
            System.out.println("Search (7) >> Found " + 7);
        else
            System.out.println("Search (7) >> Not found ... !");
    }
}

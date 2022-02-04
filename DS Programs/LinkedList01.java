

// A simple Java program to introduce a linked list
/**
 * LinkedList01
 */

// linkedList traversing
public class LinkedList01 {
    Node head; //head node

    static class Node{//static class has made so that main can access thisc
        int data;
        Node next;
        Node (int d){
            data=d;
            next=null;
        }
    }
    // to create simple linkedList with 3 nodes
    public static void main(String[] args) {
        LinkedList01 llist=new LinkedList01();

        //allocating the nodes
        llist.head=new Node(10);
        Node second=new Node(27);
        Node third=new Node(3);

        //linking node to the next node
        llist.head.next=second;
        second.next=third;
        // third.next=null;
        llist.printList();
        
    }
    
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " --> ");
            n = n.next;
        }
        System.out.print("null");
    }
}
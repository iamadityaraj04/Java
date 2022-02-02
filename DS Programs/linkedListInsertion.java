//  inserting a node 

public class linkedListInsertion {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next =null;
        }
    }
    // inserting a node in front
    // public void push(int new_data){
    //     Node new_node=new Node(new_data);
    //     new_node.next=head;
    //     head=new_node;
    // }
    //inserting node after given node
    public void insertAfter(Node prev_node, int new_data){
        if(prev_node==null){
            System.out.println("Given node can not be null");
            return;
        }
        else{
            Node new_node=new Node(new_data);
            new_node.next=prev_node.next;
            prev_node.next=new_node;
        }
    }
    public void display(){
        Node n = head;
        while (n!=null) {
            System.out.print(n.data+" -> ");
            n=n.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        linkedListInsertion list=new linkedListInsertion();

        list.head=new Node(20);
        Node second= new Node(30);
        Node third=new Node(40);
        Node fourth=new Node(50);
        Node fifth=new Node(60);

        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        // System.out.println("Nodes before insertion:-");
        // list.display();

        // System.out.println("Nodes after insertion:-");
        // list.push(10);
        // list.display();
        list.insertAfter(second, 55);
        list.display();
    }
}

//printing the length of the linkedlist
public class linkedList02 {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        Node current=head;
        while (current!= null) {
            count++;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        linkedList02 llist=new linkedList02();

        llist.head=new Node(10);
        Node second=new Node(38);
        Node third=new Node(48);
        Node fourth=new Node(33);
        

        llist.head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.print("Length of the LinkedList: "+ llist.length());
        }    
}

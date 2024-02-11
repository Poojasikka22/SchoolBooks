public class LinkedList {
    Node head;
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(7);
        ll.insert(8);
        ll.insert(12);
        ll.show();
       // ll.reverse();
    }

    public void show() {
        Node node = new Node();
        while (node.next!= null)
        {
            node = node.next;
            System.out.println(node.data);
        }
        System.out.println(node.data);
    }

    public class Node{
        Node next;
        int data;
    }
    public void insert(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;

        if(head == null){
            node = head;
        }
        else
        {
            while(node.next!= null){
                node = node.next;
            }
            node.next = node;
        }
    }
    public void reverse(){
        Node cur = head;
        Node prev;
        Node temp;
        while(cur.next!=null){
            temp = cur.next;
            prev = cur;
            cur = temp;

        }
        head.next = null;
    }
}

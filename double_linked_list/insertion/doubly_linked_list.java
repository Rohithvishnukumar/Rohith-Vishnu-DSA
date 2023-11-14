package double_linked_list.insertion;
public class doubly_linked_list {

    class Node{
        Node prev;
        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void insert(int dataR){

        Node newNode = new Node(dataR);

        if(head == null){

            head = newNode;
            tail = newNode;

            head.data = dataR;
            head.prev = null;
        }

        else{
            Node current = tail;
            tail.next = newNode;
            tail = newNode;
            tail.prev = current;
            tail.data = dataR;
            tail.next=null;

        }
    }

    public void display(){

        Node trav = head;

        if(head == null){
            System.out.println("The list is empty");
        }

        else{
            while (trav != null) {
                System.out.println(trav.data);
                trav = trav.next;
            }
        }
    }

}

class Main1{
    public static void main(String[] args) {

        doubly_linked_list obj = new doubly_linked_list();

        obj.insert(12);
        obj.insert(23);
        obj.insert(456);
        obj.insert(315);
        obj.insert(68);
        obj.insert(18672);

        obj.display();
    }
}

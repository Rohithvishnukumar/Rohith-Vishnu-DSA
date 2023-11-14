package double_linked_list.insertion;
public class doubly_linked_add_begining {

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

            tail.data = dataR;
            tail.next = null;
        }

        else{
            Node current = head;
            head.prev = newNode;
            head = newNode;
            head.next = current;
            head.data = dataR;
            head.prev = null;
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

class Main2{
    public static void main(String[] args) {

        doubly_linked_add_begining obj = new doubly_linked_add_begining();

        obj.insert(45);
        obj.insert(67);
        obj.insert(723);
        obj.insert(99);
        obj.insert(3468);
        obj.insert(5727);

        obj.display();
    }
}

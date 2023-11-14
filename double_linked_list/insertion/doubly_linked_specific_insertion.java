package double_linked_list.insertion;
public class doubly_linked_specific_insertion {

    class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertEnd(int dataR) {

        Node newNode = new Node(dataR);

        if (head == null) {

            head = newNode;
            tail = newNode;

            head.data = dataR;
            head.prev = null;
        }

        else {
            Node current = tail;
            tail.next = newNode;
            tail = newNode;
            tail.prev = current;
            tail.data = dataR;
            tail.next = null;

        }
    }

    public void display() {

        Node trav = head;

        if (head == null) {
            System.out.println("The list is empty");
        }

        else {
            while (trav != null) {
                System.out.print(trav.data + ", " );
                trav = trav.next;
            }
        }
    }

    public void insertSpec(int index, int dataS) {

        Node newNode = new Node(dataS);

        Node pointer = head;

        int i = 0;

        while (i < index - 1) {
            pointer = pointer.next;
            i++;
        }

        Node temp = pointer.next;

        pointer.next = newNode;
        newNode.data = dataS;
        newNode.prev = pointer;
        newNode.next = temp;
        temp.prev = newNode;

    }
}

class Main_spec_inser{

    public static void main(String[] args) {

        doubly_linked_specific_insertion obj = new doubly_linked_specific_insertion();

        obj.insertEnd(34);
        obj.insertEnd(756);
        obj.insertEnd(99);
        obj.insertEnd(575);
        obj.insertEnd(112);
        obj.insertEnd(474);

        obj.display();

        obj.insertSpec(5, 7777777);

        System.out.println();

        obj.display();
    }
}

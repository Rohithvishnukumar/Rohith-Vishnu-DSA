package single_linked_list.insertion;
public class Singly_linked_specific_insertion {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int dataR) {

        Node newNode = new Node(dataR);

        if (head == null) {

            head = tail = newNode;
            head.data = dataR;
            tail.next = null;
        }

        else {
            tail.next = newNode;
            tail = newNode;
            tail.data = dataR;
            tail.next = null;
        }
    }

    public void display() {

        Node trav = head;

        if (head == null) {
            System.out.println("the list is empty");
        }

        else {

            while (trav != null) {
                System.out.print(trav.data + ", ");
                trav = trav.next;

            }
        }
    }

    public void specificIns(int index, int value) {

        Node current = head;
        int i = 0;

        Node newNode = new Node(value);

        while (i < index - 1) {

            current = current.next;
            i++;
        }

        Node temp = current.next;

        current.next = newNode;
        newNode.next = temp;
    }
}

class Main_Singly_linked_specific_insertion {

    public static void main(String[] args) {

        Singly_linked_specific_insertion obj = new Singly_linked_specific_insertion();

        obj.insert(45);
        obj.insert(65);
        obj.insert(2);
        obj.insert(6354);
        obj.insert(99);

        obj.display();

        obj.specificIns(3, 777);

        System.out.println();

        obj.display();
    }
}

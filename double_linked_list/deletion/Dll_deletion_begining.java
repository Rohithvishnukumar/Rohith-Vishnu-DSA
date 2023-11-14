package double_linked_list.deletion;

public class Dll_deletion_begining {

    class Node {
        Node prev;
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int dataR) {

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

    public void deleteFirst() {

        Node first = head.next;
        head = first;
        head.prev = null;
    }

    public void display() {

        Node trav = head;

        if (head == null) {
            System.out.println("The list is empty");
        }

        else {
            while (trav != null) {
                System.out.print(trav.data + ", ");
                trav = trav.next;
            }
        }
    }

}

class Main2 {
    public static void main(String[] args) {

        Dll_deletion_begining obj = new Dll_deletion_begining();

        obj.insert(333);
        obj.insert(2443);
        obj.insert(456);
        obj.insert(315);
        obj.insert(68);
        obj.insert(18672);

        obj.display();

        System.out.println();

        obj.deleteFirst();

        obj.display();
    }
}

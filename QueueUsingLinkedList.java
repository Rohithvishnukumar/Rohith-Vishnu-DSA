public class QueueUsingLinkedList {

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
            head = newNode;
            tail = newNode;

            head.data = dataR;
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
            System.out.println("the Queue is empty");
        }

        else {
            while (trav != null) {

                System.out.print(trav.data + ", ");
                trav = trav.next;
            }
        }
    }

    public void pop() {
        head = head.next;
    }

}

class Main_QueueUsingLinkedList {

    public static void main(String[] args) {

        QueueUsingLinkedList obj = new QueueUsingLinkedList();

        obj.insert(11);
        obj.insert(22);
        obj.insert(33);
        obj.insert(44);
        obj.insert(55);
        obj.insert(66);
        obj.insert(77);

        obj.display();

        obj.pop();

        System.out.println();

        obj.display();

    }
}

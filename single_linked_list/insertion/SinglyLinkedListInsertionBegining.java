package single_linked_list.insertion;

public class SinglyLinkedListInsertionBegining {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertAtBe(int dataR) {

        Node newNode = new Node(dataR);

        if (head == null) {

            head = tail = newNode;
            tail.data = dataR;
        }

        else {

            newNode.next = head;
            head = newNode;
            head.data = dataR;
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

}

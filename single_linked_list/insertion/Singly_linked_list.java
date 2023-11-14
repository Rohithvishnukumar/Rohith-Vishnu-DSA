package single_linked_list.insertion;
class Single_linked{
    
    class Node{

        Node next;
        int data;

        public Node(int data){
            next = null ;
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int dataR){

        Node newNode = new Node(dataR);

        if(head == null){
            head = newNode;
            tail = newNode;

            head.data = dataR;
        }

        else{
            tail.next = newNode;
            tail = newNode;
            tail.data = dataR;
            tail.next = null;
        }

    }


     public void display() { 
        
        Node current = head;
        
        if(head == null){
            System.out.println("The List is empty");
        }

        else{

            while(current.next != null){
                System.out.print(current.data + ", ");
                current = current.next;
            }
        }
    }    

}

class Main{
    public static void main(String[] args) {

        Single_linked obj = new Single_linked();

        obj.addNode(7);
        obj.addNode(3);
        obj.addNode(5);
        obj.addNode(8);
        obj.addNode(9);

        obj.display();
    }
}
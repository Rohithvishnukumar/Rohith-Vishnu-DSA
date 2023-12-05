package Stack;
public class StackOperationUsingArray {

    int top;
    int max;
    int[] arr;

    public StackOperationUsingArray() {
        top = -1;
        max = 10;
        arr = new int[max];
    }

    public void push(int value) {

        if (top == max - 1) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }

        else {
            ++top;
            arr[top] = value;
        }
    }

    public void pop() {

        if (top == -1) {
            System.out.println("The stack is empty cannot pop an element");
        }

        else {
            System.out.println("The removed element is: " + arr[top]);
            arr[top] = 0;
            --top;
        }
    }

    public void display() {

        for (int i = 0; i <= top; ++i) {
            System.out.print(arr[i] + ", ");
        }
    }
}

class Main_StackOperationUsingArray {

    public static void main(String[] args) {

        StackOperationUsingArray obj = new StackOperationUsingArray();

        obj.push(33);
        obj.push(44);
        obj.push(55);
        obj.push(66);
        obj.push(77);
        obj.push(88);
        obj.push(99);

        obj.display();

        System.out.println();

        obj.pop();

        obj.display();

    }
}
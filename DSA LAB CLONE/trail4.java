//  Coded b rohith vishnu 22BCE8755


import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }


    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }


    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
   
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }


            root.data = minValue(root.right);


            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }


    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null || root.data == key) {
            return root != null;
        }

        if (key < root.data) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }
}

class Main_Rohith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = new int[20];
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }


        BinarySearchTree bst = new BinarySearchTree();
        for (int number : numbers) {
            bst.insert(number);
        }

 
        System.out.println("Enter an element to insert into the BST:");
        int insertElement = scanner.nextInt();
        bst.insert(insertElement);

        System.out.println("Enter an element to delete from the BST:");
        int deleteElement = scanner.nextInt();
        bst.delete(deleteElement);

        System.out.println("Enter an element to search in the BST:");
        int searchElement = scanner.nextInt();
        if (bst.search(searchElement)) {
            System.out.println(searchElement + " is present in the BST.");
        } else {
            System.out.println(searchElement + " is not present in the BST.");
        }

        scanner.close();
    }
}

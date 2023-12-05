import java.util.LinkedList;

class HashTable {
    private static final int TABLE_SIZE = 10;
    private LinkedList<String>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
       
        return key.length() % TABLE_SIZE;
    }

    public void insert(String key, String value) {
        int index = hash(key);
        table[index].add(value);
    }

    public void display() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print("Index " + i + ": ");
            for (String value : table[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

class HashingExample {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();


        hashTable.insert("Rohith", "123-456");
        hashTable.insert("Vishnu", "789-012");
        hashTable.insert("Kumar", "345-678");
        hashTable.insert("Keerthi", "901-234");
        hashTable.insert("Gowthami", "567-890");


        hashTable.display();
    }
}

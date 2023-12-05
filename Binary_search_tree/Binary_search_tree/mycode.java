package Binary_search_tree;

public class mycode {

    int var = 0;
    int fin = 0;

    public int max(int[] arr1) {
        for (int i : arr1) {
            if (i > var && i > fin) {

                fin = i;
            }
            var = i;
        }
        return fin;
    }

    public int min(int[] arr1) {
        for (int i : arr1) {
            if (i < var && i < fin) {

                fin = i;
            }
            var = i;
        }
        return fin;
    }

    public void display(int[] vis) {

        for (int i : vis) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {

        int[] arr1 = { 78, 59, 896, 34, 102, 311, 2 };

        int roh = (arr1.length - 1);

        int[] copy = new int[roh + 1];

        mycode obj = new mycode();

        for (int j = 0; j < arr1.length; j++) {

            copy[j] = obj.max(arr1);
            copy[roh - j] = obj.min(arr1);

        }

        obj.display(copy);

    }

}

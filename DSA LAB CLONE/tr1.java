//  Coded by Rohith Vishnu Kumar

class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 6, 7, 3, 1, 15};
        
        System.out.println("Original array:");
        printArray(arr);
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("\nSorted array:");
        printArray(arr);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

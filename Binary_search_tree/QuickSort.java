import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {50, 20,35,10,45, 15, 30, 25};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        quickSort(array, 0, array.length - 1);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && array[i] <= pivot) {
                i++;
            }

            while (i <= j && array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap pivot with j
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;

        return j;
    }
}

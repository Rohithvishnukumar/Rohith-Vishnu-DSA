package Binary_search_tree;

class Merge_Sort {

    int beg, end;

    public void MergeSort(int arr[], int beg, int end) {

        if (beg < end) {

            int mid = (beg + end) / 2;

            MergeSort(arr, beg, mid);
            MergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);

        }

    }

    public void merge(int a[], int beg, int mid, int end) {

        
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        /* copy data to temp arrays */
        for (int r = 0; r < n1; r++)
            LeftArray[r] = a[beg + r];
        for (int v = 0; v < n2; v++)
            RightArray[v] = a[mid + 1 + v];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg; /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = RightArray[j];
            j++;
            k++;
        }

        for (int l : a) {

            // if (k == 4) {

                System.out.print(l + ", ");

            // }

        }

        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = { 12, 31, 25, 8, 32, 17,32,4,25,32,5432,5,42 };

        Merge_Sort obj = new Merge_Sort();

        obj.MergeSort(arr, 0, arr.length - 1);

    }

}
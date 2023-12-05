// ----------- Author: Rohith Vishnu Kumar (22BCE8755) ----------

import java.util.Scanner;

public class BinarySearchClass {

    boolean temp = false;

    public void binSearch(int[] arr, int first, int last, int key){

        int mid = (first + last)/2 ;

        while (first <= last) {

            if( arr[mid] > key){
                last = --mid;
            }
            else if (arr[mid] == key) {
                System.out.println("The element " + arr[mid] + " is successfully found at index " + mid);
                temp = true;
                break;
            }
            
            else{
                first = ++mid ;
            }

            mid = (first + last) / 2;
            
        }

        if(temp == false){
            System.out.println("The element is not found");
        }


    }
    
}

class BinarySearchClass_Main{

    public static void main(String[] args) {

        BinarySearchClass obj = new BinarySearchClass();

        int[] arr  = {12,33,42,51,66,73,87,99,101};

        System.out.print("Enter a key to search: ");

        Scanner scr = new Scanner(System.in);
        int var = scr.nextInt();

        obj.binSearch(arr, 0, (arr.length-1), var);
    }
}

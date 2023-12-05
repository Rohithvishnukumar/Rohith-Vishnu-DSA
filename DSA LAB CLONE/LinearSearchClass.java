//  Author:  Rohith Vishnu kumar (22BCE8755)

import java.util.Scanner;

public class LinearSearchClass {

    public boolean temp = false;
    
    public void linearSearch(int key, int[] arr){

        for(int i = 0 ; i < arr.length ; i++){

            if ( arr[i] == key) {
                System.out.println("The Element is found!!!!");
                temp = true;
            }
        }

        if(temp == false){
            System.out.println("The element is not found");
        }
    }
}

class LinearSearchClass_Main{

    public static void main(String[] args) {

        LinearSearchClass obj = new LinearSearchClass();

        int[] arr  = {2,4,6,8,10,13,15};

        System.out.print("Enter a key to search: ");

        Scanner scr = new Scanner(System.in);
        int var = scr.nextInt();

        obj.linearSearch(var, arr);
    }
}

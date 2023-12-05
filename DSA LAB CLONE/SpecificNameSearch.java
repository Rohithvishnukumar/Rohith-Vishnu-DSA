// Author Rohith vishnu (22BCE8755)

import java.util.Scanner;

class PersonSearch {

    static class Person {
        String name;
        int age;
        String city;

        Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
    }

    static Person linearSearch(Person[] people, String targetName) {
        for (Person var : people) {
            if (var.name.equals(targetName)) {
                return var;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        
        Person[] people = {
            new Person("Rohith", 18, "New York"),new Person("Vishnu", 30, "Los Angeles"),
            new Person("Kumar", 22, "Chicago"),
            new Person("Satya", 45, "Washington-DC")
         
        };

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name you want to search for: ");
        String targetName = scanner.nextLine();

        // Perform linear search
        Person result = linearSearch(people, targetName);

        // Display the result
        if (result != null) {
            System.out.println("Person found: " + result.name + ", Age: " + result.age + ", City: " + result.city);
        } else {
            System.out.println("Person with name '" + targetName + "' not found.");
        }
    }
}

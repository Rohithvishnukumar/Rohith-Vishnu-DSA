// Coded by Rohith vishnu kumar 22BCE8755

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    String address;
    double cgpa;

    Student(String name, int rollNumber, String address, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
        this.cgpa = cgpa;
    }
}

class StudentSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();


        Student[] students = new Student[numStudents];

        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Address: ");
            String address = scanner.next();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            
            students[i] = new Student(name, rollNumber, address, cgpa);
        }

        for (int i = 0; i < numStudents - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numStudents; j++) {
                if (students[j].cgpa < students[minIndex].cgpa) {
                    minIndex = j;
                }
            }

            
            Student temp = students[minIndex];
            students[minIndex] = students[i];
            students[i] = temp;
        }

        
        System.out.println("\nSorted List of Students based on CGPA:");
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Roll Number: " + student.rollNumber +
                    ", Address: " + student.address + ", CGPA: " + student.cgpa);
        }

        scanner.close();
    }
}

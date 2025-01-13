package student_search_app;

import java.util.Scanner;

public class StudentSearchApp {
    public static void main(String[] args) {
        String[] students = {"Xuân", "Hạ", "Thu", "Đông"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student name: ");

        String studentName = sc.nextLine();

        int index = -1;

        for (int i = 0; i < students.length; i++) {
            if (studentName.equals(students[i])) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + index);
        }

    }
}

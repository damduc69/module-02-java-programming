package count_student;

import java.util.Scanner;

public class CountPassingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_STUDENTS = 30;


        System.out.print("Nhập số lượng sinh viên (tối đa " + MAX_STUDENTS + "): ");
        int numberOfStudents = scanner.nextInt();


        if (numberOfStudents < 1 || numberOfStudents > MAX_STUDENTS) {
            System.out.println("Số lượng sinh viên không hợp lệ. Chương trình kết thúc.");
            return;
        }

        double[] scores = new double[numberOfStudents];
        int passed = 0;


        System.out.println("Nhập điểm của từng sinh viên:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Điểm của sinh viên thứ " + (i + 1) + ": ");
            double score = scanner.nextDouble();

            if (score < 0 || score > 10) {
                System.out.println("Điểm không hợp lệ. Vui lòng nhập điểm trong khoảng 0 đến 10.");
                i--;
                continue;
            }

            scores[i] = score;


            if (score > 5) {
                passed++;
            }
        }

        System.out.println("Tổng số sinh viên đã nhập: " + numberOfStudents);
        System.out.println("Số lượng sinh viên thi đỗ: " + passed);

        scanner.close();
    }
}

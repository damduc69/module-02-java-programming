package linearexample1;

import java.util.ArrayList;
import java.util.List;

public class LinearExample1 {

    public static void main(String[] args) {
        // Khai báo 1 danh sách sinh viên với mỗi sinh viên có 3 thuộc tính: id, name, age
        // và tạo 5 đối tượng sinh viên bất kỳ với dữ liệu khác nhau, thêm vào danh sách trên
        // -> Triển khai thuật toán tìm kiếm tuyến tính để tìm và in ra thông tin sinh viên
        // tại vị trí số 3 trong danh sách trên

        Student student1 = new Student(1, "Nguyen Van A", 20);
        Student student2 = new Student(2, "Nguyen Van B", 21);
        Student student3 = new Student(3, "Nguyen Van C", 22);
        Student student4 = new Student(4, "Nguyen Van D", 23);
        Student student5 = new Student(5, "Nguyen Van E", 24);

        List<Student> students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        int findId = 3;

        Student foundStudent = linearSearch(students, findId);

        if (foundStudent != null) {
            System.out.println("Student with ID " + findId + " found: " + foundStudent);
        } else {
            System.out.println("Student with ID " + findId + " not found.");
        }

    }

    public static Student linearSearch(List<Student> students, int findId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == findId) {
                return students.get(i);
            }
        }
        return null;
    }
}




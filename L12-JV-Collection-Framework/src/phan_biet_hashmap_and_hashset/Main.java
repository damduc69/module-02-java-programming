package phan_biet_hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van A", 20, "Ha Noi");
        Student student2 = new Student("Nguyen Van B", 21, "Ha Noi");
        Student student3 = new Student("Nguyen Van C", 22, "Ha Noi");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        System.out.println("====================================");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

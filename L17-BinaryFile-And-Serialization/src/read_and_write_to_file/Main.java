package read_and_write_to_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", "Ha Noi"));
        students.add(new Student(2, "Nguyen Van B", "Ha Noi"));
        students.add(new Student(3, "Nguyen Van C", "Ha Noi"));
        students.add(new Student(4, "Nguyen Van D", "Ha Noi"));
        students.add(new Student(5, "Nguyen Van E", "Ha Noi"));

        writeDataToFile("student.txt", students);
        List<Student> studentDataFroFile = readDataFromFile("student.txt");
        for (Student student : studentDataFroFile) {
            System.out.println(student);
        }

    }
}

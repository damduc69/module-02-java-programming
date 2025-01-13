package static_method;

public class main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1, "Number.01");
        Student s2 = new Student(2, "Number.02");
        s1.display();
        s2.display();
    }
}

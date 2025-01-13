package developer;

public class Developer {
    private long id;
    private String name;
    private int age;
    private String position;
    private double salary;

    public Developer(long id,  String name, int age, String position, double salary) {
        this.id = id;
        this.salary = salary;
        this.position = position;
        this.age = age;
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Developer(int id, String name, int age, String position, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

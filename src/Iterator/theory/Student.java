package Iterator.theory;

public class Student
{
    private String id,  name, major;
    private int age;

    public Student(String id, String name, int age, String major)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", major=" + major + "]";
    }
}

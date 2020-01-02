public class Student extends Person {

    private String classGroup;

    public String getClassGroup() {
        return classGroup;
    }

    public Student(String name, int age, int height, int stamina, String classGroup) {
        super(name, age, height, stamina);
        this.classGroup = classGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classGroup='" + classGroup + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", stamina=" + stamina +
                '}';
    }

    public void grow (int size)
    {
        height += size;
    }
}

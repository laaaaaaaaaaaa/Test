public class Student  implements  Cloneable{
     String name;
     int grade;
     Address address;

    public Student(String name, int grade,Address address) {
        this.name = name;
        this.grade = grade;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

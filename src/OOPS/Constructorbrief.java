package OOPS;

class Student{
    String name;
    int age;
    int roll_no;
    float marks;
    Student(String name, int age, int roll_no, float marks){
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        this.marks = marks;
    }
    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }

}

public class Constructorbrief {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 21, 2, 8.1f);
        Student s2=new Student(s1);
        System.out.println(s2.name);
    }
}

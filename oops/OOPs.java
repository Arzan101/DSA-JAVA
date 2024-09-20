package oops;

class Student {

    String name;
    int rollNumber;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.rollNumber = s2.rollNumber;

    }

    Student() {

    }
}

public class OOPs {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John Doe";
        s1.rollNumber = 12345;

        Student s2 = new Student(s1);
        s2.printInfo();

    }
}

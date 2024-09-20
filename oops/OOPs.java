package oops;

class Student {

    String name;
    int rollNumber;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;

    }
}

public class OOPs {

    public static void main(String[] args) {
        Student s1 = new Student("RAJA", 0);
        s1.printInfo();

    }
}

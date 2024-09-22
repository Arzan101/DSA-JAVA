package oops;

class triangle {

    public void area() {
        System.out.println();
        System.out.println("inheriting area");
    }
}

class Shapes extends triangle {

    public void curicum() {
        System.out.println("circumference");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        s1.area();
    }

}

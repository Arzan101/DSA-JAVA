package oops;

class Pen {

    String type;
    String Color;

    public void write() {
        System.out.println();
        System.out.println("Writing");
    }
}

public class OOPs {

    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.type = "ballpoint";
        pen1.Color = "black";
        pen1.write();
    }
}

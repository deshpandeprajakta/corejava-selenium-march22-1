package org.matrix.delta.rahul;

public class InstanceVariable {
    int a = 15;
    int b = 25;

    InstanceVariable() {
        System.out.println(a);
    }

    public void display() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        InstanceVariable e = new InstanceVariable();
        //System.out.println(a);
<<<<<<< HEAD

=======
        e.display();
>>>>>>> 8bc9b52b51fcf9f9cfbe3724b28180e8ca078ab5
    }
}

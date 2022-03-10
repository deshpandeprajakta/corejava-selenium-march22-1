package org.matrix.delta.ganesh;

public class MethodsConcept {

    int a = 500;
    int b = 5;

    public void name() {
        System.out.println("Name is Ganesh");
    }

    public static void age() {
        System.out.println("Age is 20");
    }

    public void division(int a, int b) {
        System.out.println("Division: " + (this.a + this.b));
        System.out.println("Division: " + (a + b));
    }

    public static void main(String[] args) {
        MethodsConcept methodsConcept = new MethodsConcept();
        methodsConcept.name();
//        methodsConcept.age();

        MethodsConcept.age();

        methodsConcept.division(100, 20);
    }

}

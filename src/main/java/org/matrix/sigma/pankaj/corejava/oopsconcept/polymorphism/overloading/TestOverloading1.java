package org.matrix.sigma.pankaj.corejava.oopsconcept.polymorphism.overloading;

public class TestOverloading1 {

    public void add(int a, int b) {
        System.out.println(a + b);

    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    public static void main(String[] args) {
        TestOverloading1 obj = new TestOverloading1();
        obj.add(50, 60);
        obj.add(50, 60, 70);

    }

}

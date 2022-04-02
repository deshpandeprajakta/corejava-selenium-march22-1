package org.matrix.delta.rahul.interfaceconcept;

public class Testclass implements TestInterface{
    @Override
    public void m1() {
        System.out.println(" i am the m1 method ");
    }

    @Override
    public void m2() {
        System.out.println("I Am the m2 Method");

    }

    public static void main(String[] args) {
        Testclass obj=new Testclass();
        obj.m1();
        obj.m2();
    }
}

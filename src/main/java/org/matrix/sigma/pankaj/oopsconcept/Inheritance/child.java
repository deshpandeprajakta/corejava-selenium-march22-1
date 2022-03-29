package org.matrix.sigma.pankaj.oopsconcept.Inheritance;

public class child extends Parent{

    public void s1(){
        System.out.println("child:: i am in s1 method");
    }


    public static void main(String[] args) {
        child obj = new child();
        obj.s1();
        obj.s2();

    }
}

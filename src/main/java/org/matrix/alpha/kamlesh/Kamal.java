package org.matrix.alpha.kamlesh;

public class Kamal { //In this Kamal is an object
    //Method declaration
    public void m1() { //Instance method example without static keyword
        System.out.println("I'm Poco method");
    }
    public static void m2() { //Static method example where I have used
        System.out.println("I'm Realme method");
    }

    public static void main(String[] args) { // This program is without parameters
        Kamal obj = new Kamal();
        obj.m1();
        Kamal.m2();

    }
}

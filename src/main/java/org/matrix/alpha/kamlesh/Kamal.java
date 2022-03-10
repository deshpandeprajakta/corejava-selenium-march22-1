package org.matrix.alpha.kamlesh;

public class Kamal { //In this Kamal is an object
    //Method declaration
    public void m1() { //Instance method example without static keyword
        System.out.println("First Name=Kamlesh");
    }
    public void m2() { //Static method example where I have used
        System.out.println("Last Name=Dandi");
    }
    public void m3(int age) {
        System.out.println("My age is " +age);
    }
    public void m4(int a, int b) {
        int c = a * b;
        System.out.println("Mutiplication of 10*20= " +c);
    }
    public static void m5(int a, int b) {
        int c = a + b;
        System.out.println("Addition of 10+20= " +c);
    }
    public static void m6(int a, int b, int c) {
        int d = a - b - c;
        System.out.println("Subtraction of 14-7-7= " +d);
    }
    public void m7(int a, int b) {
        int c = a / b;
        System.out.println("Division of 10 divided 2 = " +c);
    }
    public static void main(String[] args) { // This program is without parameters
        Kamal obj = new Kamal();
        obj.m1();
        obj.m2();
        obj.m3(23);
        obj.m4(10,20);
        m5(10,20);
        Kamal.m6(14,7,7);
        obj.m7(10,2);

    }
}

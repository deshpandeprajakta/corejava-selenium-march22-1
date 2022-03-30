package org.matrix.omega.madan.methods;

public class TestMethodCallingConcept {


    public void s1(){
        s3();
        System.out.println("I am in s1() method");

    }

    public static void s2() {

        System.out.println("I am in s2() Method");

        TestMethodCallingConcept Test1 = new TestMethodCallingConcept();
        Test1.s1();

    }

    public static void s3() {

        System.out.println("I am in s3() Method");

    }

    public static void main(String [] args){

        TestMethodCallingConcept Test2 = new TestMethodCallingConcept();
        Test2.s2();
        Test2.s3();


    }

}

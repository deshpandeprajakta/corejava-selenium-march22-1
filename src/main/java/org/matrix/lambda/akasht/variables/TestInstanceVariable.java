package org.matrix.lambda.akasht.variables;

public class TestInstanceVariable {

    int age = 100;
    /* TestInstanceVariable () {
       System.out.println(age);
     */

    public void display() {
        System.out.println(age);
    }

    public static void main(String[] args) {
         // Non static variable can not be used directly inside static methods
        //  System.out.println(age);

        // Object Creation

        TestInstatnceVariable Obj = new  TestInstatnceVariable();
    }
}

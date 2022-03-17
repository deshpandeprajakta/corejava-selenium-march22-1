package org.matrix.sigma.pankaj;

public class TestInstanceVariable {
 int age = 30;
    public void display(){
        System.out.println(age);
    }

    //public static void main(String[] args) {
       // System.out.println(age); //non static variable can't use directly inside static method

    //memory allocation
    TestInstanceVariable obj = new TestInstanceVariable();
}
}


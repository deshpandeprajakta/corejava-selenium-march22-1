package org.matrix.sigma.Shamshad;

public class TestInstanceVariable {
    int age = 100;

    TestInstanceVariable() {
        System.out.println(age);
    }

    public void display() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        TestInstanceVariable obj = new TestInstanceVariable();
        System.out.println();
    }
}


package org.matrix.sigma.kadambari;

public class TestVariables {
    int marks = 50; 
    int id = 10;

    public void display() {
        System.out.println(marks);
        System.out.println(id);
    }

    public static void main(String[] args) {
        TestVariables obj = new TestVariables();// object creation
        System.out.println(obj.marks); // by using object creation
        System.out.println(obj.id);
    }
}

package org.matrix.shriniwas.corejava;

public class TestMethodChainingOrCallingNew {
    Employee emp = new Employee();

    public void m1() {
        emp = new Employee();
        emp.getData(); // method calling
    }

    public void m2() {
        emp.getData();
    }

    public static void main(String[] args) {
        TestMethodChainingOrCallingNew obj = new TestMethodChainingOrCallingNew();
        obj.m1(); // method calling
        obj.m2();
    }
}

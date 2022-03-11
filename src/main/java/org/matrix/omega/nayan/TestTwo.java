package org.matrix.omega.nayan;

public class TestTwo {

     int year = 2022;

    public void display() {
        System.out.println(year);

    }

    public static void main(String[] args) {
        TestTwo obj = new TestTwo();
        System.out.println("JOINNING YEAR:" + obj.year);

        System.out.println("=======another class object=========");

        TestOne emp = new TestOne();
        System.out.println("ENAME :" + emp.empName);
        System.out.println("EID :" + emp.empId);


    }

}

package org.matrix.alpha.shamal.Contructor;

public class TestConstructor {

    int empId ; String empName; String cmpnName;

    public TestConstructor(){

        System.out.println("This is the No argument Constructor");
    }

    public TestConstructor(int empId , String empName , String cmpnName){

        empId = empId;
        empName = empName;
        cmpnName = cmpnName ;

    }

    public TestConstructor(String empName){

        empName = empName;
    }

    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor();
        /*Parameterised constructor*/
        TestConstructor obj1 = new TestConstructor(1001,"ShamalJadhav","ABC");
        TestConstructor obj2 = new TestConstructor("xyz");

    }
}

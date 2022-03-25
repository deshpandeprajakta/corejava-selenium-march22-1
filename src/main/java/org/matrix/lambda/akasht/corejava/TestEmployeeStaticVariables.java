package org.matrix.lambda.akasht.corejava;

public class TestEmployeeStaticVariables {

    int empId = 100;
    String empName = "Akash";
    String companyName = "Techsum";

    public void getdata(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(companyName);
    }

    public static void main(String[] args) {
        TestEmployeeStaticVariables emp1 = new TestEmployeeStaticVariables();
        emp1.getdata();

    }

}



package org.matrix.shriniwas.corejava;

public class EmployeeStaticVariables {

    int empId1 = 100;
    String empName1 = "Shri1";
    static String companyName = "ABC";

    int empId2 = 101;
    String empName2 = "Shri2";

    public void getData1() {
        System.out.println(empId1);
        System.out.println(empName1);
        System.out.println(EmployeeStaticVariables.companyName);
        System.out.println(Employee.company);
        System.out.println(companyName); // We can directly use static variables in static and non static methods
    }

    public void getData2() {
        System.out.println(empId2);
        System.out.println(empName2);
        System.out.println(EmployeeStaticVariables.companyName);
        System.out.println(Employee.company);
    }

    public static void main(String[] args) {
        EmployeeStaticVariables emp1 = new EmployeeStaticVariables();
        emp1.getData1();

        System.out.println("-------------------");

        EmployeeStaticVariables emp2 = new EmployeeStaticVariables();
        emp2.getData2();
    }
}

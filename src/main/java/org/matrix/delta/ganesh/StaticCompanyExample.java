package org.matrix.delta.ganesh;

public class StaticCompanyExample {

    static String companyName = "Google";

    int empID1 = 101;
    String empName1 = "A";


    int empID2 = 102;
    String empName2 = "B";


    public void getData1() {
        System.out.println("Emp ID:" + empID1);
        System.out.println("Emp Name:" + empName1);
        System.out.println("Company Name:" + companyName);
    }

    public void getData2() {
        System.out.println("Emp ID:" + empID2);
        System.out.println("Emp Name:" + empName2);
        System.out.println("Company Name:" + companyName);
    }

    public static void main(String[] args) {
        StaticCompanyExample staticCompanyExample = new StaticCompanyExample();
        staticCompanyExample.getData1();
        staticCompanyExample.getData2();
    }
}

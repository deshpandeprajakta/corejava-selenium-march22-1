package org.matrix.sigma.kadambari;

public class StudentStaticVariable {
    int studId1= 100;
    String studName1="shravi";
    static String schoolName="VRML School";

    int studId2 = 101;
    String studName2="shri";

    public void getData1(){
        System.out.println(studId1);
        System.out.println(studName1);
        System.out.println(StudentStaticVariable.schoolName);
        
    }
    public void getData2(){
        System.out.println(studId2);
        System.out.println(studName2);
        System.out.println(StudentStaticVariable.schoolName);
    }

    public static void main(String[] args) {
        StudentStaticVariable stud1 = new StudentStaticVariable();
        stud1.getData1();
        System.out.println("---------------");
        StudentStaticVariable stud2 = new StudentStaticVariable();
        stud2.getData2();
    }
}

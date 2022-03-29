package org.matrix.omega.madan.variables;

public class Student {

    public int studRollNo = 145;
    public String studName = "vishal";
    public static String studHouse = "VENUS";

    public void getData() {
        System.out.println(studName);
        System.out.println(studRollNo);
        System.out.println(studHouse);
    }

    public static void main (String [] args){

        Student obj1 = new Student();
        obj1.getData();
    }
}

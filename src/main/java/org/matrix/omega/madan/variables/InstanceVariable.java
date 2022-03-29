package org.matrix.omega.madan.variables;


public class InstanceVariable {

    String StudName = "kushal";
    static int StudRollNo = 20;
      public static void main (String [] args){

        System.out.println(StudRollNo);
        InstanceVariable obj2 = new InstanceVariable();
        System.out.println(obj2.StudName);
        Student stud = new Student();
        System.out.println(stud.studName);
        System.out.println(stud.studRollNo);
        stud.getData();

    }

    public static void display (){

       System.out.println(StudRollNo);
       InstanceVariable obj1 = new InstanceVariable();
       System.out.println(obj1.StudName);

    }

    public void display2(){

        System.out.println(StudName);
        System.out.println(StudRollNo);


    }
}

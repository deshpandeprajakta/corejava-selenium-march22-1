package org.matrix.alpha.shamal;

public class TestMethods {
    /* declaration of instance variables. */
    String name; // instance
    String division;//default instance
    int age;    // instance variable
  static  String cName; //static  instance variable



    /* Method to intialize an instance variable. */
    public void setName(String sname){
        name = sname;
    }

    public  void setCollegeName(String clgName){
        cName = clgName;
    }
    public void setDiv(String sdiv)
    {
        division = sdiv;
    }

    /* Method to intialize an instance variable. */
    public void setAge(int sage)
    {
        age = sage;
    }
    /*Method to intialize an instance variable.*/


    /* Method to display the values of instance variables. */
    public void displayData()
    {
        System.out.println("Student Name: " + name );
        System.out.println("Student Division: " + division);
        System.out.println("Student Age: " + age);
    }

    /* Driver Code */
    public static void main(String args[])
    {
        TestMethods s = new TestMethods();
        s.setName("shamal Jadhav");
        s.setCollegeName("SVCET");// static variable called direcly here
        s.setAge(14);
        s.setDiv("B");
        s.displayData();
    }
}



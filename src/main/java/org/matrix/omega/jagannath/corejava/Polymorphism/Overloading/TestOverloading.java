package org.matrix.omega.jagannath.corejava.Polymorphism.Overloading;

public class TestOverloading {
    //Methods should be in same class
    public void addition(int a,int b)
    {
        System.out.println("Addition of two numbers : "+ (a+b));
    }
    //Methods name should be the same
    public void addition(int a,int b,int c){
        System.out.println("Addition of two numbers : "+ (a+b+c));
    }
    public void m1(String str)
    {
        System.out.println("I am in string parameter m1 Method m1 : "+str);
    }
    public void m1(int a)
    {
        System.out.println("I am in integer parameter m1 Method "+a);
    }
    //Same number of Parameters but diff data types
    //Same method name but diff parameters
    public void m2(int a,String str)
    {
        System.out.println("I am in method of integer and string parameter ");
        System.out.println("Values of parameter :"+a+ " "+str);

    }
    //Sequence of parameters does also matter
    public void m2(String str,int a)
    {
        System.out.println("I am in method of string and integer parameter ");
        System.out.println("Values of parameter :"+str+ " "+a);
    }
    public static void main(String[] args)
    {
        TestOverloading obj=new TestOverloading();
        obj.addition(10,20);
        obj.addition(10,20,30);
        obj.m1("Shriniwas");
        obj.m1(111);
        obj.m2(10,"Shri");
        obj.m2("Shri",20);
    }
}

package org.matrix.omega.madan.variables;

public class LocalVariable  {


    LocalVariable() {

        int age = 10;
        double code =2.00;
        String str1 = "JavaPrograming";
        System.out.println(age);
        System.out.println(code);
        System.out.println(str1);
    }
     public static void  main (String [] args){

        LocalVariable l1 = new LocalVariable();
        l1.test();
        int value= 20;
        double code = 30.00;
        System.out.println(value);
        System.out.println(code);

     }

     public void test() {

        int age = 30;
        String str2 = "java";
        System.out.println(str2);

    }

}

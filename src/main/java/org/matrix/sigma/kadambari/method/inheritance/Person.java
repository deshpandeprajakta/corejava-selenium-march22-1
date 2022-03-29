package org.matrix.sigma.kadambari.method.inheritance;

public class Person {
    int age,id;
    String name;
    void naming(String name){
        System.out.println("Name:"+name);
    }
}
class Person1{
    public static void main(String[] args) {
        Student s= new Student();
        s.naming("kadambari");
        s.ageN(25);
    }
}
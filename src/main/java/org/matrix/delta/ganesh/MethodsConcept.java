package org.matrix.delta.ganesh;

public class MethodsConcept {

    MethodsAccess methodsAccess = new MethodsAccess();

    public void getMethod(){
//        methodsAccess = new MethodsAccess();
        methodsAccess.college();
    }

    public void getMethod1(){
        MethodsAccess methodsAccess = new MethodsAccess();
        methodsAccess.university();
    }

    public void firstMethod(){
        System.out.println("First Method");
    }

    public void secondMethod(){
        System.out.println("Second Method");
    }

    public void add(int a, int b){
        int h = a + b;
        System.out.println("Addition: "+h);

    }

    public int mul(int a, int b){
        int multiply = a * b;
        return  multiply;
    }



    public static void main(String[] args) {
        MethodsConcept methodsConcept = new MethodsConcept();
        methodsConcept.firstMethod();
        methodsConcept.secondMethod();

        methodsConcept.add(10, 20);

        int f = methodsConcept.mul(10,20);
        System.out.println("Mul :"+f);

        methodsConcept.getMethod();
        methodsConcept.getMethod1();
    }
}
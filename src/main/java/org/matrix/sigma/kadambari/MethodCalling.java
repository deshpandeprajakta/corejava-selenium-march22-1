package org.matrix.sigma.kadambari;

public class MethodCalling{

    public void m1(){
        System.out.println("I m in m1 method");
        m3();
        m2();
    }

        public void m2(){
            System.out.println("I m in m2 method ");

        }

        public void m3(){
            System.out.println("I m in m3 method");
        }

    public static void main(String[] args) {
        MethodCalling obj = new MethodCalling();
                obj.m1();
    }
}

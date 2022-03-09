package org.matrix.delta.rahul;

public class InstanceVariable {
    int a=15;
    int b=25;
    int c=50;
    InstanceVariable(){
        System.out.println(a);
        System.out.println(c);

    }
    public void display(){
        System.out.println(b);
    }

    public static void main(String[] args) {
        InstanceVariable e=new InstanceVariable();
        //System.out.println(a);
        //e.dis();
    }
}

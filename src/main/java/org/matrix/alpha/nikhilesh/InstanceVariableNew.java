package org.matrix.alpha.nikhilesh;

public class InstanceVariableNew {
    int a = 20;
    float f = 20.5f;
    double b = 102.5f;
    long l = 1001;
    int sum = 12;

    public void display() {
        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(l);
        System.out.println(sum);

    }

    public static void main(String[] args) {
        InstanceVariableNew obj = new InstanceVariableNew();
    }
}
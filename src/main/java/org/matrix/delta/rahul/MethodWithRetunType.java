package org.matrix.delta.rahul;

public class MethodWithRetunType {
    public int getData(int a){
        return a;
    }

    public static void main(String[] args) {
        MethodWithRetunType m=new MethodWithRetunType();
        int n=m.getData(21);
        //System.out.println(m.getData(21));
        System.out.println(n);
    }
}



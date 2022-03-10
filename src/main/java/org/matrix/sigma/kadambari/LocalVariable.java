package org.matrix.sigma.kadambari;

public class LocalVariable {
    LocalVariable(){
        int weight =50;
        float f =0.2f;
        System.out.println(weight);
        System.out.println(f);
    }

    public static void main(String[] args) {
        int weight = 50;
        System.out.println(weight);
    }
    public void test(String str){
        int i =20;
        int weight =80;
        System.out.println(weight);
        System.out.println(str);
    }
}

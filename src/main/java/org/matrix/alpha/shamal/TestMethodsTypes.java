package org.matrix.alpha.shamal;

public class TestMethodsTypes {

    int a = 100; /*Instance variables*/
    int b = 200; /*Instance variables*/

    /*Method declaration with implementation*/
    public void add(int a, int b) {
        System.out.println(this.a + this.b);
        System.out.println(a + b);
    }
    /*Method declaration with parameters*/

    public int addNumbers(int a, int b) {
        /*Method implementation*/
        int sum = a + b;
        System.out.println("The addition is :" + sum);
        return sum; // it return a value i.e sum

    }

    /*Method with no retuntype*/

    public void addNumber(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of two nubers is :" + sum);

    }

    /*Satatic method declaration with implimentation*/

    public static int multiplications(int a, int b) {
        int result = a * b;
        System.out.println("The Multiplication of two numbers is:" + result);
        return result;
    }
    static public   void product(int a , int b){
        int product = a * b;
        System.out.println("The product of two number is :" +product);
    }
    public static void main(String[] args) {
        TestMethodsTypes t = new TestMethodsTypes(); // object creation or reffrence variables allocation
        t.addNumber(20, 30);
        t.addNumbers(50, 60);  // value passing via run time
        t.add(1, 2);

        // calling static method via class name
        TestMethodsTypes.multiplications(25, 30);

        // calling static method directly
        product(50,50);

    }

}

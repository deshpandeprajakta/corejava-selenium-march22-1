package org.matrix.lambda.nisha;

public class LocalVariable {

    int i = 200;   // 2.instance variable
    static int  ss = 77;  // 3.static variable

    public static void main(String[] a) {  //main method   // static method
        int age = 20;
        System.out.println(age);          //20     //1.local variable

        LocalVariable v = new LocalVariable();
        System.out.println(v.i);         // 200          // instance variable

        System.out.println(LocalVariable.ss);   //77       //static variable



        System.out.println();

    }
    //nonstatic - instance - bound to object creation
    //static - bound to .class file
}
/*
 *
 * access-meodifier
 * 1.public
 * 2.private
 * 3.protected
 * 4.default
 *
 * return-type
 * 1.void
 * 2.byte
 * 3.short
 * 4.int
 * 5.long
 * 6.double
 * 7.float
 * 8.char
 * 9.boolean
 * 10.String
 * 11.classname
 *
 * method-name
 * 1.camel case starts from small letter
 * */


/*
* element
* 1.variable
* 2.constructor
* 3.block
* 4.method
* */


/*
* 1.variable
* int a = 10;
* variable is a name which is given to value
*
* **Types of variable**
* 1.local variable =  variable which are present inside the constr/method/block
* 2.instance variable = variable which are present inside the class but outside the const/method/block
* 3.static variable = variable which are present inside the class but outside the constr/method/block
*                     but with static keyword
*
* */


/*
* 2. method
* method is a type of block
*
 * synthx
 * access-modifier return-type method-name(parameter list)
 *
1. Methods without parameters:
2. Methods with parameters:
3. Methods with Object as a parameter:
4. Methods with same signature is not allowed
5. Inner methods are not allowed
6. Method calling/chaining:
7. Local variable has the priority, we need to use ‘this’ keyword to access instance var/class variables
 *
* */


/*
* 3.constructor
* constructor is special type of method which is used to initialize instance variable/ Objects.
*
* **Types of Constructor**
* 1. Default consturctor
* 2. parameterized constructor
* */

/*
* 4.instance block
* 5.static block
* */

/*
* main method() {
*  //object creation
        // syntx
        // 2 ways
        //1. classname obj = new classname();
        //e.g LocalVariable v = new LocalVariable(); ///object is used for multiple time
        //v.nishasingam();
        //v.nisham();
        //2. new classname();
        //e.g new LocalVariable();
        //new LocalVariable().nishaSingam();
}
* */
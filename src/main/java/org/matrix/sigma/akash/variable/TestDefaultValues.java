<<<<<<< HEAD:src/main/java/org/matrix/sigma/akash/variable/TestDefaultValues.java
package org.matrix.sigma.akash.variable;
=======
package org.matrix.sigma.akash;

>>>>>>> a3a4f9388730ee30b2ed3f7868e5f8816451a2f0:src/main/java/org/matrix/sigma/akash/TestDefaultValues.java
/* Note - To get the by default values of variable must be static and static variable assigned
outside the main method. */
class Employee {
}

public class TestDefaultValues {
    static int i;
    static boolean a;
    static long c;
    static byte d;
    static double e;
    static short f;
    static String g;
    static Employee ee;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(ee);
    }
}

package org.matrix.alpha.nikhilesh;

public class NewStaticMethod {
int total=5;
static String companyName="JAVA";

public void getData1(){
    System.out.println(total);

}

    public static void main(String[] args) {
        NewStaticMethod abc =new NewStaticMethod();
       abc.getData1();
    }
}

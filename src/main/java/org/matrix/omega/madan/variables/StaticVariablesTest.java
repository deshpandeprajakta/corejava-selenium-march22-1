package variables;

public class StaticVariablesTest {

    static String student1Name = "Avinash";
    static int rollNo=11;
    double percentage =70.3;
    String student1Class="first";


    void getData() {
        System.out.println(student1Name);
        System.out.println(rollNo);
        System.out.println(percentage);
        System.out.println(student1Class);

    }
     public static void main (String [] args) {

        StaticVariablesTest stat = new StaticVariablesTest();
        System.out.println(stat.percentage);
        System.out.println(student1Name);
        stat.getData();

     }




}

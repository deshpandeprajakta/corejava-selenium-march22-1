package org.matrix.sigma.pankaj;

public class TestMethodConceptNew {
  int a = 101;
  int b = 102;


    // method with parameter
  public void add(int a, int b){
      System.out.println(this.a+this.b);
      System.out.println(a+b);

  }

    public static void main(String[] args) {
        TestMethodConceptNew obj = new TestMethodConceptNew();
        obj.add(1,2);


    }

}

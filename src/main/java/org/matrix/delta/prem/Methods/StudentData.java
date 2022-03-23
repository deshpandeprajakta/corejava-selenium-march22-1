package org.matrix.delta.prem.Methods;

public class StudentData {
        int clgId=124;
        String name="Yash";
        int age = 28;
        String branch ="Civil";

        public void getData(){
                System.out.println("College Id is= "+clgId);
                System.out.println("Name of Student is= "+name);
                System.out.println("Age of Student is= "+age);
                System.out.println("Branch of Student is= "+branch);

                }

        public static void main(String[] args) {
                StudentData obj = new StudentData();
                obj.getData();
        }

                }



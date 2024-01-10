package com.norcorp.arrays;

class Student {
    int rollNum;
    String name;
    int marks;


}

public class ArrraysOfObjectsInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA OBJECTS ARRAYS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        Student student1 = new Student();
        student1.rollNum = 1;
        student1.name = "Tanor";
        student1.marks = 88;

        Student student2 = new Student();
        student2.rollNum = 2;
        student2.name = "Bruno";
        student2.marks = 78;

        Student student3 = new Student();
        student3.rollNum = 3;
        student3.name = "John";
        student3.marks = 70;

        Student students[] = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].rollNum + " : " + students[i].marks);
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

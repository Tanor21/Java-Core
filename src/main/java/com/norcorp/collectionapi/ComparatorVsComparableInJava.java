package com.norcorp.collectionapi;
import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class ComparatorVsComparableInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA COMPARATOR VS COMPARABLE ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Comparator Vs Comparable :
         */

        Comparator<Integer> numscom = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<Student> studentscom = (Student i, Student j) -> {
                /*if (i.age > j.age)
                    return 1;
                else
                    return -1;*/
            return i.age > j.age ? 1 : -1;

        };
        // In one line of code :
        //Comparator<Student> studentscom = (i, j) -> i.age > j.age ? 1 : -1;

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        // sort
        //Collections.sort(nums);

        //compare
        //Collections.sort(nums, numscom);
        Collections.sort(nums);

        // Student
        List<Student> students = new ArrayList<>();
        students.add(new Student(22, "Tanor"));
        students.add(new Student(12, "Bruno"));
        students.add(new Student(18, "Haroune"));
        students.add(new Student(20, "Ahmed"));

        Collections.sort(students, studentscom);

        System.out.println();
        // nums
        System.out.println(nums);
        // Students
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

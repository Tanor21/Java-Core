package com.norcorp.thiskeyword;

class Employee {
    // Instance variable
    private String empName;
    private int empAge;
    private int empSalary;

    public String getEmpName() {
        return empName;
    }

    // Local variable
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Local variable
    public int getEmpAge() {
        return empAge;
    }

    // Local variable
    public void setEmpAge(int empAge) {
        //empAge = empAge; // Assign the value (0) for itself because both are local variable
        this.empAge = empAge; // this.empAge is an instance variable because this make reference to the class Employee.
    }

    // Local variable
    public int getEmpSalary() {
        return empSalary;
    }

    // Local variable
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}

public class ThisKeywordInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA THIS KEYWORD ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            This :
            This keyword is a reference variable that is used to refer to the current object within an instance method or a constructor.
            It is often used to disambiguate instance variables from local variables when they have the same name.

         */

        Employee emp1 = new Employee();
        emp1.setEmpName("Bruno");
        emp1.setEmpAge(33);
        emp1.setEmpSalary(20000);

        System.out.println();
        System.out.println(emp1.getEmpName() + " : " + emp1.getEmpAge() + " : " + emp1.getEmpSalary());
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

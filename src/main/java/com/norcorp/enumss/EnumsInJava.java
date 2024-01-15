package com.norcorp.enumss;

// Declaration of an enum named "Day"
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Status {
    Running, Failed, Success, Pending;
}

public class EnumsInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA ENUMS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Enums :
           In Java, an enum (short for enumeration) is a special data type that represents a set of predefined constants or values.

         */
        Day d = Day.FRIDAY;
        Day[] days = Day.values();

        Status status = Status.Running;


        System.out.println();
        System.out.println(d);
        System.out.println(d.ordinal());
        System.out.println("-----");
        for (Day day: days) {
            System.out.println(day + " : " + day.ordinal());
        }
        System.out.println("-----");
        // Enums with if else
        if (status == Status.Running )
            System.out.println("All Good");
        else if (status == Status.Failed)
            System.out.println("Try Again");
        else if (status == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
        // Enums with switch
        switch (status) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

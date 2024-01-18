package com.norcorp.recordclass;

import java.util.Objects;

//class Alien {
//    private final int id;
//    private final String name;
//
//    public Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Alien alien)) return false;
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}


// record can implements interface but cannot extends others classes
record Alien(int id, String name) {
    public Alien {
        if(id==0)
            throw new IllegalArgumentException("id cannot be zero.");
    }

    public void show() {
        System.out.println("in show with normal method");
    }

    public static void show2() {
        System.out.println("in show2 with static method");
    }
}

public class RecordClassInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA RECORD CLASS (JAVA 17 FEATURES) ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Record Class :
         */
        Alien alien1 = new Alien(1, "Tanor");
        Alien alien2 = new Alien(2, "Bruno");
        Alien alien3 = new Alien(1, "Tanor");
        //Alien alien4 = new Alien(0, "Test"); // Error (id cannot be zero)


        System.out.println();
        System.out.println(alien2);
        System.out.println(alien1.equals(alien3));
        System.out.println(alien1.name());
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

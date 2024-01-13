package com.norcorp.equalstostringhashcode;

import java.util.Objects;

class Lapto {
    String model;
    int price;

    // If you don't have a method in your class it will call the method of the superclass.
    // But what if I create the method here itself :
    /*public String toString() {
        return model + " : " + price;
    }*/

    public String toString() {
        return "Lapto{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    /*public boolean equals(Lapto that) {
        if (this.model.equals(that.model) && this.price == that.price) {
            return true;
        } else {
            return false;
        }
    }*/

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lapto)) return false;
        Lapto lapto = (Lapto) o;
        return price == lapto.price && Objects.equals(model, lapto.model);
    }

    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class EqualsClassInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA EQUALS OBJECT CLASS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Equals Class :
         */
        Lapto obj1 = new Lapto();
        obj1.model = "Windows";
        obj1.price = 4000;

        Lapto obj2 = new Lapto();
        obj2.model = "Windows";
        obj2.price = 4000;

        //boolean result = obj1 == obj2;
        boolean result = obj1.equals(obj2);

        System.out.println();
        System.out.println(obj1);
        System.out.println(result);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

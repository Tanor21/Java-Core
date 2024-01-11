package com.norcorp.constructor;


class Shop {
    private int id;
    private String product;

    // Default Constructor
    public Shop() {
        id = 00;
        product = "Product";
        System.out.println("In constructor");
    }

    //Constructor that only take the product
    public Shop(String product) {
        id =2;
        this.product = product;
    }

    // Parameterize Constructor
    public Shop(int id, String product) {
        this.id = id;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String give) {
        this.product = give;
    }
}

public class ConstructorInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA CONSTRUCTOR ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Constructor :
            We all know that an object of a particular class contains instance variables, but if we want to perform some
            operations on the instance variables we need to initialize the Instance variables. This is where a constructor comes in.
            You can do so by having the same name as the class name. Such a method is called a constructor.
            Hence, a constructor is a method having the same name as that of the class and is used to initialize the
            instance variable of the objects.
            So, constructors are used to allocating values to the class variables during object creation,
            which is either explicitly done by the developer/programmer or by default constructor in Java itself.
         */

        Shop shop = new Shop();
        Shop shop1 = new Shop(1, "Milk");
        Shop shop2 = new Shop("Sugar");
        //shop.setId(1);
        //shop.setProduct("Milk");

        System.out.println();
        System.out.println("Call of default constructor : ");
        System.out.println(shop.getId() + " : " + shop.getProduct());
        System.out.println("Call of parameterize constructor : ");
        System.out.println(shop1.getId() + " : " + shop1.getProduct());
        System.out.println("Call of parameterize constructor that only take the product : ");
        System.out.println(shop2.getId() + " : " + shop2.getProduct());
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

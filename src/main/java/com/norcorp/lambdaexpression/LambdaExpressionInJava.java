package com.norcorp.lambdaexpression;

@FunctionalInterface
interface O {
    void show();
}

@FunctionalInterface
interface Numbers {
    int add(int a, int b);
}



public class LambdaExpressionInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA LAMBDA EXPRESSION ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Lambda Expression :
           In Java, a lambda expression is a concise way to express an instance of a functional interface
           (an interface with a single abstract method). Lambda expressions provide a clear and concise syntax
           for writing anonymous methods or functions, making code more readable and expressive,
           especially in the context of functional programming.
           NB : Lambda Expression only works with Functional Interface
         */

        // Lambda Expression
        O obj = () -> System.out.println("in show");

        // Lambda Expression With Return
        Numbers calcule = (a, b) -> a + b;
        int result = calcule.add(4, 5);

        System.out.println();
        obj.show();
        System.out.println(result);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

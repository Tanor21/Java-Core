package com.norcorp.exceptionss;

//Custom Exception
class TanorException extends Exception {
    public TanorException(String string) {
        super(string); // Pass the string to the Parent constructor (Exception, RuntimeException ...).
    }
}

public class ExceptionInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA EXCEPTION ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
           Exception :
           Exception are basically runtime error
           We have three types of errors
           1 - compile time error
           2 - runtime error //Exception Handling
           3 - logical error or bugs
         */
        int i = 20;
        int j = 0;
        int nums[] = new int[5];
        //String str = null;

        try
        {
            j = 18/i;
            if (j==0) {
                //throw new ArithmeticException(("Cannot divide by zero."));  // Default Exception
                throw new TanorException(("Cannot divide by zero.")); // Custom Exception
            }

            //System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[4]);
        }
        catch (TanorException e) {
            j = 18/1;
            System.out.println("That's the default output " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong. " + e);
        }


        System.out.println();
        System.out.println(j);
        System.out.println("Bye...");
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}

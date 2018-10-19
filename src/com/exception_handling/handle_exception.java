package com.exception_handling;

public class handle_exception {

    public static void main(String[] args) {

        try{

            int k= 100/2;

            int data[]= new int[1];
            data[2]=k;

            System.out.println("Answer: "+k);

        }//catch (ArithmeticException | ArrayIndexOutOfBoundsException ex){  //multiple exception
       // catch (ArithmeticException ex){  //this will catch all the arithmatic related exception
        catch (RuntimeException ex){  //this will catch all the runtime exception
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally");
        }


        System.out.println("end of main");
    }
}

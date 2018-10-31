package com.MultiThreading;

public class CharMain {

    public static void main(String[] args) {

        CharPrinter printer1 = new CharPrinter("The quick brown fox jumps over the lazy dog");
        CharPrinter printer2 = new CharPrinter("56546734534535345223");

        Thread t1 = new Thread(printer1);
        Thread t2 = new Thread(printer2);

        t1.start();
        t2.start();

       // t1.setPriority(Thread.MIN_PRIORITY);

        //t2.setPriority(Thread.MAX_PRIORITY);
        /*try{
            System.out.println("hay jvm, let others finish first");
            t1.join();
            t2.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }*/
        System.out.println(" End of Manin");

        try{
            System.out.println("Print T1");
            //t1.start();
            t1.join();

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        try{
            System.out.println("printing T2");

            t2.join();

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

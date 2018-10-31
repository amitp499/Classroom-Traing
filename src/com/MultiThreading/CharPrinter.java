package com.MultiThreading;

public class CharPrinter implements Runnable {

    private String statement;
    //= "The quick brown fox jumps over the lazy dog";

    CharPrinter(String statement){

        this.statement=statement;
    }

    @Override
    public void run() {

        for(int i=0; i<statement.length();i++){
            System.out.print(" "+statement.charAt(i));

            Thread.yield();   //performs rationing
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

                               //
        }

    }



}

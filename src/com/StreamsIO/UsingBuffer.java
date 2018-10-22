package com.StreamsIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBuffer {
    public static void main(String[] args) {

        BufferedReader br = null;
        String name = null;

        try {
            System.out.println("Please enter your name: ");

            InputStreamReader reader = new InputStreamReader(System.in);
             br = new BufferedReader(reader);

            name = br.readLine();
            System.out.println("Hello "+name);


    }catch (IOException e){
            System.out.println("Unable to read");
        }finally {

          try{
              br.close();
          }catch (IOException ex){

              System.out.println("Unable to exit");

          }
        }


    }
}

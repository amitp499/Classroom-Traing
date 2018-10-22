package com.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Demo1 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

        Properties ps = new Properties();
        try{
            //ps.load(Property_Demo1.class.getResourceAsStream("app.properties"));
            ps.load(new FileInputStream("app.properties"));//loads file from project
            System.out.println("DB name "+ps.getProperty("db.name"));
            System.out.println("DB User "+ps.getProperty("db.user"));
            System.out.println("class "+ps.getProperty("class"));
            System.out.println("class "+ps.getProperty("class1","Not available"));
            //if value does not exist then displays default error

            //ps.setProperty("class","training");  //update property file
            //ps.store(new FileOutputStream("app.properties"),"test"); //save property file
        }catch(IOException e){

            System.out.println(e.getMessage());

        }

    }
}


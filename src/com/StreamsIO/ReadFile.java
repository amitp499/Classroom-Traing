package com.StreamsIO;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {

    public static void main(String[] args) {
        String name;
        try{

            FileInputStream f = new FileInputStream("D:\\Amit\\Test1.txt");
            InputStreamReader in = new InputStreamReader(f);
            BufferedReader bf = new BufferedReader(in);

            while (!bf.readLine().isEmpty()){
                name = bf.readLine();
                System.out.println(name);
            }



        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

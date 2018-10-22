package com.SerializationDeSerialization;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class SerializationDemo  {

    static void writeFile(String filename){

        Employee emp = new Employee("aakash","malya",68, LocalDate.of(1990,02,12));
        Employee emp1 = new Employee("Ajay","malya",68, LocalDate.of(1990,02,12));
        Employee emp2 = new Employee("AMit","malya",68, LocalDate.of(1990,02,12));

        ArrayList<Employee> aa = new ArrayList<>();
        aa.add(emp);
        aa.add(emp1);
        aa.add(emp2);

        try{

            File file = new File(filename);
            if(!file.exists())
                file.createNewFile();

            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objout =new ObjectOutputStream(out);
            objout.writeObject(aa);
           // objout.writeObject(emp1);    //write multiple object
            //objout.writeObject(emp2);    //Write multiple object
            objout.close();

        }catch (IOException e){

            System.out.println("Unable to write "+e.getMessage());
        }

    }

    static void readFile(String filename){

        try {
            FileInputStream in = new FileInputStream(filename);
            ObjectInputStream oin = new ObjectInputStream(in);

            Object obj = oin.readObject();
          //  Object obj1 = oin.readObject(); //Multiple data read
            //Object obj2 = oin.readObject(); //Multiple data read

            //if (obj instanceof Employee) { //single data read
               System.out.println(obj);
               //for (int i=0;i<obj.l)
            //}

            //Multiple data output and print
           // if ((obj instanceof Employee) && (obj1 instanceof Employee) && (obj1 instanceof Employee) ){
             //   System.out.println(obj);
               // System.out.println(obj1);
                //System.out.println(obj2);
            //}


        }catch(IOException | ClassNotFoundException ex){

            System.out.println(ex.getMessage());
        }

    }
}

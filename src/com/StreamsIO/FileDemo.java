package com.StreamsIO;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class FileDemo {

    public static void main(String[] args) {

        try{
            File file =new File("D:\\Amit"); //using path

            //File file =new File(URI.create("file:///D:/Amit")); //using URI

            if(file.exists()){
                System.out.println("It does exist");
            }
            if (file.isDirectory()){
                System.out.println("Directory does exist");
            }
            else{

                System.out.println("directory does not exist");
            }

            File newFile = new File(file,"data.txt");

            if (newFile.exists()){
                System.out.println("data file already exist");
            }else{
                System.out.println("Creatiing new file");
                    newFile.createNewFile();
            }
        }catch (IOException ex){
            System.out.println("IO exception "+ex.getMessage());
        }
    }
}

package com.StreamsIO;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

public class PathDemo {

    public static void main(String[] args) {

        //Path path = FileSystems.getDefault().getPath("/users/amit");
        Path path = FileSystems.getDefault().getPath("C:\\users\\amit");
        System.out.println(path);
        System.out.println(path.toUri());

        System.out.println(path.getNameCount());


        Iterator it  = FileSystems.getDefault().getRootDirectories().iterator();

        System.out.println("Root Directories (Drives in Window)");
        while (((Iterator) it).hasNext()){
            System.out.println(((Iterator) it).next());
        }
    }
}

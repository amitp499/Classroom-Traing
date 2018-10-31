package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Generics_Main {

    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();

        student.add(new Student(45,"rwqerw","dfdf",60));
        student.add(new Student(40,"rwqerw","dfdf",55));
        student.add(new Student(41,"rwqerw","dfdf",65));
        student.add(new Student(42,"rwqerw","dfdf",40));

        Collections.sort(student);

        for (Student st : student){

            System.out.println(st);
        }



    }
}

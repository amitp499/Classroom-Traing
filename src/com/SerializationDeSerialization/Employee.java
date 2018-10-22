package com.SerializationDeSerialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {

    private String firstname, lastname;
    private int age;
    private LocalDate joiningdate;

    public Employee (String firstname,String lastname,int age,LocalDate joiningdate){

        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.joiningdate = joiningdate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", joiningdate=" + joiningdate +
                '}';
    }
}

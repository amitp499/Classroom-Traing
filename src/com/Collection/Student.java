package com.Collection;

public class Student implements  Comparable<Student>{

    private int rollNo;
    private String firstName;
    private String LastName;
    private int age;

    public String toString(){

        return rollNo+", Name: "+firstName+" "+LastName+" age: "+age;

    }

    public Student(int rollNo,String firstName,String LastName, int age){
        this.age= age;
        this.LastName=LastName;
        this.firstName=firstName;
        this.rollNo=rollNo;

    }

    public int compareTo(Student obj){

        return this.rollNo - rollNo;
    }
}

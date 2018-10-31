package com.JDBC_Connection;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class JDBC_ConnectionPooling {

    public static void main(String[] args) {


        try{
            Class.forName("oracle.jdbc.OracleDriver");
          //  System.out.println("JDBC Driver found and Loaded!");

            JdbcRowSet rowsSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowsSet.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            rowsSet.setUsername("hr");
            rowsSet.setPassword("hr");
            rowsSet.setCommand("select first_name, last_name from employees");
            rowsSet.execute();

            while (rowsSet.next()){
                System.out.println("Name : " + rowsSet.getString(1)+ " "+ rowsSet.getString(2));
            }


            System.out.println("---------Previous Order ---------");
            while (rowsSet.previous()){
                System.out.println("Name : " + rowsSet.getString(1)+ " "+ rowsSet.getString(2));
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Cannot load driver "+e.getMessage());
            e.printStackTrace();
            return; //Close main method
        }
    }
}

package com.Comparator_Assignment;

import java.util.Comparator;

public class accountBal_compare implements Comparator<Account> {

    public int compare(Account bal1 , Account bal2){

        return ( bal1.curentBalance - bal2.curentBalance);

    }


}

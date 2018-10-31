package com.Comparator_Assignment;

import java.util.Comparator;

public class accountType_compare implements Comparator<Account> {


    public int compare(Account actType1, Account actType2){

        return actType1.accountType.compareTo(actType2.accountType);
    }




}

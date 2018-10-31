package com.Comparator_Assignment;

import java.util.Comparator;

public class accountHolder_compare implements Comparator<Account> {

    public int compare(Account holdName1, Account holdName2){

        return holdName1.accHolderName.compareTo(holdName2.accHolderName);
    }


}

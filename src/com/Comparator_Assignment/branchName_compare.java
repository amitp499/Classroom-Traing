package com.Comparator_Assignment;

import java.util.Comparator;

public class branchName_compare implements Comparator<Account> {

    public int compare(Account bname1, Account bname2){

        return  bname1.branchName.compareTo(bname2.branchName);
    }
}

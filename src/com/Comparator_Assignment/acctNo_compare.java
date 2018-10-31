package com.Comparator_Assignment;

import java.util.Comparator;

public class acctNo_compare implements Comparator<Account> {


    public int compare(Account actNo1, Account actNo2){

        return actNo1.getAccountNo().compareTo(actNo2.accountNo);

    }

}

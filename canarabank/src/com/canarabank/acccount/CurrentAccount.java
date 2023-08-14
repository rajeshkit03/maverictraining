package com.canarabank.acccount;

public class CurrentAccount {
    void show(){
        SavingAccount sa=new SavingAccount();
        System.out.println(sa.accountNumber);
        sa.display();
    }
}

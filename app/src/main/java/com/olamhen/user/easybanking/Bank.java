package com.olamhen.user.easybanking;

/**
 * Created by dahham on 2/12/19.
 * This file is part of EasyBanking2 licensed under GNU Public License
 */
public enum Bank {


    ACCESS("*123#", ""),
    DIAMOND ("", ""),
    ECO("", "");

    Bank bank;
    String BALANCE = "";
    String HISTORY = "";

    Bank(String balance, String history){
        this.BALANCE = balance;
        this.HISTORY = history;
    }

    public void queryBalance(){

    }

    public String getName(){
        return name() + " " + "BANK";
    }
}

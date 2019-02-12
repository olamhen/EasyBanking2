package com.olamhen.user.easybanking;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dahham on 2/12/19.
 * This file is part of EasyBanking2 licensed under GNU Public License
 */
public class BankTransactions extends AppCompatActivity {

    Bank bank = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_bank_transactions);

        bank = (Bank) getIntent().getSerializableExtra("bank");


        this.setTitle(bank.getName());
    }

}

package com.olamhen.user.easybanking;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.olamhen.user.easybanking.R.*;
import static com.olamhen.user.easybanking.R.string.*;
import static com.olamhen.user.easybanking.R.string.close;

public class HomeActivity extends AppCompatActivity {
    Button button;
private DrawerLayout mDrawerlayout;
private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_home);
       button = (Button) findViewById(R.id.button8);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openGtbank();
           }
       });
        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccess();
            }
        });
        button = (Button) findViewById (R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openHabib();
            }
        });
        button = (Button) findViewById (R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openJaiz();
            }
        });
        button = (Button) findViewById (R.id.button16);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openDiamond();
            }
        });
        button = (Button) findViewById (R.id.button9);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openKeystone();
            }
        });
        button = (Button) findViewById (R.id.button15);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openUba();
            }
        });
        button = (Button) findViewById (R.id.button14);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openUnion();
            }
        });
        button = (Button) findViewById (R.id.button13);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSterlin();
            }
        });
        button = (Button) findViewById (R.id.button11);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openZenith();
            }
        });
        button = (Button) findViewById (R.id.button12);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openFirst();
            }
        });
        button = (Button) findViewById (R.id.button10);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openFidelity();
            }
        });
        button = (Button) findViewById (R.id.button17);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openWema();
            }
        });
        button = (Button) findViewById (R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openFcmb();
            }
        });
        button = (Button) findViewById (R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openEco();
            }
        });
        mDrawerlayout = (DrawerLayout) findViewById(id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerlayout, string.open, string.close);
        mDrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public void openEco(){
        Intent intent = new Intent(this, Eco.class);
        startActivity(intent);
    }
    public void openFcmb(){
        Intent intent = new Intent(this, Fcmb.class);
        startActivity(intent);
    }
    public void openWema(){
        Intent intent = new Intent(this, Wema.class);
        startActivity(intent);
    }
    public void openFidelity(){
        Intent intent = new Intent(this, Fidelity.class);
        startActivity(intent);
    }
    public void openFirst(){
        Intent intent = new Intent(this, First.class);
        startActivity(intent);
    }
    public void openZenith(){
        Intent intent = new Intent(this, Zenith.class);
        startActivity(intent);
    }
    public void openSterlin(){
        Intent intent = new Intent(this, Sterlin.class);
        startActivity(intent);
    }
    public void openUnion(){
        Intent intent = new Intent(this, Union.class);
        startActivity(intent);
    }
    public void openUba(){
        Intent intent = new Intent(this, Uba.class);
        startActivity(intent);
    }
    public void openDiamond(){
        Intent intent = new Intent(this, Diamond.class);
        startActivity(intent);
    }
    public void openKeystone(){
        Intent intent = new Intent(this, Keystone.class);
        startActivity(intent);
    }
    public void openJaiz(){
        Intent intent = new Intent(this, Jaiz.class);
        startActivity(intent);
    }
    public void openGtbank(){
        Intent intent = new Intent(this, Gtbank.class);
        startActivity(intent);
    }
    public void openAccess(){
        Intent intent = new Intent(this, Access.class);
        startActivity(intent);}
    public void openHabib(){
        Intent intent = new Intent(this, Habib.class);
        startActivity(intent);}    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

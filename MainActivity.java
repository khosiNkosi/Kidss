package com.sethu.codetribe.kids;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int id =0;
    static String ids="ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //animal method

    public void BtnAnimals(View v) {

        id =1;
        Intent intent = new Intent(this, SecondActiviy.class);
        intent.putExtra(ids,id);
        startActivity(intent);
    }
    // sport method
    public void BtnSport(View v)
    {
        id =2;
        Intent intent = new Intent(this,SecondActiviy.class);
        intent.putExtra(ids,id);
        startActivity(intent);

    }
    public void BtnMaths(View v)
    {
        id =3;
        Intent intent = new Intent(this,SecondActiviy.class);
        intent.putExtra(ids,id);
        startActivity(intent);



    }
}

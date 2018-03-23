package com.example.meesh.lab10;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    myfragment1 myfragment1;
    myfragment2 myfragment2;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myfragment1=new myfragment1();
        myfragment2=new myfragment2();

        fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.linear,myfragment1);
        fragmentTransaction.commit();

        Button btn1 =(Button)findViewById(R.id.frag1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.linear,myfragment1);
                fragmentTransaction.commit();
            }
        });

        Button btn2=(Button)findViewById(R.id.frag2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.linear,myfragment2);
                fragmentTransaction.commit();
            }
        });
    }
}

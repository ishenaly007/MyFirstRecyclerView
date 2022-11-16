package com.abit.myfirstrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Button btn1,btn2,btn3;
    ArrayList<State> states=new ArrayList<State>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


      /*  btn1=findViewById(R.id.fg1);
        btn2=findViewById(R.id.fg2);
        btn3=findViewById(R.id.fg3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction().replace(R.id.container,new Fg1())
                        .commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction().replace(R.id.container,new Fg2())
                        .commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction().replace(R.id.container,new Fg3())
                        .commit();
            }
        });*/
        //_______________________________________________________________________________________







        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.list);
        StateAdapter adapter=new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);
        setInitialData();
        setInitialData2();
        setInitialData3();
    }

    private void setInitialData3() {
        states.add(new State("Arabia","1"));
        states.add(new State("Mexico","2"));
        states.add(new State("Pakistan","3"));
        states.add(new State("Siri","4"));
        states.add(new State("Russia","5"));
        states.add(new State("Canada","6"));
        states.add(new State("Vatican","7"));
        states.add(new State("Britain","8"));
        states.add(new State("Germany","9"));
        states.add(new State("USA","10"));
        states.add(new State("Ukraine","11"));
    }

    private void setInitialData2() {
        states.add(new State("Arabia","1"));
        states.add(new State("Mexico","2"));
        states.add(new State("Pakistan","3"));
        states.add(new State("Siri","4"));
        states.add(new State("Russia","5"));
        states.add(new State("Canada","6"));
        states.add(new State("Vatican","7"));
        states.add(new State("Britain","8"));
        states.add(new State("Germany","9"));
        states.add(new State("USA","10"));
        states.add(new State("Ukraine","11"));
    }

    private void setInitialData() {
        states.add(new State("Arabia","1"));
        states.add(new State("Mexico","2"));
        states.add(new State("Pakistan","3"));
        states.add(new State("Siri","4"));
        states.add(new State("Russia","5"));
        states.add(new State("Canada","6"));
        states.add(new State("Vatican","7"));
        states.add(new State("Britain","8"));
        states.add(new State("Germany","9"));
        states.add(new State("USA","10"));
        states.add(new State("Ukraine","11"));
    }
}
package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fAction;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fAction =findViewById(R.id.fab);
        txt =  findViewById(R.id.textid);

        fAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText("clicked");

            }
        });


    }
}
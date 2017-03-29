package com.example.palani.mycolors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);
        textView3 = (TextView) findViewById(R.id.text3);
        textView4 = (TextView) findViewById(R.id.text4);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"RED",Toast.LENGTH_SHORT).show();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"MAROON",Toast.LENGTH_SHORT).show();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"YELLOW",Toast.LENGTH_SHORT).show();
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"BLUE", Toast.LENGTH_SHORT).show();
            }
        });
    }


}

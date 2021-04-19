package com.example.belajar_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class landing_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }
    public void button1(View view) {
        Intent intent = new Intent(landing_page.
                this,linear_layout.class);
        startActivity(intent);
    }
    public void button2(View view) {
        Intent intent = new Intent(landing_page.
                this,relative_layout.class);
        startActivity(intent);
    }
    public void button3(View view) {
        Intent intent = new Intent(landing_page.
                this,constraint_layout.class);
        startActivity(intent);
    }
    public void button4(View view) {
        Intent intent = new Intent(landing_page.
                this,frame_layout.class);
        startActivity(intent);
    }
    public void button5(View view) {
        Intent intent = new Intent(landing_page.
                this,table_layout.class);
        startActivity(intent);
    }
    public void button6(View view) {
        Intent intent = new Intent(landing_page.
                this,materialdesignlayout.class);
        startActivity(intent);
    }
    public void button7(View view) {
        Intent intent = new Intent(landing_page.
                this,scrollview.class);
        startActivity(intent);
    }
    public void button8(View view) {
        Intent intent = new Intent(landing_page.
                this,scrollviewhorizontal.class);
        startActivity(intent);
    }
}
package br.com.myskout.skout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class InnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner);
    }
}
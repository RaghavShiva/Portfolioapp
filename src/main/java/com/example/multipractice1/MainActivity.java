package com.example.multipractice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View view){
        Toast.makeText(this, "Opening second activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Education.class);
        startActivity(intent);
    }
}
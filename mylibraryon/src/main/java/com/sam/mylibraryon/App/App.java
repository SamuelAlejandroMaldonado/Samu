package com.sam.mylibraryon.App;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sam.mylibraryon.R;


public class App extends AppCompatActivity
{
    private TextView tvShowUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        initializeComponents();
    }

    private void initializeComponents()
    {
        tvShowUsername = findViewById(R.id.tvShowUsername);
        String username = getIntent().getStringExtra("USERNAME");
        String msg = "Bienvenido " + username;
        tvShowUsername.setText(msg);
    }

}
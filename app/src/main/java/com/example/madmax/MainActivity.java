package com.example.madmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.madmax.coffee.Coffee;
import com.example.madmax.coffee.Login;
import com.example.madmax.coffee.Dotcom;
import com.example.madmax.yellow.RegisterYellow;
import com.example.madmax.yellow.SecureAccount;
import com.example.madmax.yellow.LoginYellow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button coffeeAppButton = findViewById(R.id.coffeeAppButton);
        Button genericAppButton = findViewById(R.id.genericAppButton);
        Button dotcomAppButton = findViewById(R.id.dotcomAppButton);
        Button loginYellowButton = findViewById(R.id.loginYellowButton);
        Button registerYellowButton = findViewById(R.id.registerYellowButton);
        Button secureAccountButton = findViewById(R.id.secureAccountButton);

        // Set click listeners for each button
        coffeeAppButton.setOnClickListener(v -> {
            // Coffee
            Intent intent = new Intent(MainActivity.this, Coffee.class);
            startActivity(intent);
        });

        genericAppButton.setOnClickListener(v -> {
            // Login
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        });

        dotcomAppButton.setOnClickListener(v -> {
            // Dotcom
            Intent intent = new Intent(MainActivity.this, Dotcom.class);
            startActivity(intent);
        });

        loginYellowButton.setOnClickListener(v -> {
            // LoginYellow
            Intent intent = new Intent(MainActivity.this, LoginYellow.class);
            startActivity(intent);
        });

        registerYellowButton.setOnClickListener(v -> {
            // RegisterYellow
            Intent intent = new Intent(MainActivity.this, RegisterYellow.class);
            startActivity(intent);
        });

        secureAccountButton.setOnClickListener(v -> {
            // SecureAccount
            Intent intent = new Intent(MainActivity.this, SecureAccount.class);
            startActivity(intent);
        });
    }
}

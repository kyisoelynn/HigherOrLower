package com.azp.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
    }

    public void guess(View view) {
        EditText guessEditText = findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt > randomNumber) {
            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
        }else if (guessInt < randomNumber) {
            Toast.makeText(MainActivity.this, "Higher!",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "That's right!", Toast.LENGTH_SHORT).show();

            Random random = new Random();

            randomNumber = random.nextInt(20)+1;
        }

        //ToDo
        //to create the method called makeToast with one parameter

    }
}

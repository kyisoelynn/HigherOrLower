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
        randomNumber = random.nextInt(20) + 1;
        makeToast(Integer.toString(randomNumber));
    }

    public void guess(View view) {
        EditText guessEditText = findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        checkResult(guessInt);

        //ToDo
        //to create the method called makeToast with one parameter


    }

    public void checkResult(int inputNumber) {
        int testResult = Integer.compare(inputNumber, randomNumber);

        switch (testResult) {
            case -1:
                makeToast("Lower");
                break;
            case 0:
                makeToast("That's right!");
                break;
            case 1:
                makeToast("Higher");
                break;
            default:
                makeToast("Please input Number only");
                break;
        }
    }

    public void makeToast(String displayText) {
        Toast.makeText(MainActivity.this, displayText, Toast.LENGTH_SHORT).show();
    }
}

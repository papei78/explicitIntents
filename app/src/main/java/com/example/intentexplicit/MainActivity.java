package com.example.intentexplicit;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "key.for.extra.MESSAGE";
    private EditText mMessageEditText;
    private static final String LOG_TAG =
        MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mMessageEditText = findViewById(R.id.editText_main);




    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked hhhhh!");
        Intent intent = new Intent(this, MainActivity2.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);


    }
}
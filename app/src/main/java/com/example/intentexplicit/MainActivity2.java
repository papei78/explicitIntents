package com.example.intentexplicit;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent(); //TODO remark where the intent is created now
        String message  = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView  = findViewById(R.id.text_message);
        textView.setText(message);
    }
}
package com.example.nicequotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Variables Declaration
    private TextView quoteTextView;
    private Button quoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Variables Initialization
        quoteTextView = findViewById(R.id.quotesID);
        quoteButton = findViewById(R.id.buttonID);
        QuotesGenerator generator = new QuotesGenerator();

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getQuotes = generator.quotesGenerator();
                quoteTextView.setText(getQuotes);

                Toast.makeText(MainActivity.this, "Enjoy :)", Toast.LENGTH_SHORT).show();
            }
        };
        quoteButton.setOnClickListener(onClickListener);
    }
}
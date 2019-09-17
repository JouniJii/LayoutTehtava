package com.example.layouttehtv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enable/disable button
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2=findViewById(R.id.button2);
                button3=findViewById(R.id.button3);

                button2.setEnabled(button2.isEnabled()?false:true);
                button3.setEnabled(button3.isEnabled()?false:true);
            }
        });

        // Hide picture button
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.imageView).setVisibility(View.INVISIBLE);
            }
        });

        // Show picture button
        findViewById(R.id.button3).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                findViewById(R.id.imageView).setVisibility(View.VISIBLE);
                return false;
            }
        });
    }
}

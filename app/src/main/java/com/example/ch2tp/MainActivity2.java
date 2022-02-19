package com.example.ch2tp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        Button button2 = (Button) findViewById(R.id.button2);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amount = Integer.parseInt(editTextNumber.getText().toString());
                String option = spinner.getSelectedItem().toString();

                switch (option){
                    case "hello":
                        textView2.setText(option+" "+String.valueOf(amount));
                        break;
                    case "from":
                        textView2.setText(option+" "+String.valueOf(amount));
                        break;
                    case "here":
                        textView2.setText(option+" "+String.valueOf(amount));
                        break;
                }
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });

    }
}
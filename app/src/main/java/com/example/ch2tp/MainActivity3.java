package com.example.ch2tp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final EditText editTextNumberDecimal = (EditText) findViewById(R.id.editTextNumberDecimal);
        final RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        Button button3 = (Button) findViewById(R.id.button3);

        Toast toast = new Toast(MainActivity3.this);
        toast.setDuration(Toast.LENGTH_LONG);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(editTextNumberDecimal.getText().toString());

                if (radioButton.isChecked()){
                    toast.setText("op 1");
                    toast.show();
                }else{
                    toast.setText("op 2");
                    toast.show();
                }

                startActivity(new Intent(MainActivity3.this,MainActivity4.class));

            }
        });
    }
}
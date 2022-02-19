package com.example.ch2tp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity4 extends ListActivity {

    String args [] = {"op 1","op 2","op 2","op 2","op 2","op 2","op 2","op 2","op 2","op 2","op 2","op 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main4,R.id.textView4,args));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity4.this,splash.class));
        }
    }
}
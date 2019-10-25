package com.gaurav.shrestha.chap4;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.EGLExt;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lvs);
        String countries[]={"nepal","India","china","uk","usa","Canada"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1,countries);
        lv.setAdapter(arrayAdapter);
    }
}

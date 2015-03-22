package com.talkingandroid.hour13application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toolbar;


public class ToolBarCustomViewActivity extends Activity {
    Toolbar toolbar;
    Spinner spinner;
    String[] values = {"View 1", "View 2", "View 3", "View 4" };
    ArrayAdapter<String> spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_custom_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("TITLE");
        toolbar.setLogo(R.mipmap.ic_launcher);
        setActionBar(toolbar);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_dropdown_item,values);
        spinner.setAdapter(spinnerAdapter);
    }
}

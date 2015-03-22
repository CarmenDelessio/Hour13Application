package com.talkingandroid.hour13application;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ActionBarBasicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_action_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_about:
                return true;
            case R.id.action_help:
                return true;
            case R.id.action_settings:
                return true;
            case R.id.action_item_1:
                return true;
            case R.id.action_item_2:
                return true;
            case R.id.action_item_3:
                return true;
            case R.id.action_item_4:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

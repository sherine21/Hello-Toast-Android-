package com.example.myapplicationtp1;

import androidx.appcompat.app.AppCompatActivity;
import  android.util.Log;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="bbjnlklk" ;
    private int mcount=0 ;
    private TextView mshowcout;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_aide:
                Log.i(TAG, "Clic sur le bouton d'aide");
                return true;
            case R.id.menu_edition:
                Log.i(TAG, "Clic sur le bouton d'édition");
                return true;
            case R.id.menu_preferences:
                Log.i(TAG, "Clic sur le bouton des préférences");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowcout = (TextView) findViewById(R.id.show_count);

    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_msg,Toast.LENGTH_SHORT);
        toast.show();

    }

    public void clear (View view){
        mcount=0;
        mshowcout.setText(String.format("0"));
    }
    public void countUp (View view){
        ++mcount;
        if(mshowcout!=null)
            mshowcout.setText(Integer.toString(mcount));
    }
}
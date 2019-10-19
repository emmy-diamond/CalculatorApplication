package com.mainor.calculatorapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

           Button button = findViewById(R.id.button);
           final TextView textView = findViewById(R.id.textView);
           final EditText editText = findViewById(R.id.AddText);



           button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getEditText;
                getEditText = editText.getText().toString();
                if (editText != null) {

                    double convertToDoubleAndToKm = Double.parseDouble(getEditText) * 1.60934;
                    textView.setText(convertToDoubleAndToKm + " Km" );

                }
                else if(editText==null){
                    editText.setError("Please enter a number to be converted");
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

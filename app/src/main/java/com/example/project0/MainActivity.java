package com.example.project0;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final String BUTTON1MSG = "This button will launch my Spotify app!";
    public final String BUTTON2MSG = "This button will launch my Scores App !";
    public final String BUTTON3MSG = "This button will launch my Library App!";
    public final String BUTTON4MSG = "This button will launch my Build It Bigger app!";
    public final String BUTTON5MSG = "This button will launch my XYZ Reader app!";
    public final String BUTTON6MSG = "This button will launch my Capstone app!";

    Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final Button
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(button1);
            }
        });

        //final Button
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(button2);
            }
        });

        //final Button
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(button3);
            }
        });

        //final Button
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(button4);
            }
        });

        //final Button
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(button5);
            }
        });

        //final Button
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(button6);
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


    // Disable butttons meanwhile Toast.LENGHT_SHORT is being shown.
    public void showToast(Button button) {
        button.setBackgroundColor(Color.RED);
        switch (button.getId()) {
            case R.id.button1:
                Toast.makeText(getApplicationContext(), BUTTON1MSG, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), BUTTON2MSG, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), BUTTON3MSG, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(), BUTTON4MSG, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(), BUTTON5MSG, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(), BUTTON6MSG, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

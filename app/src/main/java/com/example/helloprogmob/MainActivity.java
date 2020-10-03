package com.example.helloprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable
        final TextView txtView = (TextView) findViewById(R.id.MainActivityTextView);
        Button myBtn = (Button) findViewById(R.id.button1);
        final EditText myEditText = (EditText) findViewById(R.id.editText1);
        Button btnHelp = (Button)findViewById((R.id.btnHelp));


        //action
        txtView.setText(R.string.text_hello_world);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Log.d("Coba Clikkkkkkkk",myEditText.getText().toString());
                txtView.setText(myEditText.getText().toString());


            }
        });
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent);
                Bundle b = new Bundle();

                b.putString("help_string",myEditText.getText().toString());
                intent.putExtras(b);

                startActivity(intent);

            }
        });


    }
}




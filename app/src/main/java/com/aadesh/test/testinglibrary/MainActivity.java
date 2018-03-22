package com.aadesh.test.testinglibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aadesh.languages.Language;
import com.aadesh.languages.enums.Constants;

public class MainActivity extends AppCompatActivity {

    private Button english;
    private Button hindi;
    private Button japanese;
    private Button german;
    private Button french;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        english = (Button) findViewById(R.id.english);
        hindi = (Button) findViewById(R.id.hindi);
        japanese = (Button) findViewById(R.id.japanese);
        german = (Button) findViewById(R.id.german);
        french = (Button) findViewById(R.id.french);

        context = this;

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Language.init()
                        .with(context)
                        .setMessage(Constants.ENGLISH)
                        .show();
            }
        });

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Language.init()
                        .with(context)
                        .setMessage(Constants.HINDI)
                        .show();
            }
        });

        japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Language.init()
                        .with(context)
                        .setMessage(Constants.JAPANESE)
                        .show();
            }
        });

        french.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Language.init()
                        .with(context)
                        .setMessage(Constants.FRENCH)
                        .show();
            }
        });

        german.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Language.init()
                        .with(context)
                        .setMessage(Constants.GERMAN)
                        .show();
            }
        });


    }




}

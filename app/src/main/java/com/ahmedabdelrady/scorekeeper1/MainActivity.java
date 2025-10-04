package com.ahmedabdelrady.scorekeeper1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView myTextView;
    EditText myEditText;
    Button submitButton;
    TextView myTextView2;
    EditText myEditText2;
    Button submitButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.greeting);
        myEditText = (EditText) findViewById((R.id.typeName));
        submitButton = (Button) findViewById(R.id.SubmitButton);

        myTextView2 = (TextView) findViewById(R.id.greeting2);
        myEditText2 = (EditText) findViewById((R.id.typeName2));
        submitButton2 = (Button) findViewById(R.id.SubmitButton2);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = myEditText.getText().toString();
                myTextView.setText("Team 1 Score - "  + name);
            }


        });



        submitButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = myEditText2.getText().toString();
                myTextView2.setText("Team 2 Score - "  + name);
            }


        });



    }
}


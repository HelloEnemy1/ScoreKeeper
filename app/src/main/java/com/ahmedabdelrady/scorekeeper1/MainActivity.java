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



    TextView myTextView3;
    EditText myEditText3;
    Button submitButton3;
    TextView myTextView4;
    EditText myEditText4;
    Button submitButton4;

    Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Grouped variables for every button in the UI

        myTextView = (TextView) findViewById(R.id.greeting);
        myEditText = (EditText) findViewById((R.id.typeName));
        submitButton = (Button) findViewById(R.id.SubmitButton);

        myTextView2 = (TextView) findViewById(R.id.greeting2);
        myEditText2 = (EditText) findViewById((R.id.typeName2));
        submitButton2 = (Button) findViewById(R.id.SubmitButton2);


        myTextView3 = (TextView) findViewById(R.id.greeting1f);
        myEditText3 = (EditText) findViewById((R.id.typeName1f));
        submitButton3 = (Button) findViewById(R.id.SubmitButton1f);

        myTextView4 = (TextView) findViewById(R.id.greeting2f);
        myEditText4 = (EditText) findViewById((R.id.typeName2f));
        submitButton4 = (Button) findViewById(R.id.SubmitButton2f);


        reset = (Button) findViewById(R.id.reset);



        // Giving every button the same function, just with different headers, easier to modify and troubleshoot

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



        submitButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = myEditText3.getText().toString();
                myTextView3.setText("Team 1 Fouls - "  + name);
            }


        });



        submitButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = myEditText4.getText().toString();
                myTextView4.setText("Team 2 Fouls - "  + name);
            }


        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView4.setText("Team 2 Fouls - "  );
                myTextView3.setText("Team 2 Score - "  );
                myTextView2.setText("Team 1 Fouls - "  );
                myTextView.setText("Team 1 Score - "  );
            }


        });





// This takes letters or numbers, whichever you choose, and outputs it to change the respective lines, respectively.
// Updates fouls and goals, for two teams. This is a universal app that can be with whichever score anyone desires, basketball, soccer, etc

    }
}


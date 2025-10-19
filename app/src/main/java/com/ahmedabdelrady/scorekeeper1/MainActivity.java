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

    TextView myToast;

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
        myToast = (TextView) findViewById(R.id.greeting1t);






        // Giving every button the same function, just with different headers, easier to modify and troubleshoot

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = myEditText.getText().toString();
                myTextView.setText("Team 1 Score - "  + name);
            }


        });









// This takes letters or numbers, whichever you choose, and outputs it to change the respective lines, respectively.
// Updates fouls and goals, for two teams. This is a universal app that can be with whichever score anyone desires, basketball, soccer, etc.

    }
}


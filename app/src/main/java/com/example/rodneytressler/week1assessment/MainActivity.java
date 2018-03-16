package com.example.rodneytressler.week1assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_View = findViewById(R.id.text_view);
    private Button submitButton = findViewById(R.id.button_submit);
    private EditText enterText = findViewById(R.id.edit_text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

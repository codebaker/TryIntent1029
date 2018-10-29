package com.codebakery.joan.tryintent1029;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlusActivity extends AppCompatActivity implements View.OnClickListener {
    private int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);

        ((Button)findViewById(R.id.buttonResult)).setOnClickListener(this);

        Intent intent = getIntent();
        String num1 = intent.getStringExtra("num1");
        String num2 = intent.getStringExtra("num2");
        String operator = intent.getStringExtra("operator");
        result = Integer.parseInt(num1) + Integer.parseInt(num2);

        ((TextView) findViewById(R.id.textViewResult)).setText(num1 +" " + operator + " " + num2);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,ResultActivity.class)
                            .putExtra("result", Integer.toString(result));
        startActivity(intent);
    }
}

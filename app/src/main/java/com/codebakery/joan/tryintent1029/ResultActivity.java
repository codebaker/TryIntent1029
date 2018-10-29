package com.codebakery.joan.tryintent1029;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ((Button) findViewById(R.id.buttonHome)).setOnClickListener(this);
        //int result = getIntent().getIntExtra("result",-200);
        ((TextView) findViewById(R.id.textViewResult2)).setText(getIntent().getStringExtra("result"));
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

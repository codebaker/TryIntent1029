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

        Bundle bundle = getIntent().getExtras();
        int num1 = bundle.getInt("num1",0);
        int num2 = bundle.getInt("num2",0);
        //String operator = intent.getStringExtra("operator");
        result = num1 + num2;

        ((TextView) findViewById(R.id.textViewResult)).setText(num1 +" 더하기 " + num2);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,ResultActivity.class)
                            .putExtra("result", Integer.toString(result));
        startActivity(intent);
    }
}

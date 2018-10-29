package com.codebakery.joan.tryintent1029;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int OPERATOR_PLUS = 1;
    public static final int OPERATOR_MINUS = 2;
    public static final int OPERATOR_MULTI = 3;
    public static final int OPERATOR_DIV = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼에 리스너를 단다
        ((Button)findViewById(R.id.button_plus)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_minus)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_multiplication)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_division)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String num1 = ((EditText)findViewById(R.id.editText_num1)).getText().toString();
        String num2 = ((EditText)findViewById(R.id.editText_num2)).getText().toString();

        switch (v.getId()){
            case R.id.button_plus:
                setIntent(num1,num2,OPERATOR_PLUS);
                break;
            case R.id.button_minus:
                setIntent(num1,num2,OPERATOR_MINUS);
                break;
            case R.id.button_multiplication:
                setIntent(num1,num2, OPERATOR_MULTI);
                break;
            case R.id.button_division:
                setIntent(num1,num2, OPERATOR_DIV);
                break;
        }
    }

    private void setIntent(String num1, String num2, int operator){
        Intent intent = new Intent(this,PlusActivity.class)
                .putExtra("num1",num1)
                .putExtra("num2", num2)
                .putExtra("operator",operator);

        startActivity(intent);
    }
}

package com.codebakery.joan.tryintent1029;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼에 리스너를 단다
        ((Button) findViewById(R.id.button_plus)).setOnClickListener(this);
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
                startIntent(num1,num2,"더하기", PlusActivity.class);
                break;
            case R.id.button_minus:
                startIntent(num1,num2,"빼기",MinusActivity.class);
                break;
            case R.id.button_multiplication:
                startIntent(num1,num2, "더하기",MultiplicationActivity.class);
                break;
            case R.id.button_division:
                startIntent(num1,num2, "나누기",DivisionActivity.class);
                break;
        }
    }

    private void startIntent(String num1, String num2, String operator, Class<?> activity){
        Bundle bundle = new Bundle();
        bundle.putInt("num1",Integer.parseInt(num1));
        bundle.putInt("num2",Integer.parseInt(num2));

        Intent intent = new Intent(this,activity).putExtras(bundle);
        /*        .putExtra("num1",num1)
                .putExtra("num2", num2)
                .putExtra("operator",operator);*/
        startActivity(intent);
    }
}

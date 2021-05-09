package edu.gcit.todo9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Calculator mCalculator;

    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;

    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalculator = new Calculator();
        mResultTextView = findViewById(R.id.textView);
        mOperandOneEditText = findViewById(R.id.editText1);
        mOperandTwoEditText = findViewById(R.id.editText2);
    }
    public void ADD(View view){
    String editText1 =  mOperandOneEditText.getText().toString();
    String editText2 =  mOperandTwoEditText.getText().toString();
    double value = mCalculator.add(Double.valueOf(editText1), Double.valueOf(editText2));
    mResultTextView.setText((String.valueOf(value)));
    }
    public void SUB(View view) {
        String editText1 = mOperandOneEditText.getText().toString();
        String editText2 = mOperandTwoEditText.getText().toString();
        double value = mCalculator.sub(Double.valueOf(editText1), Double.valueOf(editText2));
        mResultTextView.setText((String.valueOf(value)));
    }
    public void MULT(View view) {
        String editText1 = mOperandOneEditText.getText().toString();
        String editText2 = mOperandTwoEditText.getText().toString();
        double value = mCalculator.mul(Double.valueOf(editText1), Double.valueOf(editText2));
        mResultTextView.setText((String.valueOf(value)));
    }
    public void DIV(View view) {
        String editText1 = mOperandOneEditText.getText().toString();
        String editText2 = mOperandTwoEditText.getText().toString();
        double value = mCalculator.div(Double.valueOf(editText1), Double.valueOf(editText2));
        mResultTextView.setText((String.valueOf(value)));
    }
}

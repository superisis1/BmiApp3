package kr.insungjung.bmiapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInputActivity extends AppCompatActivity {

    EditText mName;
    EditText mAge;
    EditText mWeight;
    EditText mTall;
    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        mName = findViewById(R.id.inputNameText);
        mAge = findViewById(R.id.inputAgeText);
        mWeight = findViewById(R.id.inputWeightText);
        mTall = findViewById(R.id.inputTallText);
        mBtn = findViewById(R.id.bmiInputButton);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sName = mName.getText().toString();
                String sWeight = mWeight.getText().toString();
                String sTall = mTall.getText().toString();

                Float fWeight = Float.parseFloat(sWeight);
                Float fTall = Float.parseFloat(sTall);

                Float fBmi = fWeight / ((fTall/100)*(fTall/100));

                String sBmi = String.format("%.2f",fBmi);

                Intent intent = new Intent(UserInputActivity.this,MainActivity.class);
                intent.putExtra("Bmi지수",sBmi);
                startActivity(intent);
                finish();

            }
        });

    }
}

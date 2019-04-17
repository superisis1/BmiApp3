package kr.insungjung.bmiapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView mBmi;
    TextView mBmiLvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBmi = findViewById(R.id.bmiText);
        mBmiLvl = findViewById(R.id.bmiLevelText);

        String sBmi = getIntent().getStringExtra("Bmi지수");

        mBmi.setText(sBmi);

    }
}

package sg.edu.rp.c346.id20022735.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAns = findViewById(R.id.textView);
        Intent intentRec = getIntent();
        int value = intentRec.getIntExtra("value", 0);
        tvAns.setText("Integer value received is: " + value);
    }
}
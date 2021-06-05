package sg.edu.rp.c346.id20022735.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAns = findViewById(R.id.textView3);
        Intent intentRec = getIntent();
        double value = intentRec.getDoubleExtra("value", 99.99);
        tvAns.setText("Double value received is: " + value);
    }
}
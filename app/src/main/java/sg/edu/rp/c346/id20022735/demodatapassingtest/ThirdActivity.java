package sg.edu.rp.c346.id20022735.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAns = findViewById(R.id.textView2);
        Intent intentRec = getIntent();
        char value = intentRec.getCharExtra("value", 'a');
        tvAns.setText("Character value received is: " + value);
    }
}
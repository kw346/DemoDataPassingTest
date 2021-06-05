package sg.edu.rp.c346.id20022735.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnpassI;
    Button btnpassC;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpassI = findViewById(R.id.buttonPassInt);
        btnpassC = findViewById(R.id.buttonPassChar);
        tv = findViewById(R.id.textView3);

        btnpassI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });

        btnpassC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                intent.putExtra("value",'a');
                startActivity(intent);
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FourthActivity.class);
                intent.putExtra("value",99.99);
                startActivity(intent);
            }
        });
    }
}
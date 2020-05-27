package sg.edu.rp.c346.id18015362.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        tvAnswer.setText("Integer value received is: " + value);
    }
}

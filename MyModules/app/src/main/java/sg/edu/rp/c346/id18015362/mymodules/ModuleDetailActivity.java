package sg.edu.rp.c346.id18015362.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvAcadYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvAcadYear = findViewById(R.id.tvAcadYear);
        tvSem = findViewById(R.id.tvSem);
        tvCredit = findViewById(R.id.tvCredit);
        tvVenue = findViewById(R.id.tvVenue);
        btnReturn = findViewById(R.id.btnReturn);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        int year = intentReceived.getIntExtra("year", 0);
        int sem = intentReceived.getIntExtra("semester", 0);
        int credit = intentReceived.getIntExtra("credit", 0);
        String venue = intentReceived.getStringExtra("venue");

        tvCode.setText("Module Code: " + code);
        tvName.setText("Module Name: " + name);
        tvAcadYear.setText("Academic Year: " + year) ;
        tvSem.setText("Semester: " + sem);
        tvCredit.setText("Module Credit: " + credit);
        tvVenue.setText("Venue: " + venue);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

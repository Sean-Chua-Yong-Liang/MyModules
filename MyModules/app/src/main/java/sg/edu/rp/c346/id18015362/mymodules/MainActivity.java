package sg.edu.rp.c346.id18015362.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroid;
    TextView tvDC;
    TextView tvITSD;
    String code;
    String name;
    int acadYear;
    int sem;
    int credit;
    String venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.tvAndroid);
        tvDC = findViewById(R.id.tvDC);
        tvITSD = findViewById(R.id.tvITSD);

        tvAndroid.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                code = "C346";
                name = "Android Programming";
                acadYear = 2020;
                sem = 1;
                credit = 4;
                venue = "W67R";

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", code);
                intent.putExtra("name", name);
                intent.putExtra("year", acadYear);
                intent.putExtra("semester", sem);
                intent.putExtra("credit", credit);
                intent.putExtra("venue", venue);
                startActivity(intent);
            }
        });

        tvDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "C322";
                name = "Data Centre and Cloud Mgmt";
                acadYear = 2020;
                sem = 1;
                credit = 4;
                venue = "E61G";


                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", code);
                intent.putExtra("name", name);
                intent.putExtra("year", acadYear);
                intent.putExtra("semester", sem);
                intent.putExtra("credit", credit);
                intent.putExtra("venue", venue);
                startActivity(intent);
            }
        });

        tvITSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = "C382";
                name = "IT Service Delivery";
                acadYear = 2020;
                sem = 1;
                credit = 4;
                venue = "W67R";


                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", code);
                intent.putExtra("name", name);
                intent.putExtra("year", acadYear);
                intent.putExtra("semester", sem);
                intent.putExtra("credit", credit);
                intent.putExtra("venue", venue);
                startActivity(intent);
            }
        });

    }
}

package com.nhc.cuongnguyen.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ip_a,ip_b;
    Button btn_kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ip_a = (EditText) findViewById(R.id.ip_a);
        ip_b = (EditText) findViewById(R.id.ip_b);
        btn_kq = (Button) findViewById(R.id.btn_kq);

        btn_kq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b;
                String kq;
                if (!ip_a.getText().toString().isEmpty() && !ip_b.getText().toString().isEmpty()) {
                    a = Integer.parseInt(ip_a.getText().toString());
                    b = Integer.parseInt(ip_b.getText().toString());
                    if (a == 0) {
                        kq = "vô nghiệm";
                    } else {
                        kq = "" + (-b / a);
                    }
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("kq", kq);
                    startActivity(intent);
                }
                else Toast.makeText(MainActivity.this, "Vui lòng nhập lại", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

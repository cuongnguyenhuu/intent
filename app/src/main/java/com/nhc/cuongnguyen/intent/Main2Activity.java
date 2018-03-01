package com.nhc.cuongnguyen.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txt_kq;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_kq = (TextView) findViewById(R.id.txt_kq);
        btn_back = (Button) findViewById(R.id.btn_back);

        final Intent intent = this.getIntent();

        String kq = intent.getStringExtra("kq");
        txt_kq.setText(kq);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}

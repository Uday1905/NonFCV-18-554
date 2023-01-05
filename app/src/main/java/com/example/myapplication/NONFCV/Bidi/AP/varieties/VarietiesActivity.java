package com.example.myapplication.NONFCV.Bidi.AP.varieties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Bidi.AP.RInfra.ContactActivity;
import com.example.myapplication.NONFCV.Bidi.AP.RInfra.ResearchInfrastructureActivity;
import com.example.myapplication.NONFCV.Bidi.AP.RInfra.StationActivity;
import com.example.myapplication.R;

public class VarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varieties);

        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VarietiesActivity.this, ABDActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VarietiesActivity.this, NandyalaActivity.class);
                startActivity(intent);
            }
        });
    }
}


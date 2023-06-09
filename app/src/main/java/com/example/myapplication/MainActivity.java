package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_taiKhoan_text, edt_matKhau_text;
    Button btn_dangKi, btn_dangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("App đặt món ăn");
        }
        anhXa();
        btn_dangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DangKiActivity.class);
                startActivity(intent);
            }
        });
    }

    public void anhXa(){
        edt_taiKhoan_text = findViewById(R.id.edt_taiKhoan_text);
        edt_matKhau_text = findViewById(R.id.edt_matKhau_text);

        btn_dangNhap = findViewById(R.id.btn_dangNhap);
        btn_dangKi = findViewById(R.id.btn_dangKi);
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DangKiActivity extends AppCompatActivity {

    EditText edt_taiKhoanDangKi_text, edt_matKhauDangKi_text, edt_sdt_text;
    Button btn_dangKiTaiKhoan, btn_dangNhapNgay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Đăng kí tài khoản");
        }
        anhXa();

        btn_dangNhapNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangKiActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void anhXa(){
        edt_taiKhoanDangKi_text = findViewById(R.id.edt_taiKhoanDangKi_text);
        edt_matKhauDangKi_text  = findViewById(R.id.edt_matKhauDangKi_text);
        edt_sdt_text = findViewById(R.id.edt_sdt_text);

        btn_dangKiTaiKhoan = findViewById(R.id.btn_dangkiTaiKhoan);
        btn_dangNhapNgay = findViewById(R.id.btn_dangNhapNgay);
    }
}
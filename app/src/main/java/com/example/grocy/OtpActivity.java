package com.example.grocy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OtpActivity extends AppCompatActivity {

    Button btnOtpLogin;

    TextView tvResend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        btnOtpLogin = findViewById(R.id.otp_login_btn);
        tvResend = findViewById(R.id.textViewResend);
        btnOtpLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtpActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        tvResend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OtpActivity.this, "Code is resend!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

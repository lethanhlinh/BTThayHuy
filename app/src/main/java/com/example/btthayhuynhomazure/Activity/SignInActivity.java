package com.example.btthayhuynhomazure.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btthayhuynhomazure.R;

public class SignInActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        // Ánh xạ các view
        usernameEditText = findViewById(R.id.email_input);
        passwordEditText = findViewById(R.id.password_input);
        signInButton = findViewById(R.id.sign_in_button);

        // Bắt sự kiện nút đăng nhập
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Kiểm tra xem có bỏ trống trường nào không
                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                    Toast.makeText(SignInActivity.this, "vui lòng nhập đủ thông tin!", Toast.LENGTH_SHORT).show();
                } else {
                    // Kiểm tra thông tin đăng nhập
                    if (username.equals("linhquanviet") && password.equals("123123@")) {
                        // Nếu đúng, chuyển sang màn hình Home
                        Toast.makeText(SignInActivity.this, "Login thành công!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        // Nếu sai, hiển thị thông báo lỗi
                        Toast.makeText(SignInActivity.this, "Tài khoản hay mật khẩu bị sai vui lòng nhập lại! ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}

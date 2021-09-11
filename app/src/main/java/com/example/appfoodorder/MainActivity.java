package com.example.appfoodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText etUserNameCode, etPassWordCode;
    Button btnCickCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserNameCode = findViewById(R.id.etUserName);
        etPassWordCode = findViewById(R.id.etPassWord);
        btnCickCode = findViewById(R.id.btnCick);

        btnCickCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mk = etPassWordCode.getText().toString();
                String regex = "abc";
                Pattern p = Pattern.compile(regex);
                if(p.matcher(mk).matches()==true){
                    Toast.makeText(getBaseContext(),"Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    Intent mh2 = new Intent(MainActivity.this, ScreenListFood.class);
                    startActivity(mh2);
                }else{
                    Toast.makeText(getBaseContext(),"Mật Khẩu sai!",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
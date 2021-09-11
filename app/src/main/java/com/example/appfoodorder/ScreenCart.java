package com.example.appfoodorder;

import static com.example.appfoodorder.ScreenListFood.tinhTien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ScreenCart extends AppCompatActivity {
    ImageView imgQuayLai;
    AdapterFood adapterFood;
    ListView lvFood;
    TextView tvTongTienCode;
    Double tongtien=  tinhTien;
    List<Food> foods=ScreenListFood.foodorders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_cart);
        lvFood=findViewById(R.id.lvFood1);
        adapterFood = new AdapterFood(foods);
        lvFood.setAdapter(adapterFood);
        tvTongTienCode=findViewById(R.id.tvTongTien);
        tvTongTienCode.setText(Double.toString(tongtien));
        imgQuayLai=findViewById(R.id.imgQuayLai);
        imgQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhc = new Intent(getBaseContext(), ScreenListFood.class);
                startActivity(mhc);
            }
        });
    }
}
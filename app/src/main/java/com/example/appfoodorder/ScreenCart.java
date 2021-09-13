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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ScreenCart extends AppCompatActivity {
    ImageView imgQuayLai;
    AdapterFood1 adapterFood1;
    ListView lvFood;
    TextView tvTongTienCode;
    Double tongtien=  tinhTien;
    //Set<Food> food1=ScreenListFood.foodSet;
    List<Food> food1=ScreenListFood.foodSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_cart);
        conNec();

        adapterFood1 = new AdapterFood1(food1);
        lvFood.setAdapter(adapterFood1);
        //
        tvTongTienCode.setText(Double.toString(tongtien));
        //
        imgQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhc = new Intent(getBaseContext(), ScreenListFood.class);
                startActivity(mhc);
            }
        });
    }
    private void conNec(){
        lvFood=findViewById(R.id.lvFoodx);
        tvTongTienCode=findViewById(R.id.tvTongTien);
        imgQuayLai=findViewById(R.id.imgQuayLai);
    }
}
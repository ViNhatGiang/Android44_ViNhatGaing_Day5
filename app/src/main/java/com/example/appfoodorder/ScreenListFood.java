package com.example.appfoodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ScreenListFood extends AppCompatActivity {
   // public static Set<Food> foodSet= new HashSet<>();
    public static List<Food> foodSet=new ArrayList<>();
    ListView lvFood;
    List<Food> foods;
    Food food00, food01, food02, food03, food04, food05;
    AdapterFood adapterFood;
    Button btnOrder;
    RelativeLayout btnGioHang;
    TextView tvSoLuongGioCode, tvTongTienCode, tvThankCode;
    public static double tinhTien = 0;
    public static int soLuongFood = 0;
    int number = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_list_food);

        tvSoLuongGioCode = findViewById(R.id.soLuong);
        tvTongTienCode = findViewById(R.id.tvTongTien);
        lvFood = findViewById(R.id.lvFood);
        btnGioHang = findViewById(R.id.btnGiohang);
        foods = new ArrayList<>();
        food00 = new Food("Pizza Panda", 10, 1);
        food01 = new Food("KFC Super", 10, 1);
        food02 = new Food("Bread Eggs", 10, 1);
        food03 = new Food("Coca Cola", 10, 1);
        food04 = new Food("Chicken super", 10, 1);
        food05 = new Food("Cup Cake", 10, 1);

        foods.add(food00);
        foods.add(food01);
        foods.add(food02);
        foods.add(food03);
        foods.add(food04);
        foods.add(food05);
        adapterFood = new AdapterFood(foods);
        lvFood.setAdapter(adapterFood);
        btnOrder = findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Thank you! Your order is sent to restaurant!",Toast.LENGTH_SHORT).show();
            }
        });
        lvFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Food foodorder = foods.get(i);

                soLuongFood++;
                tinhTien += foodorder.getPrice();
                tvSoLuongGioCode.setText(Integer.toString(soLuongFood));
                tvTongTienCode.setText(Double.toString(tinhTien));
                if (!foodSet.contains(foodorder)){
                   foodSet.add(foodorder);
                }else {
                    int sl=foodSet.get(foodSet.indexOf(foodorder)).getNumber();
                    foodSet.get(foodSet.indexOf(foodorder)).setNumber(sl+1);
                }


            }
        });
        tvSoLuongGioCode.setText(Integer.toString(soLuongFood));
        tvTongTienCode.setText(Double.toString(tinhTien));

        //Click cart
        btnGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhGioHang = new Intent(getBaseContext(), ScreenCart.class);
                startActivity(mhGioHang);
            }
        });

    }
}
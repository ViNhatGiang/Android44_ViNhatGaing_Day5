package com.example.appfoodorder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterFood extends BaseAdapter {
List<Food> foods;

    public AdapterFood(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public int getCount() {
        return foods.size();
    }

    @Override
    public Object getItem(int i) {
        return foods.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View v = layoutInflater.inflate(R.layout.item_listview,viewGroup,false);
        TextView tvname = v.findViewById(R.id.tvTenMonAn);
        Food food = foods.get(i);
        tvname.setText(food.getNameFood());
        return v;
    }
}

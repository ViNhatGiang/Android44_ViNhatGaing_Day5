package com.example.appfoodorder;

public class Food {
    String nameFood;
    double price;
    int number;

    public Food(String nameFood, double price, int number) {
        this.nameFood = nameFood;
        this.price = price;
        this.number = number;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

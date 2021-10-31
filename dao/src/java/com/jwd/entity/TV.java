package com.jwd.entity;

import java.util.ArrayList;
import java.util.List;

public class TV {
    private String type;
    private float diagonal;
    private int frequency;
    private float price;

    public static List<TV> createInstances(List<List<String>> tvsInfo) {
        List<TV> tvs = new ArrayList<>();
        for (List<String> currentTVInfo :
                tvsInfo) {
            TV newTV = new TV(currentTVInfo.get(0), Float.valueOf(currentTVInfo.get(1)), Integer.valueOf(currentTVInfo.get(2)), Float.valueOf(currentTVInfo.get(3)));
            tvs.add(newTV);
        }
        return tvs;
    }

    public TV(String type, float diagonal, int frequency, float price) {
        this.type = type;
        this.diagonal = diagonal;
        this.frequency = frequency;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "type='" + type + '\'' +
                ", diagonal=" + diagonal +
                ", frequency=" + frequency +
                ", price=" + price +
                '}';
    }
}

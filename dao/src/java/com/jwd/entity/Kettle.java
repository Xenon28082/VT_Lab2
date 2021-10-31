package com.jwd.entity;

import java.util.ArrayList;
import java.util.List;

public class Kettle{

    private float volume;
    private String compatibility;
    private String grip;
    private float price;

    public static List<Kettle> createInstances(List<List<String>> kettlesInfo){
        List<Kettle> kettles = new ArrayList<>();
        for (List<String> currentKettleInfo:
             kettlesInfo) {
            Kettle newKettle =  new Kettle(Float.valueOf(currentKettleInfo.get(0)), currentKettleInfo.get(1), currentKettleInfo.get(2), Float.valueOf(currentKettleInfo.get(3)));
            kettles.add(newKettle);
        }
        return kettles;
    }

    public Kettle(float volume, String compatibility, String grip, float price) {
        this.volume = volume;
        this.compatibility = compatibility;
        this.grip = grip;
        this.price = price;
    }


    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    public String getGrip() {
        return grip;
    }

    public void setGrip(String grip) {
        this.grip = grip;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "volume=" + volume +
                ", compatibility='" + compatibility + '\'' +
                ", grip='" + grip + '\'' +
                ", price=" + price +
                '}';
    }
}

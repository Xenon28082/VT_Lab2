package com.jwd.entity;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private String construction;
    private String deployment;
    private int height;
    private int width;
    private float price;


    public static List<Fridge> createInstances(List<List<String>> fridgesInfo) {
        List<Fridge> fridges = new ArrayList<>();
        for (List<String> currentFridgeInfo :
                fridgesInfo) {
            Fridge newfridge = new Fridge(currentFridgeInfo.get(0), currentFridgeInfo.get(1), Integer.valueOf(currentFridgeInfo.get(2)), Integer.valueOf(currentFridgeInfo.get(3)), Float.valueOf(currentFridgeInfo.get(4)));
            fridges.add(newfridge);
        }
        return fridges;
    }

    public Fridge(String construction, String deployment, int height, int width, float price) {
        this.construction = construction;
        this.deployment = deployment;
        this.height = height;
        this.width = width;
        this.price = price;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getDeployment() {
        return deployment;
    }

    public void setDeployment(String deployment) {
        this.deployment = deployment;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "construction='" + construction + '\'' +
                ", deployment='" + deployment + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                '}';
    }
}

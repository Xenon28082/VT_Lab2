package com.jwd.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс холодильников с полями <b>construction</b>, <b>height</b>, <b>width</b>.
 * @author savva
 */
public class Fridge extends Item{
    /**Поле тип конструкции*/
    private String construction;
    /**Поле высота*/
    private int height;
    /**Поле ширина*/
    private int width;

    /**
     * @param fridgesInfo - список информации о холодильниках
     * @return возвращает список объектов типа Fridge
     */
    public static List<Fridge> createInstances(List<List<String>> fridgesInfo) {
        List<Fridge> fridges = new ArrayList<>();
        for (List<String> currentFridgeInfo :
                fridgesInfo) {
            Fridge newfridge = new Fridge(currentFridgeInfo.get(0), Integer.valueOf(currentFridgeInfo.get(1)), Integer.valueOf(currentFridgeInfo.get(2)), Float.valueOf(currentFridgeInfo.get(3)), currentFridgeInfo.get(4));
            fridges.add(newfridge);
        }
        return fridges;
    }

    /**
     * @param construction - тип конструкции
     * @param height - высота
     * @param width - ширина
     * @param price - цена
     * @param vendor - производитель
     */
    public Fridge(String construction, int height, int width, float price, String vendor) {
        this.vendor = vendor;
        this.construction = construction;
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

    @Override
    public String toString() {
        return "Fridge{" +
                "construction='" + construction + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}

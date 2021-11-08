package com.jwd.entity;

import java.util.ArrayList;
import java.util.List;


/**
 * Класс телевизоров с полями <b>type</b>, <b>diagonal</b>, <b>frequency</b>
 * @author savva
 */
public class TV extends Item{
    /**Поле тип матрицы*/
    private String type;
    /**Поле длина диагонали*/
    private float diagonal;
    /**Поле частота обновления экрана*/
    private int frequency;


    /**
     * @param tvsInfo - список информации о телевизорах
     * @return возвращает список объектов тиа TV
     */
    public static List<TV> createInstances(List<List<String>> tvsInfo) {
        List<TV> tvs = new ArrayList<>();
        for (List<String> currentTVInfo :
                tvsInfo) {
            TV newTV = new TV(currentTVInfo.get(0), Float.valueOf(currentTVInfo.get(1)), Integer.valueOf(currentTVInfo.get(2)), Float.valueOf(currentTVInfo.get(3)), currentTVInfo.get(4));
            tvs.add(newTV);
        }
        return tvs;
    }

    /**
     * @param type - тип матрицы
     * @param diagonal - длина диагонали
     * @param frequency - частота обновления экрана
     * @param price - цена
     * @param vendor - производитель
     */
    public TV(String type, float diagonal, int frequency, float price, String vendor) {
        this.vendor = vendor;
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

    @Override
    public String toString() {
        return "TV{" +
                "price=" + price +
                ", vendor='" + vendor + '\'' +
                ", type='" + type + '\'' +
                ", diagonal=" + diagonal +
                ", frequency=" + frequency +
                '}';
    }
}

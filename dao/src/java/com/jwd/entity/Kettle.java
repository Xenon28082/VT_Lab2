package com.jwd.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс чайников с полями <b>volume</b>, <b>compatibility</b>.
 * @author savva
 */
public class Kettle extends Item{

    /**Поле объём*/
    private float volume;
    /**Поле совместимость*/
    private String compatibility;

    /**
     * @param kettlesInfo - список информации о чайниках
     * @return возвращает список объектов типа Kettle
     */
    public static List<Kettle> createInstances(List<List<String>> kettlesInfo){
        List<Kettle> kettles = new ArrayList<>();
        for (List<String> currentKettleInfo:
             kettlesInfo) {
            Kettle newKettle =  new Kettle(Float.valueOf(currentKettleInfo.get(0)), currentKettleInfo.get(1), Float.valueOf(currentKettleInfo.get(2)), currentKettleInfo.get(3));
            kettles.add(newKettle);
        }
        return kettles;
    }

    /**
     * @param volume - объём
     * @param compatibility - совместимость
     * @param price - цена
     * @param vendor - производитель
     */
    public Kettle(float volume, String compatibility, float price, String vendor) {
        this.vendor = vendor;
        this.volume = volume;
        this.compatibility = compatibility;
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

    @Override
    public String toString() {
        return "Kettle{" +
                "price=" + price +
                ", vendor='" + vendor + '\'' +
                ", volume=" + volume +
                ", compatibility='" + compatibility + '\'' +
                '}';
    }
}

package com.jwd.Main;

import Comparators.FridgePriceComparator;
import Comparators.ItemPriceComparator;
import Comparators.KettlePriceComparator;
import Comparators.TVPriceComparator;
import com.jwd.Service.ItemService;
import com.jwd.ServiceImpl.ItemServiceImpl;
import com.jwd.entity.Fridge;
import com.jwd.entity.Kettle;
import com.jwd.entity.TV;

import java.util.List;


public class Main {

    public static void printLowestCostItem(Kettle kettle, Fridge fridge, TV tv) {
        System.out.println("Item with the lowest cost:");
        if (kettle.getPrice() < fridge.getPrice() && kettle.getPrice() < tv.getPrice()) {
            System.out.println(kettle);
        } else if (fridge.getPrice() < kettle.getPrice() && fridge.getPrice() < tv.getPrice()) {
            System.out.println(fridge);
        } else System.out.println(tv);
    }

    public static void main(String[] args) {
        ItemService itemService = new ItemServiceImpl();
        List<Kettle> kettles = itemService.getKettles();
        List<Fridge> fridges = itemService.getFridges();
        List<TV> tvs = itemService.getTVs();

        kettles.sort(new ItemPriceComparator());
        fridges.sort(new ItemPriceComparator());
        tvs.sort(new ItemPriceComparator());

        System.out.println("Kettles:");
        System.out.println(kettles);

        printLowestCostItem(kettles.get(0), fridges.get(0), tvs.get(0));

    }
}

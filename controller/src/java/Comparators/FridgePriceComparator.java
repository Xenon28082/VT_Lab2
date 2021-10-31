package Comparators;

import com.jwd.entity.Fridge;

import java.util.Comparator;

public class FridgePriceComparator implements Comparator<Fridge> {


    @Override
    public int compare(Fridge o1, Fridge o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() < o2.getPrice()){
            return -1;
        }else
            return 0;
    }
}

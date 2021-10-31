package Comparators;

import com.jwd.entity.TV;

import java.util.Comparator;

public class TVPriceComparator implements Comparator<TV> {
    @Override
    public int compare(TV o1, TV o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() < o2.getPrice()){
            return -1;
        }else
            return 0;
    }
}

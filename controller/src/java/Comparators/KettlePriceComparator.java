package Comparators;

import com.jwd.entity.Kettle;

import java.util.Comparator;

public class KettlePriceComparator implements Comparator<Kettle> {

    @Override
    public int compare(Kettle o1, Kettle o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() < o2.getPrice()){
            return -1;
        }else
            return 0;
    }
}

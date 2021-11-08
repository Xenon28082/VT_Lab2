package com.jwd.dao;

import com.jwd.entity.Fridge;
import com.jwd.entity.Kettle;
import com.jwd.entity.TV;

import java.util.List;

public interface ItemDAO {

    /**
     * @return list of kettles in xml file
     */
    List<Kettle> getKettles();

    /**
     * @return list of tvs in xml file
     */
    List<TV> getTVs();

    /**
     * @return list of fridges in xml file
     */
    List<Fridge> getFridges();

}

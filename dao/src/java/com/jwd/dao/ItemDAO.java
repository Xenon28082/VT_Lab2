package com.jwd.dao;

import com.jwd.entity.Fridge;
import com.jwd.entity.Kettle;
import com.jwd.entity.TV;

import java.util.List;

public interface ItemDAO {

    List<List<String>> getItems(String className);

    List<Kettle> getKettles();

    List<TV> getTVs();

    List<Fridge> getFridges();

}

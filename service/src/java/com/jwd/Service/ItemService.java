package com.jwd.Service;

import com.jwd.entity.Fridge;
import com.jwd.entity.Kettle;
import com.jwd.entity.TV;

import java.util.List;

public interface ItemService {
    List<Kettle> getKettles();

    List<TV> getTVs();

    List<Fridge> getFridges();
}

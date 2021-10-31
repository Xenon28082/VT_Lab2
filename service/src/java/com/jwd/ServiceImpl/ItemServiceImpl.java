package com.jwd.ServiceImpl;

import com.jwd.Service.ItemService;
import com.jwd.dao.ItemDAO;
import com.jwd.daoImpl.ItemDAOImpl;
import com.jwd.entity.Fridge;
import com.jwd.entity.Kettle;
import com.jwd.entity.TV;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    ItemDAO itemDAO = new ItemDAOImpl();

    @Override
    public List<Kettle> getKettles() {
        return itemDAO.getKettles();
    }

    @Override
    public List<TV> getTVs() {
        return itemDAO.getTVs();
    }

    @Override
    public List<Fridge> getFridges() {
        return itemDAO.getFridges();
    }
}

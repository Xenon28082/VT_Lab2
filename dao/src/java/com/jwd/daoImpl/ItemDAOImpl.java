package com.jwd.daoImpl;

import com.jwd.dao.ItemDAO;
import com.jwd.entity.Fridge;
import com.jwd.entity.Kettle;
import com.jwd.entity.TV;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ItemDAOImpl implements ItemDAO {

    private static final String DATABASE_PATH = "Goods.xml";

    private Document doc;

    /**
     * @param className - название класса, объекты которого необходимо найти в xml файле
     * @return Список объектов искомого класса
     */
    private List<List<String>> getItems(String className) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(DATABASE_PATH);
            List<List<String>> objectsInformation = new ArrayList<>();
            NodeList elementList = doc.getElementsByTagName(className);
            for (int i = 0; i < elementList.getLength(); i++) {
                Node p = elementList.item(i);
                if (p.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) p;
                    String id = element.getAttribute("id");
                    NodeList nameList = element.getChildNodes();
                    List<String> currentObjectInfo = new ArrayList<>();
                    for (int j = 0; j < nameList.getLength(); j++) {
                        Node n = nameList.item(j);
                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                            Element name = (Element) n;
                            currentObjectInfo.add(name.getTextContent());
                        }
                    }
                    objectsInformation.add(currentObjectInfo);
                }
            }
            return objectsInformation;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public List<Kettle> getKettles() {
        List<List<String>> kettleList = getItems("kettle");
        List<Kettle> kettles = Kettle.createInstances(kettleList);
        return kettles;
    }

    @Override
    public List<TV> getTVs() {
        List<List<String>> tvList = getItems("tv");
        List<TV> tvs = TV.createInstances(tvList);
        return tvs;
    }

    @Override
    public List<Fridge> getFridges() {
        List<List<String>> fridgeList = getItems("fridge");
        List<Fridge> fridges = Fridge.createInstances(fridgeList);
        return fridges;
    }

}

package com.parser;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Askar on 24.07.2014.
 */
public class Analyzer {
    public static ArrayList<RoomType> listBuilder(Element root) throws SAXException, IOException {
        ArrayList<RoomType> roomTypes = new ArrayList<RoomType>();
        NodeList roomsNodes = root.getElementsByTagName("room");
        RoomType roomType = null;
        for (int i = 0; i < roomsNodes.getLength(); i++) {
            roomType = new RoomType();
            Element roomElement = (Element) roomsNodes.item(i);
            roomType.setId(roomElement.getAttribute("id"));
            roomType.setRoomnumber(getBabyValue(roomElement, "roomnumber"));
            roomType.setPrice(Integer.parseInt(getBabyValue(roomElement, "price")));
            roomType.setSquare(Integer.parseInt(getBabyValue(roomElement, "square")));
            roomType.setBreakfast(getBabyValue(roomElement, "breakfast"));
            roomType.setWifi(Boolean.parseBoolean(getBabyValue(roomElement, "wifi")));
            roomType.setType(RoomType.Inroomtype.fromValue(getBabyValue(roomElement, "type")));
            roomType.setRoomcount(RoomType.Inroomcount.fromValue(getBabyValue(roomElement, "roomcount")));
            roomType.setPlaces(Integer.parseInt(getBabyValue(roomElement, "places")));
            roomTypes.add(roomType);

        }

        return roomTypes;
    }

    private static String getBabyValue(Element parent, String childName) {
        Element child = getBaby(parent, childName);
        Node node = child.getFirstChild();
        String value = node.getNodeValue();
        return value;
    }

    private static Element getBaby(Element parent, String childName) {
        NodeList nlist = parent.getElementsByTagName(childName);
        Element child = (Element) nlist.item(0);
        return child;

    }

}

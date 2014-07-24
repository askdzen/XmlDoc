package com.parser;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

/**
 * Created by Askar on 24.07.2014.
 */
public class StAXRoomsParser {
    public void parse(InputStream input){
        XMLInputFactory inputFactory=XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader=inputFactory.createXMLStreamReader(input);
            process(reader);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void process(XMLStreamReader reader)throws XMLStreamException{
        String name;
        while (reader.hasNext()){
            int type=reader.next();
            switch (type){
                case XMLStreamConstants.START_ELEMENT:
                    name=reader.getLocalName();
                    writeRoomFeature(name);
                    RoomsEnum enumName = RoomsEnum.valueOf(name.toUpperCase());
                    roomInfoHandle(enumName,reader);
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    break;
                case XMLStreamConstants.CHARACTERS:
                    writeText(reader.getText());
                    break;


            }
        }
    }

    private void writeText(String text) {
        System.out.print(text.trim());
    }

    private void roomInfoHandle(RoomsEnum enumName, XMLStreamReader reader) {
switch (enumName){
    case HOTEL:
        this.writeHotelTitle();
    case ROOMS:
        this.writeTitle();
        break;
    case ROOM:{
        int roomId=Integer.parseInt(reader.getAttributeValue(null, RoomsEnum.ID.name().toLowerCase()));
writeRoom(roomId);
        break;
    }

}
    }

    private void writeHotelTitle() {
        System.out.println("Hotel:");
    }

    private void writeRoom(int... args) {
        System.out.println();
        System.out.println("Room: id:" + args[0]);

    }

    private void writeTitle() {
        System.out.print("Rooms:");
    }

    private void writeRoomFeature(String name) {
        switch (RoomsEnum.valueOf(name.toUpperCase())){
case ROOMNUMBER:
    System.out.print(" Roomnumber: ");
    break;
case PRICE:
    System.out.print("; Price: ");
    break;
case SQUARE:
    System.out.print("; Square: ");
    break;
case PLACES:
    System.out.print("; Places: ");
    break;
case TYPE:
    System.out.print("; Type: ");
    break;
case ROOMCOUNT:
    System.out.print("; Roomcount: ");
    break;
case BREAKFAST:
    System.out.print("; Breakfast: ");
    break;
case WIFI:
    System.out.print("; WiFi: ");
    break;

        }
    }

    /**
     * Created by Askar on 24.07.2014.
     */
    public static enum RoomsEnum {
        HOTEL, ROOMS, ROOM,ID,ROOMNUMBER,PRICE,SQUARE,PLACES,TYPE,ROOMCOUNT,BREAKFAST,WIFI;

    }
}

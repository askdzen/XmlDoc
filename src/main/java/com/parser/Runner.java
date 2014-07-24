package com.parser;



import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Askar on 24.07.2014.
 */
public class Runner {
    public static void main(String[] args)throws IOException,SAXException,ParserConfigurationException {
        System.out.println("Parsing with SAX parser:");
        javax.xml.parsers.SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setValidating(false);
        javax.xml.parsers.SAXParser sp = spf.newSAXParser();
        SimpleSAXExample handler =new SimpleSAXExample();
        sp.parse(new File("src/main/resources/Rooms.xml"),handler);

        System.out.println("Parsing with StAX parser:");
        StAXRoomsParser parser=new StAXRoomsParser();
        InputStream input=new FileInputStream("src/main/resources/Rooms.xml");
        parser.parse(input);
        System.out.println();
        System.out.println("Parsing with DOM parser:");

       try {
            DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            DocumentBuilder db=dbf.newDocumentBuilder();
            Document document=db.parse("src/main/resources/Rooms.xml");
            Element root = document.getDocumentElement();
            ArrayList<RoomType>roomTypes=Analyzer.listBuilder(root);
            for (int i = 0; i < roomTypes.size(); i++) {
                System.out.println(roomTypes.get(i));
            }

        }catch (SAXException e){
            e.printStackTrace();
            System.out.println("ошибка SAX парсера");

        }catch (ParserConfigurationException e){
            e.printStackTrace();
            System.out.println("ошибка конфигурации");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("ошибка I/O потока");
        }


    }
}

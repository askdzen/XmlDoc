package com.parser;


import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * Created by Администратор on 23.07.2014.
 */
public class SimpleSAXExample extends DefaultHandler {
    StringBuffer accumulator = new StringBuffer();
    int roomId;
    int roomnumber;
    int price;
    int square;
    int places;
    String type;
    String roomcount;
    boolean breakfast;
    boolean wifi;

    @Override
    public void endDocument() {
        System.out.println("Parsing ended");
    }

    @Override
    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        accumulator.setLength(0);
        if(qName.equals("room"))
            roomId=Integer.parseInt(attributes.getValue("id"));
    }

    @Override
    public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
        accumulator.append(ch,start,length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws org.xml.sax.SAXException {
       if (qName.equals("roomnumber")){
           roomnumber=Integer.parseInt(accumulator.toString().trim());
       }else if (qName.equals("price")){
           price=Integer.parseInt(accumulator.toString().trim());
       }else if (qName.equals("square")){
           square=Integer.parseInt(accumulator.toString().trim());
       }else if (qName.equals("places")){
           places=Integer.parseInt(accumulator.toString().trim());
       }else if (qName.equals("type")){
           type=accumulator.toString().trim();
       }else if (qName.equals("roomcount")){
           roomcount=accumulator.toString().trim();
       }else if (qName.equals("breakfast")){
           breakfast=Boolean.parseBoolean(accumulator.toString().trim());
       }else if (qName.equals("wifi")){
           wifi=Boolean.parseBoolean(accumulator.toString().trim());
       }else if (qName.equals("room")){
           System.out.println("Room "+roomnumber+((roomId !=0)?" (id ="+roomId+")":"")+": "+ type+ " цена за сутки: "+price+" рублей;"+" площадь: "+square+"; количество мест: "+places+"; количество комнат: "+roomcount+"; наличие завтрака: "+breakfast+"; наличие WiFi: " + wifi);
       }
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("parsing started");
    }

    @Override
    public void warning(SAXParseException e) {
        System.err.println("WARNING: line "+e.getLineNumber()+": "+e.getMessage());
    }

    @Override
    public void error(SAXParseException e)  {
        System.err.println("ERROR: line "+e.getLineNumber()+": "+e.getMessage());
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        System.err.println("FATAL: line "+e.getLineNumber()+": "+e.getMessage());
        throw (e);
    }
}

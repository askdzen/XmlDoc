
package com.parser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.parser package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hotel_QNAME = new QName("http://www.example.com/Hotel", "hotel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.parser
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HotelType }
     * 
     */
    public HotelType createHotelType() {
        return new HotelType();
    }

    /**
     * Create an instance of {@link RoomsType }
     * 
     */
    public RoomsType createRoomsType() {
        return new RoomsType();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/Hotel", name = "hotel")
    public JAXBElement<HotelType> createHotel(HotelType value) {
        return new JAXBElement<HotelType>(_Hotel_QNAME, HotelType.class, null, value);
    }

}

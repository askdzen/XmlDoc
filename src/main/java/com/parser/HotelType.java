
package com.parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hotelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hotelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rooms" type="{http://www.example.com/Hotel}roomsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelType", namespace = "http://www.example.com/Hotel", propOrder = {
    "rooms"
})
public class HotelType {

    @XmlElement(required = true)
    protected RoomsType rooms;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link RoomsType }
     *     
     */
    public RoomsType getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomsType }
     *     
     */
    public void setRooms(RoomsType value) {
        this.rooms = value;
    }

}

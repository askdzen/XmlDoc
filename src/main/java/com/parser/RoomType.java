
package com.parser;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for roomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomnumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="square" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="places" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.example.com/Hotel}inroomtype"/>
 *         &lt;element name="roomcount" type="{http://www.example.com/Hotel}inroomcount"/>
 *         &lt;element name="breakfast" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wifi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomType", namespace = "http://www.example.com/Hotel", propOrder = {
    "roomnumber",
    "price",
    "square",
    "places",
    "type",
    "roomcount",
    "breakfast",
    "wifi"
})
public class RoomType {

    @XmlElement(required = true)
    protected String roomnumber;
    protected int price;
    protected int square;
    protected int places;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Inroomtype type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Inroomcount roomcount;
    @XmlElement(required = true)
    protected String breakfast;
    protected boolean wifi;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the roomnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomnumber() {
        return roomnumber;
    }

    /**
     * Sets the value of the roomnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomnumber(String value) {
        this.roomnumber = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the square property.
     * 
     */
    public int getSquare() {
        return square;
    }

    /**
     * Sets the value of the square property.
     * 
     */
    public void setSquare(int value) {
        this.square = value;
    }

    /**
     * Gets the value of the places property.
     * 
     */
    public int getPlaces() {
        return places;
    }

    /**
     * Sets the value of the places property.
     * 
     */
    public void setPlaces(int value) {
        this.places = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Inroomtype }
     *     
     */
    public Inroomtype getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inroomtype }
     *     
     */
    public void setType(Inroomtype value) {
        this.type = value;
    }

    /**
     * Gets the value of the roomcount property.
     * 
     * @return
     *     possible object is
     *     {@link Inroomcount }
     *     
     */
    public Inroomcount getRoomcount() {
        return roomcount;
    }

    /**
     * Sets the value of the roomcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inroomcount }
     *     
     */
    public void setRoomcount(Inroomcount value) {
        this.roomcount = value;
    }

    /**
     * Gets the value of the breakfast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakfast() {
        return breakfast;
    }

    /**
     * Sets the value of the breakfast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakfast(String value) {
        this.breakfast = value;
    }

    /**
     * Gets the value of the wifi property.
     * 
     */
    public boolean isWifi() {
        return wifi;
    }

    /**
     * Sets the value of the wifi property.
     * 
     */
    public void setWifi(boolean value) {
        this.wifi = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * <p>Java class for inroomcount.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType name="inroomcount">
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="SINGLE"/>
     *     &lt;enumeration value="DOUBLE"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     *
     */
    @XmlType(name = "inroomcount", namespace = "http://www.example.com/Hotel")
    @XmlEnum
    public static enum Inroomcount {

        SINGLE,
        DOUBLE;

        public String value() {
            return name();
        }

        public static Inroomcount fromValue(String v) {
            return Inroomcount.valueOf(v);
        }

    }

    /**
     * <p>Java class for inroomtype.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType name="inroomtype">
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="Residentroom"/>
     *     &lt;enumeration value="Conferenceroom"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     *
     */
    @XmlType(name = "inroomtype", namespace = "http://www.example.com/Hotel")
    @XmlEnum
    public static enum Inroomtype {

        @XmlEnumValue("Residentroom")
        RESIDENTROOM("Residentroom"),
        @XmlEnumValue("Conferenceroom")
        CONFERENCEROOM("Conferenceroom");
        private final String value;

        Inroomtype(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Inroomtype fromValue(String v) {
            for (Inroomtype c: Inroomtype.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomnumber='" + roomnumber + '\'' +
                ", price=" + price +
                ", square=" + square +
                ", places=" + places +
                ", type=" + type +
                ", roomcount=" + roomcount +
                ", breakfast='" + breakfast + '\'' +
                ", wifi=" + wifi +
                ", id='" + id + '\'' +
                '}';
    }
}

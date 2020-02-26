//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.addr;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Addr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Addr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddrCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuildingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateProvCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P.O.B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillAddrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaysActDate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addr", propOrder = {
    "addrCod",
    "addr",
    "addrType",
    "country",
    "stateProv",
    "city",
    "postalCode",
    "streetType",
    "street",
    "buildingType",
    "building",
    "level",
    "number",
    "sectorType",
    "sector",
    "stateProvCod",
    "cityCod",
    "pob",
    "billAddrInd",
    "daysActDate"
})
public class Addr {

    @XmlElement(name = "AddrCod")
    protected String addrCod;
    @XmlElement(name = "Addr")
    protected String addr;
    @XmlElement(name = "AddrType")
    protected String addrType;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "StateProv")
    protected String stateProv;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "StreetType")
    protected String streetType;
    @XmlElement(name = "Street")
    protected List<String> street;
    @XmlElement(name = "BuildingType")
    protected String buildingType;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Level")
    protected String level;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "SectorType")
    protected String sectorType;
    @XmlElement(name = "Sector")
    protected String sector;
    @XmlElement(name = "StateProvCod")
    protected String stateProvCod;
    @XmlElement(name = "CityCod")
    protected String cityCod;
    @XmlElement(name = "P.O.B")
    protected String pob;
    @XmlElement(name = "BillAddrInd")
    protected String billAddrInd;
    @XmlElement(name = "DaysActDate")
    protected BigInteger daysActDate;

    /**
     * Obtiene el valor de la propiedad addrCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrCod() {
        return addrCod;
    }

    /**
     * Define el valor de la propiedad addrCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrCod(String value) {
        this.addrCod = value;
    }

    /**
     * Obtiene el valor de la propiedad addr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Define el valor de la propiedad addr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * Obtiene el valor de la propiedad addrType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrType() {
        return addrType;
    }

    /**
     * Define el valor de la propiedad addrType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrType(String value) {
        this.addrType = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad stateProv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Define el valor de la propiedad stateProv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad streetType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Define el valor de la propiedad streetType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the street property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreet() {
        if (street == null) {
            street = new ArrayList<String>();
        }
        return this.street;
    }

    /**
     * Obtiene el valor de la propiedad buildingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingType() {
        return buildingType;
    }

    /**
     * Define el valor de la propiedad buildingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingType(String value) {
        this.buildingType = value;
    }

    /**
     * Obtiene el valor de la propiedad building.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Define el valor de la propiedad building.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorType() {
        return sectorType;
    }

    /**
     * Define el valor de la propiedad sectorType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorType(String value) {
        this.sectorType = value;
    }

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Obtiene el valor de la propiedad stateProvCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvCod() {
        return stateProvCod;
    }

    /**
     * Define el valor de la propiedad stateProvCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvCod(String value) {
        this.stateProvCod = value;
    }

    /**
     * Obtiene el valor de la propiedad cityCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCod() {
        return cityCod;
    }

    /**
     * Define el valor de la propiedad cityCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCod(String value) {
        this.cityCod = value;
    }

    /**
     * Obtiene el valor de la propiedad pob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOB() {
        return pob;
    }

    /**
     * Define el valor de la propiedad pob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOB(String value) {
        this.pob = value;
    }

    /**
     * Obtiene el valor de la propiedad billAddrInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddrInd() {
        return billAddrInd;
    }

    /**
     * Define el valor de la propiedad billAddrInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddrInd(String value) {
        this.billAddrInd = value;
    }

    /**
     * Obtiene el valor de la propiedad daysActDate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysActDate() {
        return daysActDate;
    }

    /**
     * Define el valor de la propiedad daysActDate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysActDate(BigInteger value) {
        this.daysActDate = value;
    }

}

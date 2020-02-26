//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardLogicalData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardLogicalData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardEmbossNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}dateTimePattern" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}dateTimePattern" minOccurs="0"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplacementInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Chip" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}Chip" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardLogicalStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}CardLogicalStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}dateTimePattern" minOccurs="0"/&gt;
 *         &lt;element name="BatchNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Obser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Courier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}dateTimePattern" minOccurs="0"/&gt;
 *         &lt;element name="PeriodChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HolderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}AuthInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardLogicalData", propOrder = {
    "cardEmbossNum",
    "issDt",
    "expDt",
    "brand",
    "name",
    "replacementInd",
    "chip",
    "cardLogicalStatus",
    "effDt",
    "batchNum",
    "obser",
    "courier",
    "deliveryDt",
    "periodChange",
    "holderType",
    "authInfo"
})
public class CardLogicalData {

    @XmlElement(name = "CardEmbossNum")
    protected String cardEmbossNum;
    @XmlElement(name = "IssDt")
    protected String issDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ReplacementInd")
    protected String replacementInd;
    @XmlElement(name = "Chip")
    protected List<Chip> chip;
    @XmlElement(name = "CardLogicalStatus")
    protected List<CardLogicalStatus> cardLogicalStatus;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "BatchNum")
    protected String batchNum;
    @XmlElement(name = "Obser")
    protected String obser;
    @XmlElement(name = "Courier")
    protected String courier;
    @XmlElement(name = "DeliveryDt")
    protected String deliveryDt;
    @XmlElement(name = "PeriodChange")
    protected String periodChange;
    @XmlElement(name = "HolderType")
    protected String holderType;
    @XmlElement(name = "AuthInfo")
    protected AuthInfo authInfo;

    /**
     * Obtiene el valor de la propiedad cardEmbossNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmbossNum() {
        return cardEmbossNum;
    }

    /**
     * Define el valor de la propiedad cardEmbossNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmbossNum(String value) {
        this.cardEmbossNum = value;
    }

    /**
     * Obtiene el valor de la propiedad issDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssDt() {
        return issDt;
    }

    /**
     * Define el valor de la propiedad issDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssDt(String value) {
        this.issDt = value;
    }

    /**
     * Obtiene el valor de la propiedad expDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Define el valor de la propiedad expDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad replacementInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementInd() {
        return replacementInd;
    }

    /**
     * Define el valor de la propiedad replacementInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementInd(String value) {
        this.replacementInd = value;
    }

    /**
     * Gets the value of the chip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chip }
     * 
     * 
     */
    public List<Chip> getChip() {
        if (chip == null) {
            chip = new ArrayList<Chip>();
        }
        return this.chip;
    }

    /**
     * Gets the value of the cardLogicalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardLogicalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardLogicalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardLogicalStatus }
     * 
     * 
     */
    public List<CardLogicalStatus> getCardLogicalStatus() {
        if (cardLogicalStatus == null) {
            cardLogicalStatus = new ArrayList<CardLogicalStatus>();
        }
        return this.cardLogicalStatus;
    }

    /**
     * Obtiene el valor de la propiedad effDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Define el valor de la propiedad effDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Obtiene el valor de la propiedad batchNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNum() {
        return batchNum;
    }

    /**
     * Define el valor de la propiedad batchNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNum(String value) {
        this.batchNum = value;
    }

    /**
     * Obtiene el valor de la propiedad obser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObser() {
        return obser;
    }

    /**
     * Define el valor de la propiedad obser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObser(String value) {
        this.obser = value;
    }

    /**
     * Obtiene el valor de la propiedad courier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourier() {
        return courier;
    }

    /**
     * Define el valor de la propiedad courier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourier(String value) {
        this.courier = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDt() {
        return deliveryDt;
    }

    /**
     * Define el valor de la propiedad deliveryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDt(String value) {
        this.deliveryDt = value;
    }

    /**
     * Obtiene el valor de la propiedad periodChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodChange() {
        return periodChange;
    }

    /**
     * Define el valor de la propiedad periodChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodChange(String value) {
        this.periodChange = value;
    }

    /**
     * Obtiene el valor de la propiedad holderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderType() {
        return holderType;
    }

    /**
     * Define el valor de la propiedad holderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderType(String value) {
        this.holderType = value;
    }

    /**
     * Obtiene el valor de la propiedad authInfo.
     * 
     * @return
     *     possible object is
     *     {@link AuthInfo }
     *     
     */
    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    /**
     * Define el valor de la propiedad authInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthInfo }
     *     
     */
    public void setAuthInfo(AuthInfo value) {
        this.authInfo = value;
    }

}

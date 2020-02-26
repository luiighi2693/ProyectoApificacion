//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctBal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctBal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}CurAmt" minOccurs="0"/&gt;
 *         &lt;element name="BalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="SignalBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}dateTimePattern" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctBal", propOrder = {
    "curAmt",
    "balType",
    "expDt",
    "signalBalance",
    "desc",
    "effDt"
})
public class AcctBal {

    @XmlElement(name = "CurAmt")
    protected CurAmt curAmt;
    @XmlElement(name = "BalType")
    protected String balType;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "SignalBalance")
    protected String signalBalance;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "EffDt")
    protected String effDt;

    /**
     * Obtiene el valor de la propiedad curAmt.
     * 
     * @return
     *     possible object is
     *     {@link CurAmt }
     *     
     */
    public CurAmt getCurAmt() {
        return curAmt;
    }

    /**
     * Define el valor de la propiedad curAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmt }
     *     
     */
    public void setCurAmt(CurAmt value) {
        this.curAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad balType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalType() {
        return balType;
    }

    /**
     * Define el valor de la propiedad balType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalType(String value) {
        this.balType = value;
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
     * Obtiene el valor de la propiedad signalBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalBalance() {
        return signalBalance;
    }

    /**
     * Define el valor de la propiedad signalBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalBalance(String value) {
        this.signalBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
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

}

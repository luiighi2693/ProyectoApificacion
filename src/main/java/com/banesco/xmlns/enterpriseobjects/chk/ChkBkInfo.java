//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.chk;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChkBkInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChkBkInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChkNumStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChkNumEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChkCount" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}Count" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChkBkCount" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}Count" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChkCountAvail" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ChkCountNotAvail" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RateInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}RateInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChkBkStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}ChkBkStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkBkInfo", propOrder = {
    "chkNumStart",
    "chkNumEnd",
    "chkCount",
    "chkBkCount",
    "chkCountAvail",
    "chkCountNotAvail",
    "rateInfo",
    "chkBkStatus"
})
public class ChkBkInfo {

    @XmlElement(name = "ChkNumStart")
    protected String chkNumStart;
    @XmlElement(name = "ChkNumEnd")
    protected String chkNumEnd;
    @XmlElement(name = "ChkCount")
    protected List<Count> chkCount;
    @XmlElement(name = "ChkBkCount")
    protected List<Count> chkBkCount;
    @XmlElement(name = "ChkCountAvail")
    protected BigInteger chkCountAvail;
    @XmlElement(name = "ChkCountNotAvail")
    protected BigInteger chkCountNotAvail;
    @XmlElement(name = "RateInfo")
    protected List<RateInfo> rateInfo;
    @XmlElement(name = "ChkBkStatus")
    protected List<ChkBkStatus> chkBkStatus;

    /**
     * Obtiene el valor de la propiedad chkNumStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNumStart() {
        return chkNumStart;
    }

    /**
     * Define el valor de la propiedad chkNumStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNumStart(String value) {
        this.chkNumStart = value;
    }

    /**
     * Obtiene el valor de la propiedad chkNumEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNumEnd() {
        return chkNumEnd;
    }

    /**
     * Define el valor de la propiedad chkNumEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNumEnd(String value) {
        this.chkNumEnd = value;
    }

    /**
     * Gets the value of the chkCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Count }
     * 
     * 
     */
    public List<Count> getChkCount() {
        if (chkCount == null) {
            chkCount = new ArrayList<Count>();
        }
        return this.chkCount;
    }

    /**
     * Gets the value of the chkBkCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkBkCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkBkCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Count }
     * 
     * 
     */
    public List<Count> getChkBkCount() {
        if (chkBkCount == null) {
            chkBkCount = new ArrayList<Count>();
        }
        return this.chkBkCount;
    }

    /**
     * Obtiene el valor de la propiedad chkCountAvail.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChkCountAvail() {
        return chkCountAvail;
    }

    /**
     * Define el valor de la propiedad chkCountAvail.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChkCountAvail(BigInteger value) {
        this.chkCountAvail = value;
    }

    /**
     * Obtiene el valor de la propiedad chkCountNotAvail.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChkCountNotAvail() {
        return chkCountNotAvail;
    }

    /**
     * Define el valor de la propiedad chkCountNotAvail.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChkCountNotAvail(BigInteger value) {
        this.chkCountNotAvail = value;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateInfo }
     * 
     * 
     */
    public List<RateInfo> getRateInfo() {
        if (rateInfo == null) {
            rateInfo = new ArrayList<RateInfo>();
        }
        return this.rateInfo;
    }

    /**
     * Gets the value of the chkBkStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkBkStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkBkStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChkBkStatus }
     * 
     * 
     */
    public List<ChkBkStatus> getChkBkStatus() {
        if (chkBkStatus == null) {
            chkBkStatus = new ArrayList<ChkBkStatus>();
        }
        return this.chkBkStatus;
    }

}

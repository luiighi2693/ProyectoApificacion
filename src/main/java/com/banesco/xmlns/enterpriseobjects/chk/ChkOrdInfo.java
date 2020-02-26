//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.chk;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChkOrdInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChkOrdInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChkNumStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChkNumEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackChkCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ChkCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MinConsRateInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}MinConsRateInfo" minOccurs="0"/&gt;
 *         &lt;element name="ConsRateInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}ConsRateInfo" minOccurs="0"/&gt;
 *         &lt;element name="BatchMaxCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkOrdInfo", propOrder = {
    "chkNumStart",
    "chkNumEnd",
    "packChkCount",
    "chkCount",
    "minConsRateInfo",
    "consRateInfo",
    "batchMaxCount"
})
public class ChkOrdInfo {

    @XmlElement(name = "ChkNumStart")
    protected String chkNumStart;
    @XmlElement(name = "ChkNumEnd")
    protected String chkNumEnd;
    @XmlElement(name = "PackChkCount")
    protected BigInteger packChkCount;
    @XmlElement(name = "ChkCount")
    protected BigInteger chkCount;
    @XmlElement(name = "MinConsRateInfo")
    protected MinConsRateInfo minConsRateInfo;
    @XmlElement(name = "ConsRateInfo")
    protected ConsRateInfo consRateInfo;
    @XmlElement(name = "BatchMaxCount")
    protected BigInteger batchMaxCount;

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
     * Obtiene el valor de la propiedad packChkCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackChkCount() {
        return packChkCount;
    }

    /**
     * Define el valor de la propiedad packChkCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackChkCount(BigInteger value) {
        this.packChkCount = value;
    }

    /**
     * Obtiene el valor de la propiedad chkCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChkCount() {
        return chkCount;
    }

    /**
     * Define el valor de la propiedad chkCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChkCount(BigInteger value) {
        this.chkCount = value;
    }

    /**
     * Obtiene el valor de la propiedad minConsRateInfo.
     * 
     * @return
     *     possible object is
     *     {@link MinConsRateInfo }
     *     
     */
    public MinConsRateInfo getMinConsRateInfo() {
        return minConsRateInfo;
    }

    /**
     * Define el valor de la propiedad minConsRateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MinConsRateInfo }
     *     
     */
    public void setMinConsRateInfo(MinConsRateInfo value) {
        this.minConsRateInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad consRateInfo.
     * 
     * @return
     *     possible object is
     *     {@link ConsRateInfo }
     *     
     */
    public ConsRateInfo getConsRateInfo() {
        return consRateInfo;
    }

    /**
     * Define el valor de la propiedad consRateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsRateInfo }
     *     
     */
    public void setConsRateInfo(ConsRateInfo value) {
        this.consRateInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad batchMaxCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatchMaxCount() {
        return batchMaxCount;
    }

    /**
     * Define el valor de la propiedad batchMaxCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatchMaxCount(BigInteger value) {
        this.batchMaxCount = value;
    }

}

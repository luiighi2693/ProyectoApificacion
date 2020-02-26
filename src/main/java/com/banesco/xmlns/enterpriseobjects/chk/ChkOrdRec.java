//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.chk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.banking.Banking;


/**
 * <p>Clase Java para ChkOrdRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChkOrdRec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalChk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignalTotalChk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChkOrdInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}ChkOrdInfo" minOccurs="0"/&gt;
 *         &lt;element name="ChkOrdStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}ChkOrdStatus" minOccurs="0"/&gt;
 *         &lt;element name="Banking" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}Banking" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkOrdRec", propOrder = {
    "totalChk",
    "signalTotalChk",
    "chkOrdInfo",
    "chkOrdStatus",
    "banking"
})
public class ChkOrdRec {

    @XmlElement(name = "TotalChk")
    protected String totalChk;
    @XmlElement(name = "SignalTotalChk")
    protected String signalTotalChk;
    @XmlElement(name = "ChkOrdInfo")
    protected ChkOrdInfo chkOrdInfo;
    @XmlElement(name = "ChkOrdStatus")
    protected ChkOrdStatus chkOrdStatus;
    @XmlElement(name = "Banking")
    protected Banking banking;

    /**
     * Obtiene el valor de la propiedad totalChk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalChk() {
        return totalChk;
    }

    /**
     * Define el valor de la propiedad totalChk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalChk(String value) {
        this.totalChk = value;
    }

    /**
     * Obtiene el valor de la propiedad signalTotalChk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalTotalChk() {
        return signalTotalChk;
    }

    /**
     * Define el valor de la propiedad signalTotalChk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalTotalChk(String value) {
        this.signalTotalChk = value;
    }

    /**
     * Obtiene el valor de la propiedad chkOrdInfo.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdInfo }
     *     
     */
    public ChkOrdInfo getChkOrdInfo() {
        return chkOrdInfo;
    }

    /**
     * Define el valor de la propiedad chkOrdInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdInfo }
     *     
     */
    public void setChkOrdInfo(ChkOrdInfo value) {
        this.chkOrdInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad chkOrdStatus.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdStatus }
     *     
     */
    public ChkOrdStatus getChkOrdStatus() {
        return chkOrdStatus;
    }

    /**
     * Define el valor de la propiedad chkOrdStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdStatus }
     *     
     */
    public void setChkOrdStatus(ChkOrdStatus value) {
        this.chkOrdStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad banking.
     * 
     * @return
     *     possible object is
     *     {@link Banking }
     *     
     */
    public Banking getBanking() {
        return banking;
    }

    /**
     * Define el valor de la propiedad banking.
     * 
     * @param value
     *     allowed object is
     *     {@link Banking }
     *     
     */
    public void setBanking(Banking value) {
        this.banking = value;
    }

}

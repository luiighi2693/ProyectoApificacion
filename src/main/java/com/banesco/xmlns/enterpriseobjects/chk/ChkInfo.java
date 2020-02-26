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


/**
 * <p>Clase Java para ChkInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChkInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChkNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChkControlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChkStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkInfo", propOrder = {
    "chkNum",
    "chkControlCode",
    "chkStatus"
})
public class ChkInfo {

    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElement(name = "ChkControlCode")
    protected String chkControlCode;
    @XmlElement(name = "ChkStatus")
    protected String chkStatus;

    /**
     * Obtiene el valor de la propiedad chkNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNum() {
        return chkNum;
    }

    /**
     * Define el valor de la propiedad chkNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNum(String value) {
        this.chkNum = value;
    }

    /**
     * Obtiene el valor de la propiedad chkControlCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkControlCode() {
        return chkControlCode;
    }

    /**
     * Define el valor de la propiedad chkControlCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkControlCode(String value) {
        this.chkControlCode = value;
    }

    /**
     * Obtiene el valor de la propiedad chkStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkStatus() {
        return chkStatus;
    }

    /**
     * Define el valor de la propiedad chkStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkStatus(String value) {
        this.chkStatus = value;
    }

}

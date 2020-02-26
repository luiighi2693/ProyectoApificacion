//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SvcPayConf complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SvcPayConf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayConf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayConfCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayConfDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayRestInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayRegQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PayAmtConf" type="{http://xmlns.banesco.com/EnterpriseObjects/Service}PayAmtConf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcPayConf", propOrder = {
    "payConf",
    "payConfCode",
    "payConfDesc",
    "payRestInd",
    "payRegQty",
    "payAmtConf"
})
public class SvcPayConf {

    @XmlElement(name = "PayConf")
    protected String payConf;
    @XmlElement(name = "PayConfCode")
    protected String payConfCode;
    @XmlElement(name = "PayConfDesc")
    protected String payConfDesc;
    @XmlElement(name = "PayRestInd")
    protected String payRestInd;
    @XmlElement(name = "PayRegQty")
    protected Integer payRegQty;
    @XmlElement(name = "PayAmtConf")
    protected PayAmtConf payAmtConf;

    /**
     * Obtiene el valor de la propiedad payConf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayConf() {
        return payConf;
    }

    /**
     * Define el valor de la propiedad payConf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayConf(String value) {
        this.payConf = value;
    }

    /**
     * Obtiene el valor de la propiedad payConfCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayConfCode() {
        return payConfCode;
    }

    /**
     * Define el valor de la propiedad payConfCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayConfCode(String value) {
        this.payConfCode = value;
    }

    /**
     * Obtiene el valor de la propiedad payConfDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayConfDesc() {
        return payConfDesc;
    }

    /**
     * Define el valor de la propiedad payConfDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayConfDesc(String value) {
        this.payConfDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad payRestInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayRestInd() {
        return payRestInd;
    }

    /**
     * Define el valor de la propiedad payRestInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayRestInd(String value) {
        this.payRestInd = value;
    }

    /**
     * Obtiene el valor de la propiedad payRegQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayRegQty() {
        return payRegQty;
    }

    /**
     * Define el valor de la propiedad payRegQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayRegQty(Integer value) {
        this.payRegQty = value;
    }

    /**
     * Obtiene el valor de la propiedad payAmtConf.
     * 
     * @return
     *     possible object is
     *     {@link PayAmtConf }
     *     
     */
    public PayAmtConf getPayAmtConf() {
        return payAmtConf;
    }

    /**
     * Define el valor de la propiedad payAmtConf.
     * 
     * @param value
     *     allowed object is
     *     {@link PayAmtConf }
     *     
     */
    public void setPayAmtConf(PayAmtConf value) {
        this.payAmtConf = value;
    }

}

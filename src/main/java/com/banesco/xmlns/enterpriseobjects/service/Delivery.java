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
import com.banesco.xmlns.enterpriseobjects.addr.Addr;
import com.banesco.xmlns.enterpriseobjects.bankinfo.Bankinfo;


/**
 * <p>Clase Java para Delivery complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Delivery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://xmlns.banesco.com/EnterpriseObjects/Addr}Addr" minOccurs="0"/&gt;
 *         &lt;element name="Bankinfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Bankinfo}Bankinfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delivery", propOrder = {
    "delyType",
    "addr",
    "bankinfo"
})
public class Delivery {

    @XmlElement(name = "DelyType")
    protected String delyType;
    @XmlElement(name = "Addr")
    protected Addr addr;
    @XmlElement(name = "Bankinfo")
    protected Bankinfo bankinfo;

    /**
     * Obtiene el valor de la propiedad delyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelyType() {
        return delyType;
    }

    /**
     * Define el valor de la propiedad delyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelyType(String value) {
        this.delyType = value;
    }

    /**
     * Obtiene el valor de la propiedad addr.
     * 
     * @return
     *     possible object is
     *     {@link Addr }
     *     
     */
    public Addr getAddr() {
        return addr;
    }

    /**
     * Define el valor de la propiedad addr.
     * 
     * @param value
     *     allowed object is
     *     {@link Addr }
     *     
     */
    public void setAddr(Addr value) {
        this.addr = value;
    }

    /**
     * Obtiene el valor de la propiedad bankinfo.
     * 
     * @return
     *     possible object is
     *     {@link Bankinfo }
     *     
     */
    public Bankinfo getBankinfo() {
        return bankinfo;
    }

    /**
     * Define el valor de la propiedad bankinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Bankinfo }
     *     
     */
    public void setBankinfo(Bankinfo value) {
        this.bankinfo = value;
    }

}

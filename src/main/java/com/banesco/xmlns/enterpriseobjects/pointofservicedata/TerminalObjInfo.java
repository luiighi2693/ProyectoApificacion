//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.pointofservicedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TerminalObjInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TerminalObjInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerminalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POSLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalObjInfo", propOrder = {
    "desc",
    "name",
    "postAddr",
    "terminalType",
    "posLocation"
})
public class TerminalObjInfo {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PostAddr")
    protected String postAddr;
    @XmlElement(name = "TerminalType")
    protected String terminalType;
    @XmlElement(name = "POSLocation")
    protected String posLocation;

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
     * Obtiene el valor de la propiedad postAddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddr() {
        return postAddr;
    }

    /**
     * Define el valor de la propiedad postAddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddr(String value) {
        this.postAddr = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Define el valor de la propiedad terminalType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Obtiene el valor de la propiedad posLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSLocation() {
        return posLocation;
    }

    /**
     * Define el valor de la propiedad posLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSLocation(String value) {
        this.posLocation = value;
    }

}

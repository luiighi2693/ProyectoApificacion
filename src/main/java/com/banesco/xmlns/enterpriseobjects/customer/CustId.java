//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustPermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustPermType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustId", propOrder = {
    "custPermId",
    "custPermType"
})
public class CustId {

    @XmlElement(name = "CustPermId")
    protected String custPermId;
    @XmlElement(name = "CustPermType")
    protected String custPermType;

    /**
     * Obtiene el valor de la propiedad custPermId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermId() {
        return custPermId;
    }

    /**
     * Define el valor de la propiedad custPermId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermId(String value) {
        this.custPermId = value;
    }

    /**
     * Obtiene el valor de la propiedad custPermType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPermType() {
        return custPermType;
    }

    /**
     * Define el valor de la propiedad custPermType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPermType(String value) {
        this.custPermType = value;
    }

}

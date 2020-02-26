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
 * <p>Clase Java para SvcStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SvcStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcStatus", propOrder = {
    "svcStatusCode",
    "svcStatusDesc"
})
public class SvcStatus {

    @XmlElement(name = "SvcStatusCode")
    protected String svcStatusCode;
    @XmlElement(name = "SvcStatusDesc")
    protected String svcStatusDesc;

    /**
     * Obtiene el valor de la propiedad svcStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcStatusCode() {
        return svcStatusCode;
    }

    /**
     * Define el valor de la propiedad svcStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcStatusCode(String value) {
        this.svcStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad svcStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcStatusDesc() {
        return svcStatusDesc;
    }

    /**
     * Define el valor de la propiedad svcStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcStatusDesc(String value) {
        this.svcStatusDesc = value;
    }

}

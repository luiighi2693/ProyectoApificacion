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
 * <p>Clase Java para AuthInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuthInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustPswd" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}CustPswd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthInfo", propOrder = {
    "custPswd"
})
public class AuthInfo {

    @XmlElement(name = "CustPswd")
    protected CustPswd custPswd;

    /**
     * Obtiene el valor de la propiedad custPswd.
     * 
     * @return
     *     possible object is
     *     {@link CustPswd }
     *     
     */
    public CustPswd getCustPswd() {
        return custPswd;
    }

    /**
     * Define el valor de la propiedad custPswd.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPswd }
     *     
     */
    public void setCustPswd(CustPswd value) {
        this.custPswd = value;
    }

}

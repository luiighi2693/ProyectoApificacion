//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.affiliationsvc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AffilStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AffilStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffilStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffilStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffilStatusDate" type="{http://xmlns.banesco.com/EnterpriseObjects/AffiliationSvc}dateTimePattern" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffilStatus", propOrder = {
    "affilStatusCode",
    "affilStatusDesc",
    "affilStatusDate"
})
public class AffilStatus {

    @XmlElement(name = "AffilStatusCode")
    protected String affilStatusCode;
    @XmlElement(name = "AffilStatusDesc")
    protected String affilStatusDesc;
    @XmlElement(name = "AffilStatusDate")
    protected String affilStatusDate;

    /**
     * Obtiene el valor de la propiedad affilStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilStatusCode() {
        return affilStatusCode;
    }

    /**
     * Define el valor de la propiedad affilStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilStatusCode(String value) {
        this.affilStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad affilStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilStatusDesc() {
        return affilStatusDesc;
    }

    /**
     * Define el valor de la propiedad affilStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilStatusDesc(String value) {
        this.affilStatusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad affilStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilStatusDate() {
        return affilStatusDate;
    }

    /**
     * Define el valor de la propiedad affilStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilStatusDate(String value) {
        this.affilStatusDate = value;
    }

}

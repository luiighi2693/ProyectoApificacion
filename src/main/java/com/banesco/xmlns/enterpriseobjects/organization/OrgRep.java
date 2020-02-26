//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrgRep complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrgRep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgRepType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OccupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgRep", propOrder = {
    "name",
    "orgRepType",
    "jobTitle",
    "occupation",
    "occupDesc"
})
public class OrgRep {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "OrgRepType")
    protected String orgRepType;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "OccupDesc")
    protected String occupDesc;

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
     * Obtiene el valor de la propiedad orgRepType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRepType() {
        return orgRepType;
    }

    /**
     * Define el valor de la propiedad orgRepType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRepType(String value) {
        this.orgRepType = value;
    }

    /**
     * Obtiene el valor de la propiedad jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Define el valor de la propiedad jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad occupation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Define el valor de la propiedad occupation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Obtiene el valor de la propiedad occupDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupDesc() {
        return occupDesc;
    }

    /**
     * Define el valor de la propiedad occupDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupDesc(String value) {
        this.occupDesc = value;
    }

}

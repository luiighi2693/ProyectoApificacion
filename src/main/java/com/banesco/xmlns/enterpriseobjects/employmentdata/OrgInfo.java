//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.employmentdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrgInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrgInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EconActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EconActivityCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}PhoneNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgInfo", propOrder = {
    "orgId",
    "name",
    "econActivity",
    "econActivityCod",
    "phoneNum"
})
public class OrgInfo {

    @XmlElement(name = "OrgId")
    protected String orgId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "EconActivity")
    protected String econActivity;
    @XmlElement(name = "EconActivityCod")
    protected String econActivityCod;
    @XmlElement(name = "PhoneNum")
    protected PhoneNum phoneNum;

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
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
     * Obtiene el valor de la propiedad econActivity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconActivity() {
        return econActivity;
    }

    /**
     * Define el valor de la propiedad econActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconActivity(String value) {
        this.econActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad econActivityCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconActivityCod() {
        return econActivityCod;
    }

    /**
     * Define el valor de la propiedad econActivityCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconActivityCod(String value) {
        this.econActivityCod = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNum.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNum }
     *     
     */
    public PhoneNum getPhoneNum() {
        return phoneNum;
    }

    /**
     * Define el valor de la propiedad phoneNum.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNum }
     *     
     */
    public void setPhoneNum(PhoneNum value) {
        this.phoneNum = value;
    }

}

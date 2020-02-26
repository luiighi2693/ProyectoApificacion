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
import com.banesco.xmlns.enterpriseobjects.organization.Organization;


/**
 * <p>Clase Java para Service complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcObser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustIndSvc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcPayConf" type="{http://xmlns.banesco.com/EnterpriseObjects/Service}SvcPayConf" minOccurs="0"/&gt;
 *         &lt;element name="SvcUseConf" type="{http://xmlns.banesco.com/EnterpriseObjects/Service}SvcUseConf" minOccurs="0"/&gt;
 *         &lt;element name="Delivery" type="{http://xmlns.banesco.com/EnterpriseObjects/Service}Delivery" minOccurs="0"/&gt;
 *         &lt;element name="Issue" type="{http://xmlns.banesco.com/EnterpriseObjects/Service}Issue" minOccurs="0"/&gt;
 *         &lt;element name="SvcStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Service}SvcStatus" minOccurs="0"/&gt;
 *         &lt;element name="Organization" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}Organization" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "svcCode",
    "svcType",
    "svcDesc",
    "svcObser",
    "svcPhone",
    "custIndSvc",
    "svcPayConf",
    "svcUseConf",
    "delivery",
    "issue",
    "svcStatus",
    "organization"
})
public class Service {

    @XmlElement(name = "SvcCode")
    protected String svcCode;
    @XmlElement(name = "SvcType")
    protected String svcType;
    @XmlElement(name = "SvcDesc")
    protected String svcDesc;
    @XmlElement(name = "SvcObser")
    protected String svcObser;
    @XmlElement(name = "SvcPhone")
    protected String svcPhone;
    @XmlElement(name = "CustIndSvc")
    protected String custIndSvc;
    @XmlElement(name = "SvcPayConf")
    protected SvcPayConf svcPayConf;
    @XmlElement(name = "SvcUseConf")
    protected SvcUseConf svcUseConf;
    @XmlElement(name = "Delivery")
    protected Delivery delivery;
    @XmlElement(name = "Issue")
    protected Issue issue;
    @XmlElement(name = "SvcStatus")
    protected SvcStatus svcStatus;
    @XmlElement(name = "Organization")
    protected Organization organization;

    /**
     * Obtiene el valor de la propiedad svcCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCode() {
        return svcCode;
    }

    /**
     * Define el valor de la propiedad svcCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcCode(String value) {
        this.svcCode = value;
    }

    /**
     * Obtiene el valor de la propiedad svcType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcType() {
        return svcType;
    }

    /**
     * Define el valor de la propiedad svcType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcType(String value) {
        this.svcType = value;
    }

    /**
     * Obtiene el valor de la propiedad svcDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcDesc() {
        return svcDesc;
    }

    /**
     * Define el valor de la propiedad svcDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcDesc(String value) {
        this.svcDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad svcObser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcObser() {
        return svcObser;
    }

    /**
     * Define el valor de la propiedad svcObser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcObser(String value) {
        this.svcObser = value;
    }

    /**
     * Obtiene el valor de la propiedad svcPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcPhone() {
        return svcPhone;
    }

    /**
     * Define el valor de la propiedad svcPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcPhone(String value) {
        this.svcPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad custIndSvc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIndSvc() {
        return custIndSvc;
    }

    /**
     * Define el valor de la propiedad custIndSvc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIndSvc(String value) {
        this.custIndSvc = value;
    }

    /**
     * Obtiene el valor de la propiedad svcPayConf.
     * 
     * @return
     *     possible object is
     *     {@link SvcPayConf }
     *     
     */
    public SvcPayConf getSvcPayConf() {
        return svcPayConf;
    }

    /**
     * Define el valor de la propiedad svcPayConf.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPayConf }
     *     
     */
    public void setSvcPayConf(SvcPayConf value) {
        this.svcPayConf = value;
    }

    /**
     * Obtiene el valor de la propiedad svcUseConf.
     * 
     * @return
     *     possible object is
     *     {@link SvcUseConf }
     *     
     */
    public SvcUseConf getSvcUseConf() {
        return svcUseConf;
    }

    /**
     * Define el valor de la propiedad svcUseConf.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcUseConf }
     *     
     */
    public void setSvcUseConf(SvcUseConf value) {
        this.svcUseConf = value;
    }

    /**
     * Obtiene el valor de la propiedad delivery.
     * 
     * @return
     *     possible object is
     *     {@link Delivery }
     *     
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * Define el valor de la propiedad delivery.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery }
     *     
     */
    public void setDelivery(Delivery value) {
        this.delivery = value;
    }

    /**
     * Obtiene el valor de la propiedad issue.
     * 
     * @return
     *     possible object is
     *     {@link Issue }
     *     
     */
    public Issue getIssue() {
        return issue;
    }

    /**
     * Define el valor de la propiedad issue.
     * 
     * @param value
     *     allowed object is
     *     {@link Issue }
     *     
     */
    public void setIssue(Issue value) {
        this.issue = value;
    }

    /**
     * Obtiene el valor de la propiedad svcStatus.
     * 
     * @return
     *     possible object is
     *     {@link SvcStatus }
     *     
     */
    public SvcStatus getSvcStatus() {
        return svcStatus;
    }

    /**
     * Define el valor de la propiedad svcStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcStatus }
     *     
     */
    public void setSvcStatus(SvcStatus value) {
        this.svcStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad organization.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Define el valor de la propiedad organization.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

}

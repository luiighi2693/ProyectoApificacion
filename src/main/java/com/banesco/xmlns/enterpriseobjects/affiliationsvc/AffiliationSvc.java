//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.affiliationsvc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.service.Service;


/**
 * <p>Clase Java para AffiliationSvc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AffiliationSvc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffilNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffilType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AffilDate" type="{http://xmlns.banesco.com/EnterpriseObjects/AffiliationSvc}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="AffilPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffilOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffilObser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffilMaxInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffilStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/AffiliationSvc}AffilStatus" minOccurs="0"/&gt;
 *         &lt;element name="Affiliations" type="{http://xmlns.banesco.com/EnterpriseObjects/AffiliationSvc}Affiliations" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://xmlns.banesco.com/EnterpriseObjects/Service}Service" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationSvc", propOrder = {
    "affilNum",
    "affilType",
    "affilDate",
    "affilPlan",
    "affilOrigin",
    "affilObser",
    "affilMaxInd",
    "affilStatus",
    "affiliations",
    "service"
})
public class AffiliationSvc {

    @XmlElement(name = "AffilNum")
    protected String affilNum;
    @XmlElement(name = "AffilType")
    protected BigInteger affilType;
    @XmlElement(name = "AffilDate")
    protected String affilDate;
    @XmlElement(name = "AffilPlan")
    protected String affilPlan;
    @XmlElement(name = "AffilOrigin")
    protected String affilOrigin;
    @XmlElement(name = "AffilObser")
    protected String affilObser;
    @XmlElement(name = "AffilMaxInd")
    protected String affilMaxInd;
    @XmlElement(name = "AffilStatus")
    protected AffilStatus affilStatus;
    @XmlElement(name = "Affiliations")
    protected List<Affiliations> affiliations;
    @XmlElement(name = "Service")
    protected Service service;

    /**
     * Obtiene el valor de la propiedad affilNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilNum() {
        return affilNum;
    }

    /**
     * Define el valor de la propiedad affilNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilNum(String value) {
        this.affilNum = value;
    }

    /**
     * Obtiene el valor de la propiedad affilType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffilType() {
        return affilType;
    }

    /**
     * Define el valor de la propiedad affilType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffilType(BigInteger value) {
        this.affilType = value;
    }

    /**
     * Obtiene el valor de la propiedad affilDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilDate() {
        return affilDate;
    }

    /**
     * Define el valor de la propiedad affilDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilDate(String value) {
        this.affilDate = value;
    }

    /**
     * Obtiene el valor de la propiedad affilPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilPlan() {
        return affilPlan;
    }

    /**
     * Define el valor de la propiedad affilPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilPlan(String value) {
        this.affilPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad affilOrigin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilOrigin() {
        return affilOrigin;
    }

    /**
     * Define el valor de la propiedad affilOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilOrigin(String value) {
        this.affilOrigin = value;
    }

    /**
     * Obtiene el valor de la propiedad affilObser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilObser() {
        return affilObser;
    }

    /**
     * Define el valor de la propiedad affilObser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilObser(String value) {
        this.affilObser = value;
    }

    /**
     * Obtiene el valor de la propiedad affilMaxInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilMaxInd() {
        return affilMaxInd;
    }

    /**
     * Define el valor de la propiedad affilMaxInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilMaxInd(String value) {
        this.affilMaxInd = value;
    }

    /**
     * Obtiene el valor de la propiedad affilStatus.
     * 
     * @return
     *     possible object is
     *     {@link AffilStatus }
     *     
     */
    public AffilStatus getAffilStatus() {
        return affilStatus;
    }

    /**
     * Define el valor de la propiedad affilStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link AffilStatus }
     *     
     */
    public void setAffilStatus(AffilStatus value) {
        this.affilStatus = value;
    }

    /**
     * Gets the value of the affiliations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Affiliations }
     * 
     * 
     */
    public List<Affiliations> getAffiliations() {
        if (affiliations == null) {
            affiliations = new ArrayList<Affiliations>();
        }
        return this.affiliations;
    }

    /**
     * Obtiene el valor de la propiedad service.
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * Define el valor de la propiedad service.
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

}

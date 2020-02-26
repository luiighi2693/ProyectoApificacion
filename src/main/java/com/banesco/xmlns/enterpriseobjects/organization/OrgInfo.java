//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.organization;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.contact.ContactInfo;


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
 *         &lt;element name="PhoneNum" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}PhoneNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Contact}ContactInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TINInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}TINInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IndustId" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}IndustId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrgRep" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}OrgRep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetSales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "phoneNum",
    "contactInfo",
    "tinInfo",
    "industId",
    "orgRep",
    "sector",
    "type",
    "numEmployees",
    "netSales"
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
    protected List<PhoneNum> phoneNum;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfo> contactInfo;
    @XmlElement(name = "TINInfo")
    protected List<TINInfo> tinInfo;
    @XmlElement(name = "IndustId")
    protected List<IndustId> industId;
    @XmlElement(name = "OrgRep")
    protected List<OrgRep> orgRep;
    @XmlElement(name = "Sector")
    protected String sector;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "NumEmployees")
    protected String numEmployees;
    @XmlElement(name = "NetSales")
    protected String netSales;

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
     * Gets the value of the phoneNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNum }
     * 
     * 
     */
    public List<PhoneNum> getPhoneNum() {
        if (phoneNum == null) {
            phoneNum = new ArrayList<PhoneNum>();
        }
        return this.phoneNum;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfo }
     * 
     * 
     */
    public List<ContactInfo> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfo>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the tinInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tinInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTINInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TINInfo }
     * 
     * 
     */
    public List<TINInfo> getTINInfo() {
        if (tinInfo == null) {
            tinInfo = new ArrayList<TINInfo>();
        }
        return this.tinInfo;
    }

    /**
     * Gets the value of the industId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustId }
     * 
     * 
     */
    public List<IndustId> getIndustId() {
        if (industId == null) {
            industId = new ArrayList<IndustId>();
        }
        return this.industId;
    }

    /**
     * Gets the value of the orgRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgRep }
     * 
     * 
     */
    public List<OrgRep> getOrgRep() {
        if (orgRep == null) {
            orgRep = new ArrayList<OrgRep>();
        }
        return this.orgRep;
    }

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad numEmployees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEmployees() {
        return numEmployees;
    }

    /**
     * Define el valor de la propiedad numEmployees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEmployees(String value) {
        this.numEmployees = value;
    }

    /**
     * Obtiene el valor de la propiedad netSales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetSales() {
        return netSales;
    }

    /**
     * Define el valor de la propiedad netSales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetSales(String value) {
        this.netSales = value;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.contact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.personinfo.PersonInfo;


/**
 * <p>Clase Java para Contact complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactPref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrefTimeStart" type="{http://xmlns.banesco.com/EnterpriseObjects/Contact}timePattern" minOccurs="0"/&gt;
 *         &lt;element name="PrefTimeEnd" type="{http://xmlns.banesco.com/EnterpriseObjects/Contact}timePattern" minOccurs="0"/&gt;
 *         &lt;element name="PrefDateStart" type="{http://xmlns.banesco.com/EnterpriseObjects/Contact}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="PrefDateEnd" type="{http://xmlns.banesco.com/EnterpriseObjects/Contact}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://xmlns.banesco.com/EnterpriseObjects/Contact}PhoneNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/PersonInfo}PersonInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "contactInfoType",
    "contactPref",
    "prefTimeStart",
    "prefTimeEnd",
    "prefDateStart",
    "prefDateEnd",
    "phoneNum",
    "contactName",
    "emailAddr",
    "url",
    "personInfo"
})
public class Contact {

    @XmlElement(name = "ContactInfoType")
    protected String contactInfoType;
    @XmlElement(name = "ContactPref")
    protected String contactPref;
    @XmlElement(name = "PrefTimeStart")
    protected String prefTimeStart;
    @XmlElement(name = "PrefTimeEnd")
    protected String prefTimeEnd;
    @XmlElement(name = "PrefDateStart")
    protected String prefDateStart;
    @XmlElement(name = "PrefDateEnd")
    protected String prefDateEnd;
    @XmlElement(name = "PhoneNum")
    protected List<PhoneNum> phoneNum;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "EmailAddr")
    protected List<String> emailAddr;
    @XmlElement(name = "URL")
    protected List<String> url;
    @XmlElement(name = "PersonInfo")
    protected PersonInfo personInfo;

    /**
     * Obtiene el valor de la propiedad contactInfoType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoType() {
        return contactInfoType;
    }

    /**
     * Define el valor de la propiedad contactInfoType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoType(String value) {
        this.contactInfoType = value;
    }

    /**
     * Obtiene el valor de la propiedad contactPref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPref() {
        return contactPref;
    }

    /**
     * Define el valor de la propiedad contactPref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPref(String value) {
        this.contactPref = value;
    }

    /**
     * Obtiene el valor de la propiedad prefTimeStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefTimeStart() {
        return prefTimeStart;
    }

    /**
     * Define el valor de la propiedad prefTimeStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefTimeStart(String value) {
        this.prefTimeStart = value;
    }

    /**
     * Obtiene el valor de la propiedad prefTimeEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefTimeEnd() {
        return prefTimeEnd;
    }

    /**
     * Define el valor de la propiedad prefTimeEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefTimeEnd(String value) {
        this.prefTimeEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad prefDateStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefDateStart() {
        return prefDateStart;
    }

    /**
     * Define el valor de la propiedad prefDateStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefDateStart(String value) {
        this.prefDateStart = value;
    }

    /**
     * Obtiene el valor de la propiedad prefDateEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefDateEnd() {
        return prefDateEnd;
    }

    /**
     * Define el valor de la propiedad prefDateEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefDateEnd(String value) {
        this.prefDateEnd = value;
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
     * Obtiene el valor de la propiedad contactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Define el valor de la propiedad contactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the emailAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddr() {
        if (emailAddr == null) {
            emailAddr = new ArrayList<String>();
        }
        return this.emailAddr;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getURL() {
        if (url == null) {
            url = new ArrayList<String>();
        }
        return this.url;
    }

    /**
     * Obtiene el valor de la propiedad personInfo.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Define el valor de la propiedad personInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

}

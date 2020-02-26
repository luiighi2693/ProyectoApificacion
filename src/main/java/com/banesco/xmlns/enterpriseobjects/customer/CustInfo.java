//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.contact.ContactInfo;


/**
 * <p>Clase Java para CustInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}PhoneNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceCustRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Contact}ContactInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInfo", propOrder = {
    "custType",
    "businessType",
    "emailAddr",
    "phoneNum",
    "insuranceCustRel",
    "contactInfo"
})
public class CustInfo {

    @XmlElement(name = "CustType")
    protected String custType;
    @XmlElement(name = "BusinessType")
    protected String businessType;
    @XmlElement(name = "EmailAddr")
    protected String emailAddr;
    @XmlElement(name = "PhoneNum")
    protected List<PhoneNum> phoneNum;
    @XmlElement(name = "InsuranceCustRel")
    protected String insuranceCustRel;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfo> contactInfo;

    /**
     * Obtiene el valor de la propiedad custType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Define el valor de la propiedad custType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Obtiene el valor de la propiedad businessType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * Define el valor de la propiedad businessType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Define el valor de la propiedad emailAddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
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
     * Obtiene el valor de la propiedad insuranceCustRel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCustRel() {
        return insuranceCustRel;
    }

    /**
     * Define el valor de la propiedad insuranceCustRel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCustRel(String value) {
        this.insuranceCustRel = value;
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

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.securityidentification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.banesco.xmlns.enterpriseobjects.banking.Banking;
import com.banesco.xmlns.enterpriseobjects.customer.Customer;


/**
 * <p>Clase Java para SecurityIdentification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecurityIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastDat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SecurityQuestion" type="{http://xmlns.banesco.com/EnterpriseObjects/SecurityIdentification}SecurityQuestion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SecurityResponse" type="{http://xmlns.banesco.com/EnterpriseObjects/SecurityIdentification}SecurityResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerResponse" type="{http://xmlns.banesco.com/EnterpriseObjects/SecurityIdentification}CustomerResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Banking" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}Banking" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}Customer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SecUserInd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification", propOrder = {
    "lastDat",
    "securityQuestion",
    "securityResponse",
    "customerResponse",
    "banking",
    "customer",
    "secUserInd"
})
public class SecurityIdentification {

    @XmlElement(name = "LastDat")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDat;
    @XmlElement(name = "SecurityQuestion")
    protected List<SecurityQuestion> securityQuestion;
    @XmlElement(name = "SecurityResponse")
    protected List<SecurityResponse> securityResponse;
    @XmlElement(name = "CustomerResponse")
    protected List<CustomerResponse> customerResponse;
    @XmlElement(name = "Banking")
    protected List<Banking> banking;
    @XmlElement(name = "Customer")
    protected List<Customer> customer;
    @XmlElement(name = "SecUserInd")
    protected List<String> secUserInd;

    /**
     * Obtiene el valor de la propiedad lastDat.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDat() {
        return lastDat;
    }

    /**
     * Define el valor de la propiedad lastDat.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDat(XMLGregorianCalendar value) {
        this.lastDat = value;
    }

    /**
     * Gets the value of the securityQuestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityQuestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityQuestion }
     * 
     * 
     */
    public List<SecurityQuestion> getSecurityQuestion() {
        if (securityQuestion == null) {
            securityQuestion = new ArrayList<SecurityQuestion>();
        }
        return this.securityQuestion;
    }

    /**
     * Gets the value of the securityResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityResponse }
     * 
     * 
     */
    public List<SecurityResponse> getSecurityResponse() {
        if (securityResponse == null) {
            securityResponse = new ArrayList<SecurityResponse>();
        }
        return this.securityResponse;
    }

    /**
     * Gets the value of the customerResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerResponse }
     * 
     * 
     */
    public List<CustomerResponse> getCustomerResponse() {
        if (customerResponse == null) {
            customerResponse = new ArrayList<CustomerResponse>();
        }
        return this.customerResponse;
    }

    /**
     * Gets the value of the banking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the banking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBanking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Banking }
     * 
     * 
     */
    public List<Banking> getBanking() {
        if (banking == null) {
            banking = new ArrayList<Banking>();
        }
        return this.banking;
    }

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customer }
     * 
     * 
     */
    public List<Customer> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<Customer>();
        }
        return this.customer;
    }

    /**
     * Gets the value of the secUserInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secUserInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecUserInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecUserInd() {
        if (secUserInd == null) {
            secUserInd = new ArrayList<String>();
        }
        return this.secUserInd;
    }

}

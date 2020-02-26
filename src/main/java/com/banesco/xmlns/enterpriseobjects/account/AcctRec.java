//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctRec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BankAcctStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}BankAcctStatus" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAcctInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}BankAcctInfo" minOccurs="0"/&gt;
 *         &lt;element name="AcctBal" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}AcctBal" minOccurs="0"/&gt;
 *         &lt;element name="SecUserInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GUIOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}Customer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctRec", propOrder = {
    "acctId",
    "bankAcctStatus",
    "acctType",
    "acctClass",
    "bankAcctInfo",
    "acctBal",
    "secUserInd",
    "guiOptions",
    "customer"
})
public class AcctRec {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "BankAcctStatus")
    protected BankAcctStatus bankAcctStatus;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctClass")
    protected String acctClass;
    @XmlElement(name = "BankAcctInfo")
    protected BankAcctInfo bankAcctInfo;
    @XmlElement(name = "AcctBal")
    protected AcctBal acctBal;
    @XmlElement(name = "SecUserInd")
    protected String secUserInd;
    @XmlElement(name = "GUIOptions")
    protected String guiOptions;
    @XmlElement(name = "Customer")
    protected List<Customer> customer;

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctStatus.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctStatus }
     *     
     */
    public BankAcctStatus getBankAcctStatus() {
        return bankAcctStatus;
    }

    /**
     * Define el valor de la propiedad bankAcctStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctStatus }
     *     
     */
    public void setBankAcctStatus(BankAcctStatus value) {
        this.bankAcctStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad acctType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Define el valor de la propiedad acctType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Obtiene el valor de la propiedad acctClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctClass() {
        return acctClass;
    }

    /**
     * Define el valor de la propiedad acctClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctClass(String value) {
        this.acctClass = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctInfo.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctInfo }
     *     
     */
    public BankAcctInfo getBankAcctInfo() {
        return bankAcctInfo;
    }

    /**
     * Define el valor de la propiedad bankAcctInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctInfo }
     *     
     */
    public void setBankAcctInfo(BankAcctInfo value) {
        this.bankAcctInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad acctBal.
     * 
     * @return
     *     possible object is
     *     {@link AcctBal }
     *     
     */
    public AcctBal getAcctBal() {
        return acctBal;
    }

    /**
     * Define el valor de la propiedad acctBal.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBal }
     *     
     */
    public void setAcctBal(AcctBal value) {
        this.acctBal = value;
    }

    /**
     * Obtiene el valor de la propiedad secUserInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecUserInd() {
        return secUserInd;
    }

    /**
     * Define el valor de la propiedad secUserInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecUserInd(String value) {
        this.secUserInd = value;
    }

    /**
     * Obtiene el valor de la propiedad guiOptions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUIOptions() {
        return guiOptions;
    }

    /**
     * Define el valor de la propiedad guiOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUIOptions(String value) {
        this.guiOptions = value;
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

}

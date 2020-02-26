//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.account.Account;
import com.banesco.xmlns.enterpriseobjects.bankinfo.Bankinfo;
import com.banesco.xmlns.enterpriseobjects.customer.Customer;
import com.banesco.xmlns.enterpriseobjects.msgrshdr.MsgRsHdr;
import com.banesco.xmlns.enterpriseobjects.status.Status;


/**
 * <p>Clase Java para readCustomerAccount_Rs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readCustomerAccount_Rs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}MsgRsHdr" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Status" type="{http://xmlns.banesco.com/EnterpriseObjects/Status}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}Account" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}Customer" minOccurs="0"/&gt;
 *         &lt;element name="Bankinfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Bankinfo}Bankinfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readCustomerAccount_Rs", propOrder = {
    "msgRsHdr",
    "status",
    "account",
    "customer",
    "bankinfo"
})
public class ReadCustomerAccountRs {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected List<MsgRsHdr> msgRsHdr;
    @XmlElement(name = "Status")
    protected List<Status> status;
    @XmlElement(name = "Account")
    protected List<Account> account;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "Bankinfo")
    protected Bankinfo bankinfo;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgRsHdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRsHdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsgRsHdr }
     * 
     * 
     */
    public List<MsgRsHdr> getMsgRsHdr() {
        if (msgRsHdr == null) {
            msgRsHdr = new ArrayList<MsgRsHdr>();
        }
        return this.msgRsHdr;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Status }
     * 
     * 
     */
    public List<Status> getStatus() {
        if (status == null) {
            status = new ArrayList<Status>();
        }
        return this.status;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad bankinfo.
     * 
     * @return
     *     possible object is
     *     {@link Bankinfo }
     *     
     */
    public Bankinfo getBankinfo() {
        return bankinfo;
    }

    /**
     * Define el valor de la propiedad bankinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Bankinfo }
     *     
     */
    public void setBankinfo(Bankinfo value) {
        this.bankinfo = value;
    }

}

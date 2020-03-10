//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.03.09 a las 04:12:39 PM VET 
//


package com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.msgrshdr.MsgRsHdr;
import com.banesco.xmlns.enterpriseobjects.status.Status;


/**
 * <p>Clase Java para readAccountBalance_RsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readAccountBalance_RsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}MsgRsHdr" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://xmlns.banesco.com/EnterpriseObjects/Status}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://xmlns.banesco.com/ApplicationService/APIFinancialAccountOutAppSvc}Account_Rstype" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://xmlns.banesco.com/ApplicationService/APIFinancialAccountOutAppSvc}Customer_Rstype" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readAccountBalance_Rs", propOrder = {
    "msgRsHdr",
    "status",
    "account",
    "customer"
})
public class ReadAccountBalanceRsType {

    @XmlElement(name = "MsgRsHdr")
    protected MsgRsHdr msgRsHdr;
    @XmlElement(name = "Status")
    protected List<Status> status;
    @XmlElement(name = "Account")
    protected AccountRstype account;
    @XmlElement(name = "Customer")
    protected CustomerRstype customer;

    /**
     * Obtiene el valor de la propiedad msgRsHdr.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdr }
     *     
     */
    public MsgRsHdr getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Define el valor de la propiedad msgRsHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdr }
     *     
     */
    public void setMsgRsHdr(MsgRsHdr value) {
        this.msgRsHdr = value;
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
     * Obtiene el valor de la propiedad account.
     * 
     * @return
     *     possible object is
     *     {@link AccountRstype }
     *     
     */
    public AccountRstype getAccount() {
        return account;
    }

    /**
     * Define el valor de la propiedad account.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRstype }
     *     
     */
    public void setAccount(AccountRstype value) {
        this.account = value;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRstype }
     *     
     */
    public CustomerRstype getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRstype }
     *     
     */
    public void setCustomer(CustomerRstype value) {
        this.customer = value;
    }

}

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
import com.banesco.xmlns.enterpriseobjects.banking.Banking;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;


/**
 * <p>Clase Java para transferOtherBankAccount_Rq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transferOtherBankAccount_Rq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}MsgRqHdr"/&gt;
 *         &lt;element name="Account" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}Account" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Banking" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}Banking" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferOtherBankAccount_Rq", propOrder = {
    "msgRqHdr",
    "account",
    "banking"
})
public class TransferOtherBankAccountRq {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdr msgRqHdr;
    @XmlElement(name = "Account")
    protected List<Account> account;
    @XmlElement(name = "Banking")
    protected Banking banking;

    /**
     * Obtiene el valor de la propiedad msgRqHdr.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdr }
     *     
     */
    public MsgRqHdr getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Define el valor de la propiedad msgRqHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdr }
     *     
     */
    public void setMsgRqHdr(MsgRqHdr value) {
        this.msgRqHdr = value;
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
     * Obtiene el valor de la propiedad banking.
     * 
     * @return
     *     possible object is
     *     {@link Banking }
     *     
     */
    public Banking getBanking() {
        return banking;
    }

    /**
     * Define el valor de la propiedad banking.
     * 
     * @param value
     *     allowed object is
     *     {@link Banking }
     *     
     */
    public void setBanking(Banking value) {
        this.banking = value;
    }

}

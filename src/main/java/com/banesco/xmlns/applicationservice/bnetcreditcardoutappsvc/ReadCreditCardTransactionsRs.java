//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.03 at 11:13:06 AM VET 
//


package com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.account.Account;
import com.banesco.xmlns.enterpriseobjects.banking.Banking;
import com.banesco.xmlns.enterpriseobjects.bill.BillInfo;
import com.banesco.xmlns.enterpriseobjects.msgrshdr.MsgRsHdr;
import com.banesco.xmlns.enterpriseobjects.status.Status;


/**
 * <p>Java class for readCreditCardTransactions_Rs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readCreditCardTransactions_Rs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}MsgRsHdr" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Status" type="{http://xmlns.banesco.com/EnterpriseObjects/Status}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Banking" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}Banking" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}Account" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Bill}BillInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readCreditCardTransactions_Rs", propOrder = {
    "msgRsHdr",
    "status",
    "banking",
    "account",
    "billInfo"
})
public class ReadCreditCardTransactionsRs {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected List<MsgRsHdr> msgRsHdr;
    @XmlElement(name = "Status")
    protected List<Status> status;
    @XmlElement(name = "Banking")
    protected List<Banking> banking;
    @XmlElement(name = "Account")
    protected List<Account> account;
    @XmlElement(name = "BillInfo")
    protected List<BillInfo> billInfo;

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
     * Gets the value of the billInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillInfo }
     * 
     * 
     */
    public List<BillInfo> getBillInfo() {
        if (billInfo == null) {
            billInfo = new ArrayList<BillInfo>();
        }
        return this.billInfo;
    }

}
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
import com.banesco.xmlns.enterpriseobjects.customer.Customer;
import com.banesco.xmlns.enterpriseobjects.fee.Fee;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;
import com.banesco.xmlns.enterpriseobjects.pointofservicedata.PointOfServiceData;
import com.banesco.xmlns.enterpriseobjects.selrangedt.SelRangeDt;


/**
 * <p>Clase Java para readAccountTransactions_Rq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readAccountTransactions_Rq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}MsgRqHdr"/&gt;
 *         &lt;element name="Account" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}Account" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://xmlns.banesco.com/EnterpriseObjects/Fee}Fee" minOccurs="0"/&gt;
 *         &lt;element name="SelRangeDt" type="{http://xmlns.banesco.com/EnterpriseObjects/SelRangeDt}SelRangeDt" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}Customer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PointOfServiceData" type="{http://xmlns.banesco.com/EnterpriseObjects/PointOfServiceData}PointOfServiceData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readAccountTransactions_Rq", propOrder = {
    "msgRqHdr",
    "account",
    "fee",
    "selRangeDt",
    "customer",
    "pointOfServiceData"
})
public class ReadAccountTransactionsRq {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdr msgRqHdr;
    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "Fee")
    protected Fee fee;
    @XmlElement(name = "SelRangeDt")
    protected SelRangeDt selRangeDt;
    @XmlElement(name = "Customer")
    protected List<Customer> customer;
    @XmlElement(name = "PointOfServiceData")
    protected List<PointOfServiceData> pointOfServiceData;

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
     * Obtiene el valor de la propiedad account.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Define el valor de la propiedad account.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Obtiene el valor de la propiedad fee.
     * 
     * @return
     *     possible object is
     *     {@link Fee }
     *     
     */
    public Fee getFee() {
        return fee;
    }

    /**
     * Define el valor de la propiedad fee.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee }
     *     
     */
    public void setFee(Fee value) {
        this.fee = value;
    }

    /**
     * Obtiene el valor de la propiedad selRangeDt.
     * 
     * @return
     *     possible object is
     *     {@link SelRangeDt }
     *     
     */
    public SelRangeDt getSelRangeDt() {
        return selRangeDt;
    }

    /**
     * Define el valor de la propiedad selRangeDt.
     * 
     * @param value
     *     allowed object is
     *     {@link SelRangeDt }
     *     
     */
    public void setSelRangeDt(SelRangeDt value) {
        this.selRangeDt = value;
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
     * Gets the value of the pointOfServiceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfServiceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfServiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfServiceData }
     * 
     * 
     */
    public List<PointOfServiceData> getPointOfServiceData() {
        if (pointOfServiceData == null) {
            pointOfServiceData = new ArrayList<PointOfServiceData>();
        }
        return this.pointOfServiceData;
    }

}

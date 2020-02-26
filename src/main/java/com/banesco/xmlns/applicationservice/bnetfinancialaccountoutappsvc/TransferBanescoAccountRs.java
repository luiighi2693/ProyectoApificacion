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
import com.banesco.xmlns.enterpriseobjects.customer.Customer;
import com.banesco.xmlns.enterpriseobjects.fee.Fee;
import com.banesco.xmlns.enterpriseobjects.msgrshdr.MsgRsHdr;
import com.banesco.xmlns.enterpriseobjects.status.Status;
import com.banesco.xmlns.enterpriseobjects.taxes.Taxes;


/**
 * <p>Clase Java para transferBanescoAccount_Rs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transferBanescoAccount_Rs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRsHdr}MsgRsHdr" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Status" type="{http://xmlns.banesco.com/EnterpriseObjects/Status}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}Customer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Taxes" type="{http://xmlns.banesco.com/EnterpriseObjects/Taxes}Taxes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://xmlns.banesco.com/EnterpriseObjects/Fee}Fee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferBanescoAccount_Rs", propOrder = {
    "msgRsHdr",
    "status",
    "customer",
    "taxes",
    "fee"
})
public class TransferBanescoAccountRs {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected List<MsgRsHdr> msgRsHdr;
    @XmlElement(name = "Status")
    protected List<Status> status;
    @XmlElement(name = "Customer")
    protected List<Customer> customer;
    @XmlElement(name = "Taxes")
    protected List<Taxes> taxes;
    @XmlElement(name = "Fee")
    protected List<Fee> fee;

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
     * Gets the value of the taxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Taxes }
     * 
     * 
     */
    public List<Taxes> getTaxes() {
        if (taxes == null) {
            taxes = new ArrayList<Taxes>();
        }
        return this.taxes;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * 
     * 
     */
    public List<Fee> getFee() {
        if (fee == null) {
            fee = new ArrayList<Fee>();
        }
        return this.fee;
    }

}

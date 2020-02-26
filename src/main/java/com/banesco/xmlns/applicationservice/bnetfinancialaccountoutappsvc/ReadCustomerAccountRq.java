//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.customer.Customer;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;
import com.banesco.xmlns.enterpriseobjects.product.Product;


/**
 * <p>Clase Java para readCustomerAccount_Rq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readCustomerAccount_Rq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}MsgRqHdr"/&gt;
 *         &lt;element name="Customer" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}Customer" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://xmlns.banesco.com/EnterpriseObjects/Product}Product" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readCustomerAccount_Rq", propOrder = {
    "msgRqHdr",
    "customer",
    "product"
})
public class ReadCustomerAccountRq {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdr msgRqHdr;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "Product")
    protected Product product;

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
     * Obtiene el valor de la propiedad product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Define el valor de la propiedad product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

}

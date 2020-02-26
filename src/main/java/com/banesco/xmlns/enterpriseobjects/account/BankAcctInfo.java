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
import com.banesco.xmlns.enterpriseobjects.product.Product;


/**
 * <p>Clase Java para BankAcctInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BankAcctInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustAcctUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://xmlns.banesco.com/EnterpriseObjects/Product}Product" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MovType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssociateNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctInfo", propOrder = {
    "desc",
    "custAcctUse",
    "product",
    "movType",
    "associateNum"
})
public class BankAcctInfo {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "CustAcctUse")
    protected String custAcctUse;
    @XmlElement(name = "Product")
    protected List<Product> product;
    @XmlElement(name = "MovType")
    protected String movType;
    @XmlElement(name = "AssociateNum")
    protected String associateNum;

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad custAcctUse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAcctUse() {
        return custAcctUse;
    }

    /**
     * Define el valor de la propiedad custAcctUse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAcctUse(String value) {
        this.custAcctUse = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Product>();
        }
        return this.product;
    }

    /**
     * Obtiene el valor de la propiedad movType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovType() {
        return movType;
    }

    /**
     * Define el valor de la propiedad movType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovType(String value) {
        this.movType = value;
    }

    /**
     * Obtiene el valor de la propiedad associateNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateNum() {
        return associateNum;
    }

    /**
     * Define el valor de la propiedad associateNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateNum(String value) {
        this.associateNum = value;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Product complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubProdTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubProdTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "productId",
    "prodDesc",
    "subProdTypeCode",
    "subProdTypeDesc",
    "prodTypeCode",
    "prodTypeDesc"
})
public class Product {

    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProdDesc")
    protected String prodDesc;
    @XmlElement(name = "SubProdTypeCode")
    protected String subProdTypeCode;
    @XmlElement(name = "SubProdTypeDesc")
    protected String subProdTypeDesc;
    @XmlElement(name = "ProdTypeCode")
    protected String prodTypeCode;
    @XmlElement(name = "ProdTypeDesc")
    protected String prodTypeDesc;

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad prodDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdDesc() {
        return prodDesc;
    }

    /**
     * Define el valor de la propiedad prodDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdDesc(String value) {
        this.prodDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad subProdTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProdTypeCode() {
        return subProdTypeCode;
    }

    /**
     * Define el valor de la propiedad subProdTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProdTypeCode(String value) {
        this.subProdTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad subProdTypeDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProdTypeDesc() {
        return subProdTypeDesc;
    }

    /**
     * Define el valor de la propiedad subProdTypeDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProdTypeDesc(String value) {
        this.subProdTypeDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad prodTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdTypeCode() {
        return prodTypeCode;
    }

    /**
     * Define el valor de la propiedad prodTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdTypeCode(String value) {
        this.prodTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad prodTypeDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdTypeDesc() {
        return prodTypeDesc;
    }

    /**
     * Define el valor de la propiedad prodTypeDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdTypeDesc(String value) {
        this.prodTypeDesc = value;
    }

}

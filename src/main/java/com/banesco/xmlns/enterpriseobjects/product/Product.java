//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.product;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ProdCurCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Product}ProdStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Plan" type="{http://xmlns.banesco.com/EnterpriseObjects/Product}Plan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SourceApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BnkNotType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BnkNotDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BnkNotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BnkNotName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BatchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubProduct" type="{http://xmlns.banesco.com/EnterpriseObjects/Product}SubProduct" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "prodTypeDesc",
    "prodCurCode",
    "prodStatus",
    "plan",
    "sourceApp",
    "prodName",
    "bnkNotType",
    "bnkNotDesc",
    "bnkNotCode",
    "bnkNotName",
    "batchCode",
    "subProduct"
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
    @XmlElement(name = "ProdCurCode")
    protected String prodCurCode;
    @XmlElement(name = "ProdStatus")
    protected List<ProdStatus> prodStatus;
    @XmlElement(name = "Plan")
    protected List<Plan> plan;
    @XmlElement(name = "SourceApp")
    protected String sourceApp;
    @XmlElement(name = "ProdName")
    protected String prodName;
    @XmlElement(name = "BnkNotType")
    protected String bnkNotType;
    @XmlElement(name = "BnkNotDesc")
    protected String bnkNotDesc;
    @XmlElement(name = "BnkNotCode")
    protected String bnkNotCode;
    @XmlElement(name = "BnkNotName")
    protected String bnkNotName;
    @XmlElement(name = "BatchCode")
    protected String batchCode;
    @XmlElement(name = "SubProduct")
    protected List<SubProduct> subProduct;

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

    /**
     * Obtiene el valor de la propiedad prodCurCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCurCode() {
        return prodCurCode;
    }

    /**
     * Define el valor de la propiedad prodCurCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCurCode(String value) {
        this.prodCurCode = value;
    }

    /**
     * Gets the value of the prodStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdStatus }
     * 
     * 
     */
    public List<ProdStatus> getProdStatus() {
        if (prodStatus == null) {
            prodStatus = new ArrayList<ProdStatus>();
        }
        return this.prodStatus;
    }

    /**
     * Gets the value of the plan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plan }
     * 
     * 
     */
    public List<Plan> getPlan() {
        if (plan == null) {
            plan = new ArrayList<Plan>();
        }
        return this.plan;
    }

    /**
     * Obtiene el valor de la propiedad sourceApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceApp() {
        return sourceApp;
    }

    /**
     * Define el valor de la propiedad sourceApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceApp(String value) {
        this.sourceApp = value;
    }

    /**
     * Obtiene el valor de la propiedad prodName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * Define el valor de la propiedad prodName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdName(String value) {
        this.prodName = value;
    }

    /**
     * Obtiene el valor de la propiedad bnkNotType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkNotType() {
        return bnkNotType;
    }

    /**
     * Define el valor de la propiedad bnkNotType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkNotType(String value) {
        this.bnkNotType = value;
    }

    /**
     * Obtiene el valor de la propiedad bnkNotDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkNotDesc() {
        return bnkNotDesc;
    }

    /**
     * Define el valor de la propiedad bnkNotDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkNotDesc(String value) {
        this.bnkNotDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad bnkNotCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkNotCode() {
        return bnkNotCode;
    }

    /**
     * Define el valor de la propiedad bnkNotCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkNotCode(String value) {
        this.bnkNotCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bnkNotName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkNotName() {
        return bnkNotName;
    }

    /**
     * Define el valor de la propiedad bnkNotName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkNotName(String value) {
        this.bnkNotName = value;
    }

    /**
     * Obtiene el valor de la propiedad batchCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchCode() {
        return batchCode;
    }

    /**
     * Define el valor de la propiedad batchCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchCode(String value) {
        this.batchCode = value;
    }

    /**
     * Gets the value of the subProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubProduct }
     * 
     * 
     */
    public List<SubProduct> getSubProduct() {
        if (subProduct == null) {
            subProduct = new ArrayList<SubProduct>();
        }
        return this.subProduct;
    }

}

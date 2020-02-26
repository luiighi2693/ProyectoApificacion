//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.pmtbatchrec;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.product.Product;


/**
 * <p>Clase Java para PmtBatchRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchRec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedDt" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PmtBatchId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="BatchDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://xmlns.banesco.com/EnterpriseObjects/Product}Product" minOccurs="0"/&gt;
 *         &lt;element name="PmtBatchStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/PmtBatchRec}PmtBatchStatus" minOccurs="0"/&gt;
 *         &lt;element name="AcctTrnInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/PmtBatchRec}AcctTrnInfo" minOccurs="0"/&gt;
 *         &lt;element name="TotalCurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/PmtBatchRec}TotalCurAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtBatchRec", propOrder = {
    "createdDt",
    "pmtBatchId",
    "batchDesc",
    "product",
    "pmtBatchStatus",
    "acctTrnInfo",
    "totalCurAmt"
})
public class PmtBatchRec {

    @XmlElement(name = "CreatedDt")
    protected List<String> createdDt;
    @XmlElement(name = "PmtBatchId")
    protected BigInteger pmtBatchId;
    @XmlElement(name = "BatchDesc")
    protected String batchDesc;
    @XmlElement(name = "Product")
    protected Product product;
    @XmlElement(name = "PmtBatchStatus")
    protected PmtBatchStatus pmtBatchStatus;
    @XmlElement(name = "AcctTrnInfo")
    protected AcctTrnInfo acctTrnInfo;
    @XmlElement(name = "TotalCurAmt")
    protected TotalCurAmt totalCurAmt;

    /**
     * Gets the value of the createdDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createdDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatedDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCreatedDt() {
        if (createdDt == null) {
            createdDt = new ArrayList<String>();
        }
        return this.createdDt;
    }

    /**
     * Obtiene el valor de la propiedad pmtBatchId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPmtBatchId() {
        return pmtBatchId;
    }

    /**
     * Define el valor de la propiedad pmtBatchId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPmtBatchId(BigInteger value) {
        this.pmtBatchId = value;
    }

    /**
     * Obtiene el valor de la propiedad batchDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchDesc() {
        return batchDesc;
    }

    /**
     * Define el valor de la propiedad batchDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchDesc(String value) {
        this.batchDesc = value;
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

    /**
     * Obtiene el valor de la propiedad pmtBatchStatus.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatus }
     *     
     */
    public PmtBatchStatus getPmtBatchStatus() {
        return pmtBatchStatus;
    }

    /**
     * Define el valor de la propiedad pmtBatchStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatus }
     *     
     */
    public void setPmtBatchStatus(PmtBatchStatus value) {
        this.pmtBatchStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad acctTrnInfo.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnInfo }
     *     
     */
    public AcctTrnInfo getAcctTrnInfo() {
        return acctTrnInfo;
    }

    /**
     * Define el valor de la propiedad acctTrnInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnInfo }
     *     
     */
    public void setAcctTrnInfo(AcctTrnInfo value) {
        this.acctTrnInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCurAmt.
     * 
     * @return
     *     possible object is
     *     {@link TotalCurAmt }
     *     
     */
    public TotalCurAmt getTotalCurAmt() {
        return totalCurAmt;
    }

    /**
     * Define el valor de la propiedad totalCurAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCurAmt }
     *     
     */
    public void setTotalCurAmt(TotalCurAmt value) {
        this.totalCurAmt = value;
    }

}

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
 * <p>Clase Java para AcctTrnInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SPRefIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigDt" type="{http://xmlns.banesco.com/EnterpriseObjects/PmtBatchRec}dateTimePattern" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostedDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrnStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrnCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TrnStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ConceptCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TotalTrnNum" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://xmlns.banesco.com/EnterpriseObjects/Product}Product" minOccurs="0"/&gt;
 *         &lt;element name="CurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/PmtBatchRec}CurAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnInfo", propOrder = {
    "trnType",
    "spRefIdent",
    "origDt",
    "postedDt",
    "trnStatusDesc",
    "trnCode",
    "trnStatus",
    "conceptCode",
    "totalTrnNum",
    "product",
    "curAmt"
})
public class AcctTrnInfo {

    @XmlElement(name = "TrnType")
    protected BigInteger trnType;
    @XmlElement(name = "SPRefIdent")
    protected String spRefIdent;
    @XmlElement(name = "OrigDt")
    protected List<String> origDt;
    @XmlElement(name = "PostedDt")
    protected String postedDt;
    @XmlElement(name = "TrnStatusDesc")
    protected String trnStatusDesc;
    @XmlElement(name = "TrnCode")
    protected BigInteger trnCode;
    @XmlElement(name = "TrnStatus")
    protected BigInteger trnStatus;
    @XmlElement(name = "ConceptCode")
    protected BigInteger conceptCode;
    @XmlElement(name = "TotalTrnNum")
    protected List<BigInteger> totalTrnNum;
    @XmlElement(name = "Product")
    protected Product product;
    @XmlElement(name = "CurAmt")
    protected CurAmt curAmt;

    /**
     * Obtiene el valor de la propiedad trnType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrnType() {
        return trnType;
    }

    /**
     * Define el valor de la propiedad trnType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrnType(BigInteger value) {
        this.trnType = value;
    }

    /**
     * Obtiene el valor de la propiedad spRefIdent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefIdent() {
        return spRefIdent;
    }

    /**
     * Define el valor de la propiedad spRefIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefIdent(String value) {
        this.spRefIdent = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrigDt() {
        if (origDt == null) {
            origDt = new ArrayList<String>();
        }
        return this.origDt;
    }

    /**
     * Obtiene el valor de la propiedad postedDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostedDt() {
        return postedDt;
    }

    /**
     * Define el valor de la propiedad postedDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostedDt(String value) {
        this.postedDt = value;
    }

    /**
     * Obtiene el valor de la propiedad trnStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnStatusDesc() {
        return trnStatusDesc;
    }

    /**
     * Define el valor de la propiedad trnStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnStatusDesc(String value) {
        this.trnStatusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad trnCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrnCode() {
        return trnCode;
    }

    /**
     * Define el valor de la propiedad trnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrnCode(BigInteger value) {
        this.trnCode = value;
    }

    /**
     * Obtiene el valor de la propiedad trnStatus.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrnStatus() {
        return trnStatus;
    }

    /**
     * Define el valor de la propiedad trnStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrnStatus(BigInteger value) {
        this.trnStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConceptCode() {
        return conceptCode;
    }

    /**
     * Define el valor de la propiedad conceptCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConceptCode(BigInteger value) {
        this.conceptCode = value;
    }

    /**
     * Gets the value of the totalTrnNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalTrnNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalTrnNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getTotalTrnNum() {
        if (totalTrnNum == null) {
            totalTrnNum = new ArrayList<BigInteger>();
        }
        return this.totalTrnNum;
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
     * Obtiene el valor de la propiedad curAmt.
     * 
     * @return
     *     possible object is
     *     {@link CurAmt }
     *     
     */
    public CurAmt getCurAmt() {
        return curAmt;
    }

    /**
     * Define el valor de la propiedad curAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmt }
     *     
     */
    public void setCurAmt(CurAmt value) {
        this.curAmt = value;
    }

}

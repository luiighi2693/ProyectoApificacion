//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.bankinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.addr.Addr;
import com.banesco.xmlns.enterpriseobjects.chk.Chk;


/**
 * <p>Clase Java para Bankinfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Bankinfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://xmlns.banesco.com/EnterpriseObjects/Addr}Addr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Chk" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}Chk" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bankinfo", propOrder = {
    "branchId",
    "branchName",
    "branchLocation",
    "branchIdType",
    "bankId",
    "name",
    "addr",
    "chk"
})
public class Bankinfo {

    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "BranchName")
    protected String branchName;
    @XmlElement(name = "BranchLocation")
    protected String branchLocation;
    @XmlElement(name = "BranchIdType")
    protected String branchIdType;
    @XmlElement(name = "BankId")
    protected String bankId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Addr")
    protected List<Addr> addr;
    @XmlElement(name = "Chk")
    protected List<Chk> chk;

    /**
     * Obtiene el valor de la propiedad branchId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Define el valor de la propiedad branchId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Obtiene el valor de la propiedad branchName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Define el valor de la propiedad branchName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Obtiene el valor de la propiedad branchLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchLocation() {
        return branchLocation;
    }

    /**
     * Define el valor de la propiedad branchLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchLocation(String value) {
        this.branchLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad branchIdType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdType() {
        return branchIdType;
    }

    /**
     * Define el valor de la propiedad branchIdType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdType(String value) {
        this.branchIdType = value;
    }

    /**
     * Obtiene el valor de la propiedad bankId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Define el valor de la propiedad bankId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addr }
     * 
     * 
     */
    public List<Addr> getAddr() {
        if (addr == null) {
            addr = new ArrayList<Addr>();
        }
        return this.addr;
    }

    /**
     * Gets the value of the chk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chk }
     * 
     * 
     */
    public List<Chk> getChk() {
        if (chk == null) {
            chk = new ArrayList<Chk>();
        }
        return this.chk;
    }

}

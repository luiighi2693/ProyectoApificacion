//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.03 at 11:13:06 AM VET 
//


package com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadCreditCardTransactionsRq_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", "readCreditCardTransactions_Rq");
    private final static QName _ReadCreditCardTransactionsRs_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", "readCreditCardTransactions_Rs");
    private final static QName _ReadCreditCardBalanceRq_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", "readCreditCardBalance_Rq");
    private final static QName _ReadCreditCardBalanceRs_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", "readCreditCardBalance_Rs");
    private final static QName _BlockCreditCardRq_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", "blockCreditCard_Rq");
    private final static QName _BlockCreditCardRs_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", "blockCreditCard_Rs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadCreditCardTransactionsRq }
     * 
     */
    public ReadCreditCardTransactionsRq createReadCreditCardTransactionsRq() {
        return new ReadCreditCardTransactionsRq();
    }

    /**
     * Create an instance of {@link ReadCreditCardTransactionsRs }
     * 
     */
    public ReadCreditCardTransactionsRs createReadCreditCardTransactionsRs() {
        return new ReadCreditCardTransactionsRs();
    }

    /**
     * Create an instance of {@link ReadCreditCardBalanceRq }
     * 
     */
    public ReadCreditCardBalanceRq createReadCreditCardBalanceRq() {
        return new ReadCreditCardBalanceRq();
    }

    /**
     * Create an instance of {@link ReadCreditCardBalanceRs }
     * 
     */
    public ReadCreditCardBalanceRs createReadCreditCardBalanceRs() {
        return new ReadCreditCardBalanceRs();
    }

    /**
     * Create an instance of {@link BlockCreditCardRq }
     * 
     */
    public BlockCreditCardRq createBlockCreditCardRq() {
        return new BlockCreditCardRq();
    }

    /**
     * Create an instance of {@link BlockCreditCardRs }
     * 
     */
    public BlockCreditCardRs createBlockCreditCardRs() {
        return new BlockCreditCardRs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCreditCardTransactionsRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadCreditCardTransactionsRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", name = "readCreditCardTransactions_Rq")
    public JAXBElement<ReadCreditCardTransactionsRq> createReadCreditCardTransactionsRq(ReadCreditCardTransactionsRq value) {
        return new JAXBElement<ReadCreditCardTransactionsRq>(_ReadCreditCardTransactionsRq_QNAME, ReadCreditCardTransactionsRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCreditCardTransactionsRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadCreditCardTransactionsRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", name = "readCreditCardTransactions_Rs")
    public JAXBElement<ReadCreditCardTransactionsRs> createReadCreditCardTransactionsRs(ReadCreditCardTransactionsRs value) {
        return new JAXBElement<ReadCreditCardTransactionsRs>(_ReadCreditCardTransactionsRs_QNAME, ReadCreditCardTransactionsRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCreditCardBalanceRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadCreditCardBalanceRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", name = "readCreditCardBalance_Rq")
    public JAXBElement<ReadCreditCardBalanceRq> createReadCreditCardBalanceRq(ReadCreditCardBalanceRq value) {
        return new JAXBElement<ReadCreditCardBalanceRq>(_ReadCreditCardBalanceRq_QNAME, ReadCreditCardBalanceRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCreditCardBalanceRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadCreditCardBalanceRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", name = "readCreditCardBalance_Rs")
    public JAXBElement<ReadCreditCardBalanceRs> createReadCreditCardBalanceRs(ReadCreditCardBalanceRs value) {
        return new JAXBElement<ReadCreditCardBalanceRs>(_ReadCreditCardBalanceRs_QNAME, ReadCreditCardBalanceRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockCreditCardRq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlockCreditCardRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", name = "blockCreditCard_Rq")
    public JAXBElement<BlockCreditCardRq> createBlockCreditCardRq(BlockCreditCardRq value) {
        return new JAXBElement<BlockCreditCardRq>(_BlockCreditCardRq_QNAME, BlockCreditCardRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockCreditCardRs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlockCreditCardRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.banesco.com/ApplicationService/BNETCreditCardOutAppSvc", name = "blockCreditCard_Rs")
    public JAXBElement<BlockCreditCardRs> createBlockCreditCardRs(BlockCreditCardRs value) {
        return new JAXBElement<BlockCreditCardRs>(_BlockCreditCardRs_QNAME, BlockCreditCardRs.class, null, value);
    }

}

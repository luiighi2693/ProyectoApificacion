//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.03.09 a las 04:12:39 PM VET 
//


package com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc package. 
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

    private final static QName _ReadAccountBalanceRq_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/APIFinancialAccountOutAppSvc", "readAccountBalance_Rq");
    private final static QName _ReadAccountBalanceRs_QNAME = new QName("http://xmlns.banesco.com/ApplicationService/APIFinancialAccountOutAppSvc", "readAccountBalance_Rs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRq }
     * 
     */
    public TransferBanescoAccountRq createTransferBanescoAccountRq() {
        return new TransferBanescoAccountRq();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRs }
     * 
     */
    public TransferBanescoAccountRs createTransferBanescoAccountRs() {
        return new TransferBanescoAccountRs();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRs.Taxes }
     * 
     */
    public TransferBanescoAccountRs.Taxes createTransferBanescoAccountRsTaxes() {
        return new TransferBanescoAccountRs.Taxes();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRs.Taxes.TaxInfo }
     * 
     */
    public TransferBanescoAccountRs.Taxes.TaxInfo createTransferBanescoAccountRsTaxesTaxInfo() {
        return new TransferBanescoAccountRs.Taxes.TaxInfo();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRs.Customer }
     * 
     */
    public TransferBanescoAccountRs.Customer createTransferBanescoAccountRsCustomer() {
        return new TransferBanescoAccountRs.Customer();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRq.Banking }
     * 
     */
    public TransferBanescoAccountRq.Banking createTransferBanescoAccountRqBanking() {
        return new TransferBanescoAccountRq.Banking();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRq.Banking.BankAcctTrnRec }
     * 
     */
    public TransferBanescoAccountRq.Banking.BankAcctTrnRec createTransferBanescoAccountRqBankingBankAcctTrnRec() {
        return new TransferBanescoAccountRq.Banking.BankAcctTrnRec();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRq.Account }
     * 
     */
    public TransferBanescoAccountRq.Account createTransferBanescoAccountRqAccount() {
        return new TransferBanescoAccountRq.Account();
    }

    /**
     * Create an instance of {@link ReadAccountBalanceRqType }
     * 
     */
    public ReadAccountBalanceRqType createReadAccountBalanceRqType() {
        return new ReadAccountBalanceRqType();
    }

    /**
     * Create an instance of {@link ReadAccountBalanceRsType }
     * 
     */
    public ReadAccountBalanceRsType createReadAccountBalanceRsType() {
        return new ReadAccountBalanceRsType();
    }

    /**
     * Create an instance of {@link AccountRqtype }
     * 
     */
    public AccountRqtype createAccountRqtype() {
        return new AccountRqtype();
    }

    /**
     * Create an instance of {@link CurAmtRstype }
     * 
     */
    public CurAmtRstype createCurAmtRstype() {
        return new CurAmtRstype();
    }

    /**
     * Create an instance of {@link AcctBalRstype }
     * 
     */
    public AcctBalRstype createAcctBalRstype() {
        return new AcctBalRstype();
    }

    /**
     * Create an instance of {@link PersonInfoRsType }
     * 
     */
    public PersonInfoRsType createPersonInfoRsType() {
        return new PersonInfoRsType();
    }

    /**
     * Create an instance of {@link AccountRstype }
     * 
     */
    public AccountRstype createAccountRstype() {
        return new AccountRstype();
    }

    /**
     * Create an instance of {@link CustomerRstype }
     * 
     */
    public CustomerRstype createCustomerRstype() {
        return new CustomerRstype();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRs.Taxes.TaxInfo.CurAmt }
     * 
     */
    public TransferBanescoAccountRs.Taxes.TaxInfo.CurAmt createTransferBanescoAccountRsTaxesTaxInfoCurAmt() {
        return new TransferBanescoAccountRs.Taxes.TaxInfo.CurAmt();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRs.Customer.PersonInfo }
     * 
     */
    public TransferBanescoAccountRs.Customer.PersonInfo createTransferBanescoAccountRsCustomerPersonInfo() {
        return new TransferBanescoAccountRs.Customer.PersonInfo();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRq.Banking.BankAcctTrnRec.CurAmt }
     * 
     */
    public TransferBanescoAccountRq.Banking.BankAcctTrnRec.CurAmt createTransferBanescoAccountRqBankingBankAcctTrnRecCurAmt() {
        return new TransferBanescoAccountRq.Banking.BankAcctTrnRec.CurAmt();
    }

    /**
     * Create an instance of {@link TransferBanescoAccountRq.Account.BankInfo }
     * 
     */
    public TransferBanescoAccountRq.Account.BankInfo createTransferBanescoAccountRqAccountBankInfo() {
        return new TransferBanescoAccountRq.Account.BankInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAccountBalanceRqType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadAccountBalanceRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.banesco.com/ApplicationService/APIFinancialAccountOutAppSvc", name = "readAccountBalance_Rq")
    public JAXBElement<ReadAccountBalanceRqType> createReadAccountBalanceRq(ReadAccountBalanceRqType value) {
        return new JAXBElement<ReadAccountBalanceRqType>(_ReadAccountBalanceRq_QNAME, ReadAccountBalanceRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAccountBalanceRsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadAccountBalanceRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.banesco.com/ApplicationService/APIFinancialAccountOutAppSvc", name = "readAccountBalance_Rs")
    public JAXBElement<ReadAccountBalanceRsType> createReadAccountBalanceRs(ReadAccountBalanceRsType value) {
        return new JAXBElement<ReadAccountBalanceRsType>(_ReadAccountBalanceRs_QNAME, ReadAccountBalanceRsType.class, null, value);
    }

}

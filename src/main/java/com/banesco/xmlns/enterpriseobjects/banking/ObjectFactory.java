//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.banking;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.banesco.xmlns.enterpriseobjects.banking package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.banesco.xmlns.enterpriseobjects.banking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CurAmt }
     * 
     */
    public CurAmt createCurAmt() {
        return new CurAmt();
    }

    /**
     * Create an instance of {@link Banking }
     * 
     */
    public Banking createBanking() {
        return new Banking();
    }

    /**
     * Create an instance of {@link BankAcctTrnRec }
     * 
     */
    public BankAcctTrnRec createBankAcctTrnRec() {
        return new BankAcctTrnRec();
    }

    /**
     * Create an instance of {@link BankAcctFeatSupt }
     * 
     */
    public BankAcctFeatSupt createBankAcctFeatSupt() {
        return new BankAcctFeatSupt();
    }

    /**
     * Create an instance of {@link BankAgency }
     * 
     */
    public BankAgency createBankAgency() {
        return new BankAgency();
    }

    /**
     * Create an instance of {@link AcctBal }
     * 
     */
    public AcctBal createAcctBal() {
        return new AcctBal();
    }

}

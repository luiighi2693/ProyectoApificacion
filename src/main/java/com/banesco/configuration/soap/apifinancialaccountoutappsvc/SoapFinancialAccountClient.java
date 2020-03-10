package com.banesco.configuration.soap.apifinancialaccountoutappsvc;

import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.io.IOException;
import java.io.StringWriter;


public class SoapFinancialAccountClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SoapFinancialAccountClient.class);

    @Value( "${soap.financial.account.data.endpoint}" )
    private String soapFinancialAccountEndpoint;

    @Value( "${soap.financial.account.data.readcustomeraccount.action}" )
    private String readAccountBalanceAction;

    @Value( "${soap.financial.account.data.namespace}" )
    private String namespace;

    public ReadAccountBalanceRsType readAccountBalance(ReadAccountBalanceRqType request) {
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<ReadAccountBalanceRqType> reqjaxb = objectFactory.createReadAccountBalanceRq(request);

        /*
        //Codigo para imprimir la peticion XML
        StringWriter stringWriter = new StringWriter();
        try {   
        //set customer attributes 
        	JAXBContext jc = JAXBContext.newInstance(ReadAccountBalanceRqType.class);
        	Marshaller marshaller2 = jc.createMarshaller();
           	marshaller2.marshal(reqjaxb, stringWriter );
        } catch (JAXBException e) {
        	// 	TODO Auto-generated catch block
        	e.printStackTrace();
        }
        log.info(stringWriter.toString());
        */
        
        @SuppressWarnings("unchecked")
        JAXBElement<ReadAccountBalanceRsType> response = (JAXBElement<ReadAccountBalanceRsType>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        soapFinancialAccountEndpoint,
                        reqjaxb,
                        new SoapActionCallback(namespace + readAccountBalanceAction));
        return response.getValue();
    }

}
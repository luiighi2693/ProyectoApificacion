package com.banesco.configuration;

import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ObjectFactory;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRq;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.xml.transform.StringResult;

import javax.xml.bind.JAXBElement;
import java.io.IOException;


public class SoapClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SoapClient.class);

    @Value( "${soap.endpoint}" )
    private String soapEndpoint;

    @Value( "${soap.readcustomeraccount.action}" )
    private String readCustomerAcountAction;

    @Value( "${soap.namespace}" )
    private String namespace;

    public ReadCustomerAccountRs readCustomerAccount(ReadCustomerAccountRq request) {
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<ReadCustomerAccountRq> reqjaxb = objectFactory.createReadCustomerAccountRq(request);

        @SuppressWarnings("unchecked")
        JAXBElement<ReadCustomerAccountRs> response = (JAXBElement<ReadCustomerAccountRs>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        soapEndpoint,
                        reqjaxb,
                        new SoapActionCallback(namespace + readCustomerAcountAction));
        return response.getValue();
    }

}
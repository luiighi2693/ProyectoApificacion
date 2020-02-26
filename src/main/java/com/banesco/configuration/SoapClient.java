package com.banesco.configuration;

import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ObjectFactory;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRq;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;


public class SoapClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SoapClient.class);

    @Value( "${soap.endpoint}" )
    private String soapAuthEndpoint;

    @Value( "${soap.readcustomeraccount.action}" )
    private String readCustomerAcountAction;

    public ReadCustomerAccountRs readCustomerAccount(ReadCustomerAccountRq request) {
        ObjectFactory of = new ObjectFactory();
        JAXBElement<ReadCustomerAccountRq> reqjaxb = of.createReadCustomerAccountRq(request);

        @SuppressWarnings("unchecked")
        JAXBElement<ReadCustomerAccountRs> response = (JAXBElement<ReadCustomerAccountRs>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        soapAuthEndpoint,
                        reqjaxb,
                        new SoapActionCallback(readCustomerAcountAction));
        return response.getValue();
    }

}
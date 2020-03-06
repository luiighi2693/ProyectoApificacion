package com.banesco.configuration.soap.apifinancialaccountoutappsvc;

import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.ObjectFactory;
import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.ReadAccountBalanceRq;
import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.ReadAccountBalanceRs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;


public class SoapAccountDataClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SoapAccountDataClient.class);

    @Value( "${soap.account.data.endpoint}" )
    private String soapAccountDataEndpoint;

    @Value( "${soap.account.data.readcustomeraccount.action}" )
    private String readAccountBalanceAction;

    @Value( "${soap.account.data.namespace}" )
    private String namespace;

    public ReadAccountBalanceRs readAccountBalance(ReadAccountBalanceRq request) {
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<ReadAccountBalanceRq> reqjaxb = objectFactory.createReadAccountBalanceRq(request);

        @SuppressWarnings("unchecked")
        JAXBElement<ReadAccountBalanceRs> response = (JAXBElement<ReadAccountBalanceRs>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        soapAccountDataEndpoint,
                        reqjaxb,
                        new SoapActionCallback(namespace + readAccountBalanceAction));
        return response.getValue();
    }

}
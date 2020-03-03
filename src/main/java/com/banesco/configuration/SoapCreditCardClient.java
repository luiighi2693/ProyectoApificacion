package com.banesco.configuration;

import javax.xml.bind.JAXBElement;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc.ObjectFactory;
import com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc.ReadCreditCardBalanceRq;
import com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc.ReadCreditCardBalanceRs;

public class SoapCreditCardClient  extends WebServiceGatewaySupport {
	
	//private static final Logger log = LoggerFactory.getLogger(SoapClient.class);
	
    @Value( "${soap.endpoint.creditcard}" )
    private String soapEndpoint;

    @Value( "${soap.readcreditcardbalance.action}" )
    private String readCreditCardBalanceAction;

    @Value( "${soap.namespace.creditcard}" )
    private String namespace;

    @Autowired
    ObjectFactory objectFactoryCreditCard;
    
    public ReadCreditCardBalanceRs readCreditCardBalance(ReadCreditCardBalanceRq request) {
        JAXBElement<ReadCreditCardBalanceRq> reqjaxb = objectFactoryCreditCard.createReadCreditCardBalanceRq(request);

        @SuppressWarnings("unchecked")
        JAXBElement<ReadCreditCardBalanceRs> response = (JAXBElement<ReadCreditCardBalanceRs>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        soapEndpoint,
                        reqjaxb,
                        new SoapActionCallback(namespace + readCreditCardBalanceAction));
        return response.getValue();
    }
}

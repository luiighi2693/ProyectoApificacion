package com.banesco.configuration.soap;

import com.banesco.xmlns.applicationservice.portalpaymentriskratingoutappsvc.ObjectFactory;
import com.banesco.xmlns.applicationservice.portalpaymentriskratingoutappsvc.ValidateCustomerBlackListRq;
import com.banesco.xmlns.applicationservice.portalpaymentriskratingoutappsvc.ValidateCustomerBlackListRs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class SoapRiskRatingClient  extends WebServiceGatewaySupport {
	
//	private static final Logger log = LoggerFactory.getLogger(SoapRiskRatingClient.class);
	
    @Value( "${soap.endpoint.riskrating}" )
    private String soapEndpoint;

    @Value( "${soap.validatecustomerblacklist.action}" )
    private String validateCustomerBlackListAction;

    @Value( "${soap.namespace.riskrating}" )
    private String namespace;

    public ValidateCustomerBlackListRs validateCustomerBlackList(ValidateCustomerBlackListRq request) {
        ObjectFactory objectFactoryRiskRating = new ObjectFactory();
        ValidateCustomerBlackListRq reqjaxb = objectFactoryRiskRating.createValidateCustomerBlackListRq();

        @SuppressWarnings("unchecked")
        JAXBElement<ValidateCustomerBlackListRs> response = (JAXBElement<ValidateCustomerBlackListRs>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        soapEndpoint,
                        reqjaxb,
                        new SoapActionCallback(namespace + validateCustomerBlackListAction));
        return response.getValue();
    }
}

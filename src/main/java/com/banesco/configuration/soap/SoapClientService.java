package com.banesco.configuration.soap;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

public class SoapClientService extends WebServiceGatewaySupport {

    @SuppressWarnings("unchecked")
    public <T> T  callSoapService(String location,String soapAction,Object request) {
        JAXBElement<T> ret =  null;
        WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
        SoapActionCallback soapActionCallback = new SoapActionCallback(soapAction);
        ret = (JAXBElement<T>) webServiceTemplate.marshalSendAndReceive(location, request, soapActionCallback);
        return ret.getValue();
    }

    @SuppressWarnings("unchecked")
    //soapAction is not required at all in case Spring-Soap is a producer.
    public <T> T  callSpringSoapService(String location,Object request) {
        JAXBElement<T> ret =  null;
        WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
        ret = (JAXBElement<T>) webServiceTemplate.marshalSendAndReceive(location, request);
        return ret.getValue();
    }

}
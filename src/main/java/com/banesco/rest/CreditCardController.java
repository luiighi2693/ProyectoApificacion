package com.banesco.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banesco.configuration.RestClient;
import com.banesco.configuration.soap.SoapCreditCardClient;
import com.banesco.util.Util;
import com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc.ReadCreditCardBalanceRq;
import com.banesco.xmlns.applicationservice.bnetcreditcardoutappsvc.ReadCreditCardBalanceRs;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;

import io.swagger.annotations.Api;

@Controller
@Api(description = "Credit Card API")
@RequestMapping(path = "/creditCard")
public class CreditCardController {
	private Logger log = LoggerFactory.getLogger(CreditCardController.class);

    private final SoapCreditCardClient soapClient;
    private final RestClient restClient;

    @Autowired
    public CreditCardController(SoapCreditCardClient soapClient, RestClient restClient) {
        this.soapClient = soapClient;
        this.restClient = restClient;
    }

    @CrossOrigin
    @PostMapping(path = "/read/balance")
    public ResponseEntity<ReadCreditCardBalanceRs> readCreditCardBalance(@RequestBody ReadCreditCardBalanceRq request) {
        log.info("Requesting readCreditCardBalance for " + Util.getJsonFromObject(request));

        MsgRqHdr msgRqHdr = restClient.getHeader("readCreditCardBalance");
        log.info("logging header: " + Util.getJsonFromObject(msgRqHdr));

        log.info("Requesting getrequestId for: " + Util.instanceId);

        String requestId = restClient.getRequestId();

        log.info("logging requestId: " + requestId);

        msgRqHdr.setRequestId(requestId);
        request.setMsgRqHdr(msgRqHdr);
        
        ReadCreditCardBalanceRs response = soapClient.readCreditCardBalance(request);

        log.info("logging response: " + Util.getJsonFromObject(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
}

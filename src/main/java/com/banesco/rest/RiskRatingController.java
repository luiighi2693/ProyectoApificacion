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

import com.banesco.xmlns.applicationservice.portalpaymentriskratingoutappsvc.ValidateCustomerBlackListRq;
import com.banesco.xmlns.applicationservice.portalpaymentriskratingoutappsvc.ValidateCustomerBlackListRs;
import com.banesco.configuration.RestClient;
import com.banesco.configuration.soap.SoapRiskRatingClient;
import com.banesco.util.Util;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;

import io.swagger.annotations.Api;

@Controller
@Api(description = "Credit Card API")
@RequestMapping(path = "/creditCard")
public class RiskRatingController {
	private Logger log = LoggerFactory.getLogger(RiskRatingController.class);

    private final SoapRiskRatingClient soapClient;
    private final RestClient restClient;

    @Autowired
    public RiskRatingController(SoapRiskRatingClient soapClient, RestClient restClient) {
        this.soapClient = soapClient;
        this.restClient = restClient;
    }

    @CrossOrigin
    @PostMapping(path = "/risk/validate")
    public ResponseEntity<ValidateCustomerBlackListRs> readRiskRatingBalance(@RequestBody ValidateCustomerBlackListRq request) {
        log.info("Requesting readRiskRatingBalance for " + Util.getJsonFromObject(request));

        MsgRqHdr msgRqHdr = restClient.getHeader("readRiskRatingBalance");
        log.info("logging header: " + Util.getJsonFromObject(msgRqHdr));

        log.info("Requesting getrequestId for: " + Util.instanceId);

        String requestId = restClient.getRequestId();

        log.info("logging requestId: " + requestId);

        msgRqHdr.setRequestId(requestId);
        request.setMsgRqHdr(msgRqHdr);
        
        ValidateCustomerBlackListRs response = soapClient.validateCustomerBlackList(request);

        log.info("logging response: " + Util.getJsonFromObject(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
}

package com.banesco.rest;

import com.banesco.configuration.RestClient;
import com.banesco.configuration.soap.apifinancialaccountoutappsvc.SoapFinancialAccountClient;
import com.banesco.util.Util;
import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.ReadAccountBalanceRqType;
import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.ReadAccountBalanceRsType;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;
import io.swagger.annotations.Api;
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

@Controller
@Api(description = "Account Data API")
@RequestMapping(path = "/financial/account/")
public class FinancialAccountController {
    private Logger log = LoggerFactory.getLogger(FinancialAccountController.class);

    private final SoapFinancialAccountClient soapClient;
    private final RestClient restClient;

    @Autowired
    public FinancialAccountController(SoapFinancialAccountClient soapClient, RestClient restClient) {
        this.soapClient = soapClient;
        this.restClient = restClient;
    }

    @CrossOrigin
    @PostMapping(path = "/balance/read")
    public ResponseEntity<ReadAccountBalanceRsType> readAccountBalance(@RequestBody ReadAccountBalanceRqType request) {
        log.info("Requesting readAccountBalance for " + Util.getJsonFromObject(request));

        MsgRqHdr msgRqHdr = restClient.getHeader("readAccountBalance");
        log.info("logging header: " + Util.getJsonFromObject(msgRqHdr));

        log.info("Requesting getrequestId for: " + Util.instanceId);

        String requestId = restClient.getRequestId();

        log.info("logging requestId: " + requestId);

        msgRqHdr.setRequestId(requestId);
        request.setMsgRqHdr(msgRqHdr);

        ReadAccountBalanceRsType response = soapClient.readAccountBalance(request);

        log.info("logging response: " + Util.getJsonFromObject(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

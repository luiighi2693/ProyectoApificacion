package com.banesco.rest;

import com.banesco.configuration.RestClient;
import com.banesco.configuration.soap.apifinancialaccountoutappsvc.SoapAccountDataClient;
import com.banesco.util.Util;
import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.ReadAccountBalanceRq;
import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.ReadAccountBalanceRs;
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
@RequestMapping(path = "/account/data/")
public class AccountDataController {
    private Logger log = LoggerFactory.getLogger(AccountDataController.class);

    private final SoapAccountDataClient soapClient;
    private final RestClient restClient;

    @Autowired
    public AccountDataController(SoapAccountDataClient soapClient, RestClient restClient) {
        this.soapClient = soapClient;
        this.restClient = restClient;
    }

    @CrossOrigin
    @PostMapping(path = "/balance/read")
    public ResponseEntity<ReadAccountBalanceRs> readAccountBalance(@RequestBody ReadAccountBalanceRq request) {
        log.info("Requesting readAccountBalance for " + Util.getJsonFromObject(request));

        MsgRqHdr msgRqHdr = restClient.getHeader("readAccountBalance");
        log.info("logging header: " + Util.getJsonFromObject(msgRqHdr));

        log.info("Requesting getrequestId for: " + Util.instanceId);

        String requestId = restClient.getRequestId();

        log.info("logging requestId: " + requestId);

        msgRqHdr.setRequestId(requestId);
        request.setMsgRqHdr(msgRqHdr);

        ReadAccountBalanceRs response = soapClient.readAccountBalance(request);

        log.info("logging response: " + Util.getJsonFromObject(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

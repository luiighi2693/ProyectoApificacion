package com.banesco.rest;

//public class ReadCustomerAccountController {
//}

import com.banesco.configuration.RestClient;
import com.banesco.configuration.SoapClient;
import com.banesco.util.Util;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRq;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRs;
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

import java.util.List;

@Controller
@Api(description = "Read Customer Account API")
@RequestMapping(path = "/account")
public class AccountController {
    private Logger log = LoggerFactory.getLogger(AccountController.class);

    private final SoapClient soapClient;
    private final RestClient restClient;

    @Autowired
    public AccountController(SoapClient soapClient, RestClient restClient) {
        this.soapClient = soapClient;
        this.restClient = restClient;
    }

    @CrossOrigin
    @PostMapping(path = "/customer/read")
    public ResponseEntity<ReadCustomerAccountRs> readCustomerAccount(@RequestBody ReadCustomerAccountRq request) {
        log.info("Requesting readCustomerAccount for " + Util.getJsonFromObject(request));

        MsgRqHdr msgRqHdr = restClient.getHeader("readCustomerAccount");
        log.info("logging header: " + Util.getJsonFromObject(msgRqHdr));

        log.info("Requesting getrequestId for: " + Util.instanceId);

        String requestId = restClient.getRequestId();

        log.info("logging requestId: " + requestId);

        msgRqHdr.setRequestId(requestId);
        request.setMsgRqHdr(msgRqHdr);

        ReadCustomerAccountRs response = soapClient.readCustomerAccount(request);

        log.info("logging response: " + Util.getJsonFromObject(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

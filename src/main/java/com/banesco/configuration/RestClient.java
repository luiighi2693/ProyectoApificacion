package com.banesco.configuration;

import com.banesco.util.Util;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class RestClient {
    private Logger log = LoggerFactory.getLogger(RestClient.class);

    @Value( "${header.url}" )
    public String headerUrl;
    @Value( "${id-generator.url}" )
    public String idGeneratorUrl;
    @Value( "${id-generator.instanceid.path}" )
    public String instanceIdPath;
    @Value( "${id-generator.requestid.path}" )
    public String requestIdPath;

    @PostConstruct
    void init() {
        log.info("Request to getInstanceId");

        String result = this.getInstanceId();
        log.info("Response to getInstanceId: " + result);

        Util.instanceId = result;
    }

    public MsgRqHdr getHeader(String headerName) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MsgRqHdr> response
                = restTemplate.getForEntity(headerUrl + headerName, MsgRqHdr.class);
        return response.getBody();
    }

    public String getRequestId() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity(idGeneratorUrl + requestIdPath + Util.instanceId, String.class);
        return response.getBody();
    }

    public String getInstanceId() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity(idGeneratorUrl + instanceIdPath, String.class);
        return response.getBody();
    }
}

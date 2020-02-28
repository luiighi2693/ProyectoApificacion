package com.banesco.configuration;

import com.banesco.xmlns.enterpriseobjects.msgrshdr.MsgRsHdr;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RestClient {
    @Value( "${header.url}" )
    public String headerUrl;

    public List<MsgRsHdr> getHeader() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MsgRsHdr[]> response
                = restTemplate.getForEntity(headerUrl, MsgRsHdr[].class);
        return Arrays.asList(response.getBody());
    }
}

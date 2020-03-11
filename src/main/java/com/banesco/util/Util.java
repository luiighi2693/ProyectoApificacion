package com.banesco.util;

import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Util {

    public static String instanceId = null;

    public static String getJsonFromObject(Object object) {
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getInstanceId() {
        String s = RandomStringUtils.randomAlphanumeric(10);
        return "INST" + s;
    }

    public static String getRequestId(String instanceId) {
        String s = RandomStringUtils.randomAlphanumeric(20);
        return instanceId + "REQ"+ s;
    }

    public static MsgRqHdr getHeader(String headerName){
        MsgRqHdr msgRqHdr = null;
        try {
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("headers/" + headerName + ".json");
            ObjectMapper mapper = new ObjectMapper();
            msgRqHdr = mapper.readValue(Objects.requireNonNull(in),
                    MsgRqHdr.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return msgRqHdr;
    }
}

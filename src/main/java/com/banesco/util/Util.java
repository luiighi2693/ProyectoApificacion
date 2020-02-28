package com.banesco.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.RandomStringUtils;

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
        String s = RandomStringUtils.randomAlphanumeric(25);
        return "INSTANCEID-"+ s;
    }

    public static String getRequestId(String instanceId) {
        String s = RandomStringUtils.randomAlphanumeric(35);
        return instanceId + "REQUESTID-"+ s;
    }
}

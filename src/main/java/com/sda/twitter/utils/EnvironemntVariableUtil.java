package com.sda.twitter.utils;

public class EnvironemntVariableUtil {

    public static String getVariable(String key) {
        //    hibernate.connestion.username
        //    hibernate_connestion_username
        return System.getenv(key.replace('.', '_'));
    }
}

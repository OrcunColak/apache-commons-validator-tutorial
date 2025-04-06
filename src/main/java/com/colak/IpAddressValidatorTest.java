package com.colak;

import org.apache.commons.validator.routines.InetAddressValidator;

public class IpAddressValidatorTest {

    private static final InetAddressValidator VALIDATOR = InetAddressValidator.getInstance();

    public static void main(String[] args) {

        validateIpAddress("127.0.0.1");
        validateIpAddress("foo");

    }

    private static void validateIpAddress(String ipAddress) {

        if (!VALIDATOR.isValid(ipAddress)) {
            System.out.printf("%s is not valid%n", ipAddress);
        } else {
            System.out.printf("%s is valid%n", ipAddress);
        }

    }
}
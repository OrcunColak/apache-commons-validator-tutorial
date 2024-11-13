package com.colak;

import org.apache.commons.validator.routines.UrlValidator;

class UrlValidatorTest {

    private static final UrlValidator urlValidator = new UrlValidator();

    public static void main(String[] args) {
        validateLink("http://localhost:8080");
        validateLink("http://www.google.com");
    }

    private static void validateLink(String link) {
        if (!urlValidator.isValid(link)) {
            System.out.printf("%s is not valid%n", link);
        } else {
            System.out.printf("%s is valid", link);
        }
    }
}

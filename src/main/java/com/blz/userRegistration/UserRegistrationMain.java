package com.blz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    private static final int VALIDATE_FIRSTNAME =1 ;

    public static void main(String[] args) {
        System.out.println("welcome to Regex Example");
        UserRegistrationTest validate = new UserRegistrationTest();
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("1.To Validate the First name.");
        System.out.println("Enter the option number to perform the operation");
        int option = scan.nextInt();
        switch (option) {
            case VALIDATE_FIRSTNAME:
                System.out.println("Enter the First Name. Note: first letter should be capital");
                String firstName = scan.next();
                validate.validateFirstName(firstName);
                break;
            default:
                System.out.println("Please Enter valid option to validate the pattern");
                break;
        }
    }

}



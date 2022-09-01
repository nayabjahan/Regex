package com.blz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    private static final int VALIDATE_FIRSTNAME =1 ;
    private static final int VALIDATE_LASTNAME = 2;

    public static void main(String[] args) {
        System.out.println("welcome to Regex Example");
        UserRegistrationTest validate = new UserRegistrationTest();
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("1.To Validate the First name.");
        System.out.println("2.To Validate the last name.");
        System.out.println("Enter the option number to perform the operation");
        int option = scan.nextInt();
        switch (option) {
            case VALIDATE_FIRSTNAME:
                System.out.println("Enter the First Name. Note: first letter should be capital");
                String firstName = scan.next();
                validate.validateFirstName(firstName);
                break;
            case VALIDATE_LASTNAME:
                System.out.println("2.Enter the Last name(Note:First letter should be capital): ");
                String lastName = scan.next();
                validate.validateLastName(lastName);
                break;
            default:
                System.out.println("Please Enter valid option to validate the pattern");
                break;
        }
    }

}



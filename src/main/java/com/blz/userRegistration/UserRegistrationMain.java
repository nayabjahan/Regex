package com.blz.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    private static final int VALIDATE_FIRSTNAME =1 ;
    private static final int VALIDATE_LASTNAME = 2;
    private static final int VALIDATE_EMAIL = 3;
    private static final int VALIDATE_MOBILENUM = 4 ;
    private static final int VALIDATE_PASSWORD_MIN8_CHAR = 5;
    private static final int VALIDATE_PASSWORD_ATLEAT1UPPERCASE = 6;
    private static final int VALIDATE_PASSWORD_MIN1NUMERIC = 7;
    private static final int VALIDATE_PASSWORD_1SPECIALCHAR = 8;


    public static void main(String[] args) {
        System.out.println("welcome to Regex Example");
        UserRegistrationTest validate = new UserRegistrationTest();
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("1.To Validate the First name.");
        System.out.println("2.To Validate the last name.");
        System.out.println("3.To Validate the Email.");
        System.out.println("4.To Validate Mobile Number.");
        System.out.println("5.Validate Password:Min8Char");
        System.out.println("6.Validate Password:Atleast 1 Upper Case");
        System.out.println("7.Validate Password:Atleast 1 Numeric");
        System.out.println("8.Validate Password:Exactly 1 special Character");
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
            case VALIDATE_EMAIL:
                System.out.println("Enter the email id: ");
                String email = scan.next();
                validate.validateEmail(email);
                break;
            case VALIDATE_MOBILENUM:
                System.out.println("Enter the Mob no: ");
                scan.nextLine();
                String input = scan.nextLine();
                validate.validateMobNumber(input);
                break;
            case VALIDATE_PASSWORD_MIN8_CHAR:
                System.out.println("Enter the Password. Note: minimum 8 characters should be given");
                String password= scan.next();
                validate.validatePassword(password);
                break;
            case VALIDATE_PASSWORD_ATLEAT1UPPERCASE:
                System.out.println("Enter the Password. Note: Atleast 1 upper case should be given");
                String password1= scan.next();
                validate.validatePassword(password1);
                break;
            case VALIDATE_PASSWORD_MIN1NUMERIC:
                System.out.println("Enter the Password. Note: Atleast 1 numeric should be given");
                String password2= scan.next();
                validate.validatePassword(password2);
                break;
            case VALIDATE_PASSWORD_1SPECIALCHAR:
                System.out.println("Enter the Password. Note: Exactly 1 special character should be given");
                String password3= scan.next();
                validate.validatePassword(password3);
            default:
                System.out.println("Please Enter valid option to validate the pattern");
                break;
        }
    }

}



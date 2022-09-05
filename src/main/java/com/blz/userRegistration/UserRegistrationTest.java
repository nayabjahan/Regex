package com.blz.userRegistration;

public class UserRegistrationTest {

    UserInformation storePattern = new UserInformation();
    public void validateFirstName(String firstName){
        UserInformation store =new UserInformation();
        store.setFirstName("^[A-Z]{1}[a-z]{3,}$");
        String first= store.getFirstName();
        store.validatingInput(firstName,first,"FirstName");
    }
    public void validateLastName(String lastName){
        UserInformation f=new UserInformation();
        f.setLastName("^[A-Z]{1}[a-z]{3,}$");
        String last= f.getLastName();
        f.validatingInput(lastName,last,"LastName");
    }
    public void validateEmail(String email) {
        UserInformation storePattern = new UserInformation();
        storePattern.setEmail("[a-zA-z0-9]{2,}[_]@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}");
        storePattern.validatingInput(email,email,"Email");
    }
    public void validateMobNumber(String number) {
        UserInformation storePattern = new UserInformation();
        storePattern.setMobileNumber("^[0-9]{2}\s?[6-9]{1}[0-9]{9}");
        String mobPattern = storePattern.getMobileNumber();
        storePattern.validatingInput(number, mobPattern, "Mobile Number");
    }
        public void validatePassword(String password){
        //storePattern.setPasswordPattern("^[A-Z]{1}?:[a-zA-Z][_]@.[0-9]{7,}$");
            storePattern.setPasswordPattern("(?=.*?[A-Z]).{8,}");
            String passPattern= storePattern.getPasswordPattern();
        storePattern.validatingInput(password,passPattern,"Password");
    }
}

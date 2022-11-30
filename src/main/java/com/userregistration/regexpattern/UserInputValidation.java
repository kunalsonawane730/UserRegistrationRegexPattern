package com.userregistration.regexpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidation {
	// Creating isValidFirstName method to validate the first name given by user using regex
	  //return - true or false
	    public static boolean isValidFirstName(String firstName) {

	        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";  //Declaring regex pattern to check the firstName

	        Pattern pattern = Pattern.compile(firstNameRegex);
	        Matcher matcher = pattern.matcher(firstName);

	        return matcher.matches();
	    }
	    
	 // Creating isValidLastName method to validate the last name given by user using regex
	    public static boolean isValidLastName(String lastName) {
	        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";

	        Pattern pattern = Pattern.compile(firstNameRegex);

	        Matcher matcher = pattern.matcher(lastName);

	        return matcher.matches();
}
}

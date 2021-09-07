package assignment;

public class EmailIdValidatorDemoWithoutUserInput {

	public static void main(String[] args) {
		
		// Give the mail id as String to validate
		String str = "emailId123@abc.com";
		
		// Creating instance variable for EmailIdValidator class
		EmailIdValidator emailIdValidation = new EmailIdValidator();
		

		// Calling validateEmailId method and checking
		// If its true print EmailId is valid else EmailId is invalid
		if (emailIdValidation.validateEmailId(str)) {
			System.out.println("EmailId is valid");
		} else {
			System.out.println("EmailId is invalid");
		}
	}

}

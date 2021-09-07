package assignment;

import java.util.Scanner;

public class EmailIdValidatorDemoUserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the mail id");
		String str = sc.next();
		
		EmailIdValidator emailIdValidation = new EmailIdValidator();

		boolean isPresent = emailIdValidation.validateEmailId(str);

		while (!isPresent) {
				System.out.println("Emaild Id is not valid");
				System.out.println("Enter valid email Id");
				str = sc.next();
				isPresent = emailIdValidation.validateEmailId(str);
		}

		if (isPresent) {
			System.out.println("EmailId is valid");
		}
		sc.close();
	}

}

package assignment;

import java.util.HashSet;
import java.util.Set;

public class EmailIdValidator {

	// Method to validate the entered emailId with the list
	// return boolean value based on valid or invalid
	public boolean validateEmailId(String str) {
		Set<String> list = getListOfEmailIds();
		// for loop can also be used to check if the string is present or not iterating each element
		/*
		 * for (String mailId : list) { if (str.equals(mailId)) { isPresent = true;
		 * break; } }
		 */
		// Using contains method of list to check if present or not and returning
		return list.contains(str);

	}

	// Method to initialize the HashSet with mail ids
	private Set<String> getListOfEmailIds() {

		Set<String> list = new HashSet<String>();
		list.add("emailId1@abc.com");
		list.add("emailId2@abc.com");
		list.add("emailId3@abc.com");
		list.add("emailId4@abc.com");
		list.add("emailId5@abc.com");
		list.add("emailId6@abc.com");
		list.add("emailId7@abc.com");
		list.add("emailId8@abc.com");
		list.add("emailId9@abc.com");
		list.add("emailId10@abc.com");
		return list;

	}

}

package training.com.sk.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_3 {

	public static void main(String[] args) {
		CustomExceptionMain obj = new CustomExceptionMain();
	    obj.check("DevOps");
	    obj.check("Java Training");

	}
}

class CustomException extends RuntimeException {
	  CustomException(String message) {
	    super(message);
	  }
}
class CustomExceptionMain {

	  ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java Training", "SQL Training", "JavaScript Training"));

	  public void check(String language) throws CustomException{
		    if(languages.contains(language)) {
		      throw new CustomException(language + " already exists.");
		    }else {
		      languages.add(language);
		    }
      }
}
import java.util.Optional;

public class OptionalDemo {
	
	/**
	 * @author heminpanchal11@gmail.com
	 * 
	 */

	public static void main(String[] args) {
		// OptionalClass Demo
		
		//Optional class was introduced first in java 8.
		
		//Optional class is a wrapper class for null safe values.
		
		//Here is a code to define an Optinal value for type String
		
		Optional<String> optionalString= Optional.empty();
		
		//You can check weather any string is present or not in the object by following way.
		
		System.out.println("Is a String present in this optionalString object? : "+optionalString.isPresent());
		
		//Following is the output of this code
		//Is a String present in this optionalString object? : false
		
		//Following is the one of the way to assign value into above optional object.
		
		optionalString=Optional.of("Hello");
		
		System.out.println("Is a String present in this optionalString object? : "+optionalString.isPresent());
		
		//Following is the output of this code
		//Is a String present in this optionalString object? : true
		
		
		//You can obtain object form optional object following way.
		System.out.println("Content from the optional object :"+optionalString.get());
		
		//Following is the output of this code
		//Content from the optional object :Hello
		
		//there is also functional programming available for optional class.
		
		optionalString.ifPresent(x -> System.out.println(x));
		
		//Following is the output of this code
		//Hello
	}

}

//Create a function that gives a personalized greeting.
// This function takes two parameters: name and owner.

//Use conditionals to return the proper message:
//        case 	return
//name equals owner 	'Hello boss'
//otherwise 	'Hello guest'

public class b {
    static String greet(String name, String owner) {
        if (name.equals(owner)){
            return "Hello boss";
        }
        return  "Hello guest";
    }
}

package Tasks;

public class NumberExplanation {
	public static String getNumberExplanation(int number){
	 String explan="";
	 
	  switch (number){
	   		case 666: explan="devil number";
	   			break;
	   		case 42:explan="answer to the most important question";
	   			break;
	   		case 7:	explan="prime number";
	   			break;
		default:  explan=null; 
	   } 
	 
	return explan;
	}
	
	public static void main(String[] args) {
		System.out.println(getNumberExplanation(8));   // null
		// ќбъ€снени€ есть только дл€ указанных ниже чисел
		System.out.println(getNumberExplanation(666)); // "devil number"
		System.out.println(getNumberExplanation(42));  // "answer for everything"
		System.out.println(getNumberExplanation(7));   // "prime number"
	}
}

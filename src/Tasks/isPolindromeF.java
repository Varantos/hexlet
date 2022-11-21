package Tasks;
import org.apache.commons.lang3.StringUtils;

public class isPolindromeF {

	   public static boolean isPalindrome(String str){// является ли слово полиндромом - логические операции
	        boolean result;
      
	        String strP=StringUtils.reverse(str.toLowerCase()); // "амам";
 	        result=str.toLowerCase().equals(strP);
	        return result;
	    }
	   public static void main(String[] args) {
		  System.out.println( isPalindrome("шалаш") ); // true
		   System.out.println(isPalindrome("ага")); // true
		   System.out.println(isPalindrome("хекслет")); // false
		    
		   // Слова в метод могут быть переданы в любом регистре
		   System.out.println(	 isPalindrome("Ага")); // true
		 
	   }
}

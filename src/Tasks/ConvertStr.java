package Tasks;

import org.apache.commons.lang3.StringUtils;

public class ConvertStr {
	/*
	public static String convertString(String str){
         String strR="";
         if( (str.trim()=="") ) return strR;
         if ( !Character.isUpperCase(str.charAt(0)) ) 
        	 	strR=StringUtils.reverse(str);  
         		else strR=str;
          return strR;
     }
	 */
	public static String convertString(String str){
		String strR="";
		strR=str.trim()=="" ? "" : "" ;
		strR=!Character.isUpperCase(str.charAt(0)) ? StringUtils.reverse(str) : str;
		
        return strR;
        		
    }
	
	
	public static void main(String[] args) {
		 System.out.println(convertString("Hello")); // "Hello"
		 System.out.println(convertString("hello")); // "olleh"
	 
	    // Не забудьте учесть пустую строку!
		// System.out.println(convertString("")); // ""
	 }
}
	 

package Tasks;

import org.apache.commons.lang3.StringUtils;

public class ConvertStr {
	public static String convertString(String str){
		String strR="";
		if( (str.trim()=="") ) return strR;
		strR=!Character.isUpperCase(str.charAt(0)) ? StringUtils.reverse(str) : str;
        return strR;
    }

	public static void main(String[] args) {
		 System.out.println(convertString("Hello")); // "Hello"
		 System.out.println(convertString("hello")); // "olleh"
	    // �� �������� ������ ������ ������!
		 System.out.println(convertString("")); // ""
	 }
}
	 

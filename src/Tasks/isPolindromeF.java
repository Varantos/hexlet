package Tasks;
import org.apache.commons.lang3.StringUtils;

public class isPolindromeF {

	   public static boolean isPalindrome(String str){// �������� �� ����� ����������� - ���������� ��������
	        boolean result;
      
	        String strP=StringUtils.reverse(str.toLowerCase()); // "����";
 	        result=str.toLowerCase().equals(strP);
	        return result;
	    }
	   public static void main(String[] args) {
		  System.out.println( isPalindrome("�����") ); // true
		   System.out.println(isPalindrome("���")); // true
		   System.out.println(isPalindrome("�������")); // false
		    
		   // ����� � ����� ����� ���� �������� � ����� ��������
		   System.out.println(	 isPalindrome("���")); // true
		 
	   }
}

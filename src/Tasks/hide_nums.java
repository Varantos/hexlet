
package Tasks;

public class hide_nums {// спрятать цифры карты звездочками (необязательные параметры)
	
    public static String getHiddenCard(String card, int num) {
    	 int cnt=4;
	    	String 	result="*".repeat(num) + card.substring ( card.length()-cnt, card.length() );
 return result;
    }

    public static String getHiddenCard(String card) {
   	 int cnt=4;
	    	String 	result="*".repeat(cnt) + card.substring ( card.length()-cnt, card.length() );
return result;
   }
 
    
    public static void main(String[] args) {
	 String numcard="1111222233334444";
	 System.out.println(getHiddenCard(numcard , 6));
	 
	 numcard="1111222233334444";
	 System.out.println(getHiddenCard(numcard));
	 
	 //--------------------------------
	 

    }
}

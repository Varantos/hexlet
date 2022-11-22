package Tasks;

public class YearLeap {
	public static boolean isLeapYear(int year){
		return (  (year%100!=0 && year%4==0)|| year%400== 0) ;
	}
	
	public static void main(String[] args) {
		System.out.println( isLeapYear(2018) ); // true
		System.out.println(isLeapYear(2017)); // true
		System.out.println(isLeapYear(2016)); // false
		System.out.println(isLeapYear(2000)); // false
	}
	
}

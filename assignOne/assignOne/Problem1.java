package assignOne;

public class Problem1 {

	public static void main(String[] args) {
		System.out.println(stringToInt("+159263"));

	}
	
	public static int stringToInt(String str) {
		int number = 0;
		int timesTen = 1;
		int p;
		int i;
		for (p = str.length()-1; p > 1; p--) {
			timesTen *= 10;
		}
		
		for (i = 0; i < str.length(); i++) {
			if ((int) str.charAt(i) <= 57 && (int) str.charAt(i) >= 48) {
				int temp = ((int) str.charAt(i) - 48);
				
				number += temp*timesTen;
				timesTen/=10;
			}
			
		}
		if (str.charAt(0) == '-' ) {
			return -1*number;
		}
		else {
			return number;
		}
	}

}

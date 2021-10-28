package JAVA_PRACTICE;

public class CountDigit {
	public static void main(String args []) {
		int num = 1000000;
		int count = 0;
		while(num != 0) {
			num = num/10;
			count++;
		}
		
		System.out.println(count);
	}

}

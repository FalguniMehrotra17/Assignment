package JAVA_PRACTICE;

public class PrimeNumber {
	public static void main(String args[]) {
		int num =101;
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
			count+=1;
			}
		}
		if(count==2) {
			System.out.println(num+"is"+"Prime Number");
		}
		else {
			System.out.println(num + " is "+"Not a Prime Number");
		}
	}

}

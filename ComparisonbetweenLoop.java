package JAVA_PRACTICE;

public class ComparisonbetweenLoop {
	public static void main(String args[]) {
		int i=10;
		for(;i<=5;i+=1) {
			System.out.println(i);
		}
		while(i<10) {
			System.out.println(i);
			i+=1;
		}
		do {
			System.out.println(i);
			i+=1;
		}while(i<=10);
	}
}

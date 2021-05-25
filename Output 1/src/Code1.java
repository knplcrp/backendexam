import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		int x1 = 0,x2 = 1, x;
		System.out.print("Enter integer (1-20): ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>=21||n==0) {
			System.out.println("Enter integer between 1-20");
		} else {
		System.out.println("Fibonacci Sequence: ");
			for(int i=1; i<=n; i++) {
				System.out.println(x1);
				x = x1 + x2;
				x1 = x2;
				x2 = x;
			}
		}
	}
}
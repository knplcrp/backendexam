import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array[] = {8, 5, 7, 10, 15, 21};
		BubbleSort bub = new BubbleSort(array);
		System.out.println("Array: "+Arrays.toString(array));
		Median med = new Median(array);
		Largest large = new Largest(array);
	}
}

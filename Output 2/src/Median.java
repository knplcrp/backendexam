
public class Median {
	Median (int[] array) {
		int oddeven,x;
		float median;
		oddeven = array.length % 2;
		if (oddeven==1) {
			System.out.println("Median: "+array[(array.length-1)/2]);
		}
		else {
			x = (array.length)/2;
			median = (array[x]+array[x-1])*.5f;
			System.out.println("Median: "+ median);
		}
	}
}
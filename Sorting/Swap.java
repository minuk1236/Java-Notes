
public class Swap {

	public static void main(String[] args) {
		int[] arr = {3, 5};
		
		// swap 전
		System.out.println("swap 전 : " + arr[0] + " " + arr[1]);
		
		// swap
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		// swap 후
		System.out.println("swap 후 : " + arr[0] + " " + arr[1]);
	}

}

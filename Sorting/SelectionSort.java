
/*
 *  선택 정렬  O(n^2)
 *  N개의 데이터에서 맨앞의 데이터와 그 뒤에 있는 가장 작은 데이터와 바꾸며 진행
 * */
public class SelectionSort {

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			// swap
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

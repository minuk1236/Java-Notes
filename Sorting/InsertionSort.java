
/*
 *  삽입 정렬 O(n^2)
 *  데이터가 적절한 위치에 들어가기 전에 그 앞에까지의 데이터는 이미 정렬되어 있다고 가정 
 *  따라서 두번째 데이터부터 진행
 *   - 현재 데이터가 거의 정렬된 상태이면 빠르게 동작
 * */

public class InsertionSort {

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}


/*
 *  계수 정렬 O(N + K)
 *  데이터의 크기가 제한되어 있을 때에 한해서 데이터의 개수가 매우 많더라도 빠르게 동작
 *  - 동일한 값을 가지는 데이터가 여러 개 등장할 때 적합
 * */

public class CountSort {
	public static final int MAX_VALUE = 9;

	public static void main(String[] args) {
		int n = 15;
		// 모든 원소의 값이 0보다 크거나 같다고 가정
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2 };

		int[] cnt = new int[MAX_VALUE + 1];

		for (int i = 0; i < n; i++) {
			cnt[arr[i]] += 1;
		}

		for (int i = 0; i <= MAX_VALUE; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print(i + " ");
			}
		}

	}

}

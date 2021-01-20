
/*
 *  퀵 정렬 O(NlogN)
 *  피벗을 기준으로 왼쪽에는 작은 데이터 오른쪽에는 큰 데이터 나누고 
 *  나눠진 데이터를 또 재귀형태로 퀵정렬!!
 * */

public class QuickSort {
	
	public static void quickSort(int[] arr, int start, int end) {
		if(start >= end) { // 원소가 1개인 경우 종료
			return;
		}
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		while(left <= right) {
			// 피벗보다 큰 데이터를 찾을 때까지 반복 (왼쪽 인덱스 증가)
			while(left <= end && arr[left] <= arr[pivot]) {
				left++;
			}
			// 피벗보다 작은 데이터를 찾을 때까지 반복 (오른쪽 인덱스 감소)
			while(right > start && arr[right] >= arr[pivot]) {
				right--;
			}
			
			// 엇갈린 상태라면 작은 데이터와 피벗을 교체
			if(left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			}else { // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		// 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
		
	}

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

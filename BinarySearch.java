
public class BinarySearch {
	public static int[] arr = {1, 3, 5, 7, 9, 11, 14, 15, 17, 19};
	
	// 재귀 함수 이용
	public static int binarySearch1(int[] arr, int target, int start, int end) {
		if(start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
				
		if(arr[mid] == target) {      // 찾은 경우 중간점 인덱스 반환
			return mid;
		}else if(arr[mid] > target) { // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
			return binarySearch1(arr, target, start, mid - 1);
		}else {                       // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
			return binarySearch1(arr, target, mid+1, end);
		}
		
	}
	
	// 반복문 이용
	public static int binarySearch2(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				end = mid -1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int n = 10; // 원소의 개수
		int target = 7; // 찾고자 하는 값
		
		int result = binarySearch2(arr, target, 0, n-1);
		
		if(result == -1) {
			System.out.println("원소가 존재하지 않습니다.");
		}else {
			System.out.println("해당 위치 : " + (result+1));
		}
	}

}

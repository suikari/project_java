package d250102;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,10,2,7} ;
		int sum = 0;
		int max = arr[0];
		int max_index = 0;
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		for (int i = 0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
			if (arr[i] > max ) {
				max = arr[i];   // >> max 값을 첫값으로 넣어줄필요가 있다. 값이 전부 음수일 경우 이상한값 출력 
				max_index = i ; // max값의 인덱스 위치
			}
		}
		
	}

}

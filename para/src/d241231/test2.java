package d241231;

public class test2 {
   public static void main(String[] args) {
	   // 5개의 공간을 가지는 arr 배열 선언
	   int[] arr = new int[5];
	   arr[0] = 10;
	   arr[1] = 20;
	   arr[2] = 30;
	   arr[3] = 40;
	   arr[4] = 50;
	   // arr[] = {10,20,30,40,50};
	   // int arr[] = {10,20,30,40,50};
	   
	   
	   //for (int i=0;i>arr.length;i++) {
	   for (int i=arr.length-1;i>-1;i--) {

		   System.out.println(arr[i]);
	   }
	   
	   //System.out.println(arr[1]);
   }
}

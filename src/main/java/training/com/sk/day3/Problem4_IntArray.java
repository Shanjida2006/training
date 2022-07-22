package training.com.sk.day3;

public class Problem4_IntArray {

	public static void main(String[] args) {
		int arr[]={12,43,57,66,69,84,56,9,20,12};
		int odd_Sum=0,even_Sum=0;
		for(int i=0; i<10; i++){
			if(arr[i]%2==0){
				even_Sum=even_Sum+arr[i];
			}
			else{
				odd_Sum=odd_Sum+arr[i];
			}
		}
		System.out.println("\nSum of even numbers: "+even_Sum);
		System.out.println("Sum of odd numbers: "+odd_Sum);
		

	}

}

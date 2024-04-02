package assignment1;

public class Question8 {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 10 };
		int max = arr[0];
		int sum = 0;
		float avg;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Mximun element is:" + max);
		System.out.println("Sum is:" + sum);
		avg = sum / arr.length;
		System.out.println("Average value of the array elements is : " + avg);
	}

}

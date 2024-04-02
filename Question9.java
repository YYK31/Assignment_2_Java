package assignment1;

public class Question9 {
	public static void main(String[] args) {
		int start = 0, end = 8, temp, i;
		int arr[] = { 1, 2, 3, 4, 5, 6, 9, 8, 3 };

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		System.out.println("Reverse Array...............");
		for (i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

	}
}

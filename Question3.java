package assignment1;

public class Question3 {
	public static void main(String[] args) {
		int space = 5;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");

			}
			space--;
			System.out.println();
		}
	}
}

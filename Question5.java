package assignment1;

public class Question5 {
	public static void main(String[] args) {
		int row=3,col=5;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==2||j==0||j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}

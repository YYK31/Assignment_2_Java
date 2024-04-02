package assignment1;

public class Question4 {
	public static void main(String[] args) {
        int row=5,star=5,space=0;
        for(int i=0;i<=row;i++) {
        	for(int j=0;j<space;j++) {
        		System.out.print(" ");
        		
        	}
        	for(int k=0;k<star;k++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        	space++;
        	star--;
        }

	}
}

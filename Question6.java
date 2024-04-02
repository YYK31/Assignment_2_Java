package assignment1;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   int row=5,star=5,star1=5;
			   for(int i=0;i<=10;i++) {
				   for(int j=0;j<star;j++) {
					   if(i==5||j==star||j==star1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
				   }System.out.println("");
				   star--;
				   star1++;
			   }

			}
	  }

}

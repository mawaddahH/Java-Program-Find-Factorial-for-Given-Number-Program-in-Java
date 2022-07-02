import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner (System.in);
        System.out.print("PLEASE add the number that you want to find the factorial for it=  ");
		while(!UserInput.hasNextInt()) {
            UserInput.next();

            System.out.println("PLEASE add the number that you want to find the factorial for it=  ");
            System.err.println("You Entered INVALID input");

		}
		
		int num=UserInput.nextInt(),fact=1;

             for(int i = 1 ; i<=num; i++) {
            	 fact=fact*i;
             }
             
             System.out.println("The factorial is ="+fact);
             System.out.println("THANK YOU");

        UserInput.close();

	}

}

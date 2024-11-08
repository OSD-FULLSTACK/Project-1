package cs210;
import java.util.Scanner;
public class CS210_Lab_W03 {
	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number:");
		long testNum = sc.nextLong();
		
		long temp = testNum;
		int x = 1;
		
		if(testNum < 0) {
			System.out.println("Number has to be a positive integer");
		}
		else if(testNum < 10) {
			System.out.println("---------------");
			System.out.println(" Invalid Input");
			System.out.println("---------------");
			}
		else if (testNum > 9 && testNum<999999999){
			while(testNum != 1) {
				System.out.println("Run " + x + ": " + testNum);
				if(testNum%2 == 0) {
					testNum = testNum/2;
				}
				else if(testNum%2 != 0) {
					testNum = (testNum*3)+1;
				}
				x++;
			}
			
			System.out.println("Run " + x + ": " + testNum);
			if(testNum == 1 ) {
				System.out.println("---------------");
				System.out.println("     Valid");
				System.out.println("---------------");
			}
			else {
				System.out.println("----------------------------");
				System.out.println("          Invalid");
				System.out.println("----------------------------");
				
			}
		}
	}
}

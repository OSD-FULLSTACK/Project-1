package CS210;
import java.util.Scanner;
public class CS210_Lab_W03 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Card Number");
		
//		M10 valid and M20 invalid number = 4739692998844496
		
		String cardNum = sc.nextLine();
		
		int sum1 = 0;
		int sum2 = 0;
		int temp = 0;
		
			for(int i = cardNum.length()-2; i >= 0; i = i - 2) {
				int curNum = Integer.parseInt(cardNum.substring(i,i+1));
				temp = curNum*2;
				if(temp>9) {
					temp = temp-9;
					sum1 = sum1+temp;
				}
				else if(temp<9) {
					sum1 += temp;
				}
			}
			for(int i = cardNum.length()-1; i >= 0; i = i-2) {
				int curNum2 = Integer.parseInt(cardNum.substring(i,i+1));
					sum2 += curNum2;
//					System.out.println(curNum2);
			}
//			System.out.println(sum1);
//			System.out.println(sum2);
//			}
			
		int result = sum1 + sum2;
		System.out.println("Result for M10:");
		if(result%10 == 0) {
			System.out.println("---------------");
			System.out.println("     Valid");
			System.out.println("---------------");
		}
		else {
			System.out.println("----------------------------");
			System.out.println("          Invalid");
			System.out.println("----------------------------");
		}
		System.out.println("Result for M20:");
		if(result%20 == 0) {
			System.out.println("---------------");
			System.out.println("     Valid");
			System.out.println("---------------");
		}
		else {
			System.out.println("----------------------------");
			System.out.println("          Invalid");
			System.out.println("----------------------------");
		}
		
		System.out.println(result);
		
	}

}

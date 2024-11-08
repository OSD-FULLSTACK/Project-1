package CS210;
import java.lang.reflect.Array;
import java.util.Scanner;
public class CS210_2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number of words");
		int n = sc.nextInt();
		sc.nextLine();
		
		boolean stop = false;
		if(n>1 && n<100) {
			stop = true;
		}
		else {
			System.out.println("please enter between 1 - 100 words");
			//Hello there
		}
		String [] array = new String[n];
		
		while(stop == true) {
			System.out.println("Enter words:");
		
			for(int i = 0; i < array.length; i++) {
				array[i] = sc.nextLine();
			}
			stringSorter(n,array);
		}
	}
	public static void stringSorter(int n, String[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-1-i; j++) {
				if(array[j].length() < array[j+1].length()) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				else if(array[j].length() == array[j+1].length() && array[j].compareToIgnoreCase(array[j+1]) > 0) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(String word: array) {
			System.out.println(word);
		}
		
	}
}
import java.util.Scanner;

public class IT24102678LAB6Q2b{

	public static void main (String[]args){

		Scanner scanner=new Scanner(System.in);
		int[]numbers=new int[10];
		
		System.out.println("Please enter  10 numbers ");
		int i=0;
		while(i<10){
		i++;
		System.out.print(" Enter number "+i+" : ");
		
		numbers[i-1]=scanner.nextInt();
		}

		i=0;

		System.out.println("The numbers you enterd are");
		while(i<10){

		System.out.print(numbers[i]+" ");

		i++;

		}
	}
}

		
		
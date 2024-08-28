import java.util.Scanner;
public class IT24102678Lab6Q1{
	public static void main (String[]args){
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Enter a number");
		double number=scanner.nextDouble();

		double s=Math.pow(number,2);
		double sr=Math.sqrt(number);

		String a="The square root of";

		System.out.println(" The square of number "+ number +" is:"+s);
		System.out.println(a+number+"is:"+sr);

	}
}
import java.util.Scanner;
import java.io.IOException;

class Fact
{
	public static void main(String args[])throws IOException
	{
	    int i ; 
	    long fact = 1;
	    System.out.println("Enter a number:");

	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    for(i=1 ; i <= num ; i++)
	    {
		fact = fact * i;
	    }
	    System.out.println("Factorial="+fact);
	}
} 


import java.util.Scanner;
import java.io.IOException;
class PrimeNo
{
	public static void main(String args[])throws IOException
	{
            int count =0;
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            System.out.println("Enter a number:");
	    
		if(num % 2 == 0)
                {
                count++;
                } 
            
            if(count == 2)
            {
            System.out.println("number is prime number."+num);
            } 
            else
            {
	    System.out.println("number is not prime."+num);
	    } 
	}
}
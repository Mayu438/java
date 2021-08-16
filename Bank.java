import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.Console;
class Bank
{
   public float balance;
 public void withDrawl(Bank B)
 {
  int withdrawl;
  System.out.println("Please Enter Amount:-");
  Scanner S=new Scanner(System.in);
  withdrawl=S.nextInt();
  if(withdrawl>B.balance || withdrawl<=0)
   System.out.println("Invalid Balance Entered");
  else
  {
   B.balance=B.balance-withdrawl;
   System.out.println("Withdrawl Succesful!!\nAcount Balance:-"+B.balance);
  }
 }
	
 public void deposite(Bank B)
 {
  int deposite;
  System.out.println("Please Enter Amount:-");
  Scanner S=new Scanner(System.in);
  deposite=S.nextInt();
   B.balance=B.balance+deposite;
   System.out.println("Deposite Succesful!!\nAcount Balance:-"+B.balance);
 } 
	
 public void intrest(Bank B)
 {
  int month;
  float intrest;
  System.out.println("Please Enter Months:-");
  Scanner S=new Scanner(System.in);
  month=S.nextInt();
  intrest = (((B.balance/100)*6)/12)*month;
  B.balance=B.balance+intrest;
  System.out.println("Intrest Calculated Succesful!!\nIntrest:-"+intrest);
  System.out.println("Account Balance:-"+B.balance);
 }
	
 public static void main(String args[])throws IOException
 {
  
  int choice;
  Bank B=new Bank();
  System.out.println("Please Enter Name:-");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String Name=br.readLine();

  Console C=System.console();
  System.out.println("Please Enter Password:-");
  char[] a=C.readPassword();
  
  System.out.println("Please Enter Balance:-");
  Scanner S=new Scanner(System.in);
  B.balance=S.nextInt();

  do{
  System.out.println("\nPlease Enter Choice:-");
  System.out.println("1.BankBalance\n2.Withdrawl\n3.Deposite\n4.Intrest\n0.Exit");
        choice=S.nextInt();
  switch(choice)
  {
   case 1:System.out.println(B.balance);
    break;
   case 2:B.withDrawl(B);
    break;
   case 3:B.deposite(B);
    break;
   case 4:B.intrest(B);
    break;
  }
  }while(choice!=0);
 }
}
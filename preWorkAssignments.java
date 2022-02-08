package preWorkAssignments;

import java.util.Scanner;
public class preWorkAssignments {
	
	public  void checkPalindrome(int num)
	{   int b,c=0;
		int a=num;
		while(a>0) {
			b=a%10;
			c=c*10+b;
			a=a/10;
		}
		if(c==num)
			System.out.println("Palindrome number");
			
		else 
			System.out.println("Not a Palindrome number");
	}
	public void printPattern(int num)
	{   
		int r,c;
		for(r=num;r>0;r--)
		{
	    for (c=0;c<r;c++)
	    {  
	    	System.out.print(" * ");
	    }
	        System.out.println();
		}
		
	}
	public void checkPrimeNumber(int num)
	{   
		int cnt=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				cnt++;
		}
		if(cnt==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
		
	}
	public void printFibonacciSeries(int num)
	{   
		int a=0,b=1,c=0;
		System.out.print(a+ " , " +b);
		for(int i=2;i<num;i++)
		{
			c=a+b;
			System.out.print( " , "+c);
			a=b;
			b=c;
		}
	}
	public static void main (String[] args) 
	{ 
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		preWorkAssignments obj = new preWorkAssignments();

          int choice;
          do {
   
        	  System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

        	  + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

        	  + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
        	  
        	  choice = sc.nextInt();
        	
        	  switch (choice) { 
        	  
        	  case 0:
        		  choice=0;
        		  break;
        		  
        	  case 1: 

        		  
        		  obj.checkPalindrome(num);
        		  
        		  break;        		   

        	  case 2:        

        		  obj.printPattern(num);
       		  
        		  break;

        	  case 3: 

        		  obj.checkPrimeNumber(num);

        		  break;
        		   
        	  case 4: 
       		   
        		  obj.printFibonacciSeries(num);       		  

        		  break;

        		   

        	  default:

        		  System.out.println("Invalid choice. Enter a valid no.\n");
        			  
        	  }
	} while (choice != 0);

          System.out.println("Exited Successfully!!!");

          sc.close();
	}
	

}

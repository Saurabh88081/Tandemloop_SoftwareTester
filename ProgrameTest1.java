import java.util.Scanner;
class ProgrameTest1
{
	public static void main(String[] args) 
	{    char operation;
		double a,b,result;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an operator: +, -, *, or /");
		operation=s.next().charAt(0);
        System.out.println("Enter the First Number");
		a=s.nextDouble();
		System.out.println("Enter The Second Number");
		b=s.nextDouble();
		switch (operation){
			case '+':
				result = a+b;
			    System.out.println(result);
				break;
			case '-':
                result=a-b;
			    System.out.println(result);
				break;
		    case '*':
				result=a*b;
			    System.out.println(result);
				break;
            case '/':
				result=a/b;
			    System.out.println(result);
				break;
	}
}
}

import java.util.Scanner;
class ProgrameTest2
 {
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the value of n");                            
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			int k=1;
			for (int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				//System.out.println();
				k=k+2;
			}

			System.out.println(); 
		}

		
	}
}


import java.util.Scanner;
class ProgrameTest3
 {
	public static void main(String[] args) 
	{
		int k;
		System.out.println("Enter the value of n");                            
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=1;i<=n;i++)
		{   int l=1;
			if (i%2!=0)
			{
				k=i;
			}
			else
				k=i+1;
			for (int j=1;j<=k;j++)
			{  
				System.out.print(l+" ");
				l=l+2;
			}	
			System.out.println(); 
		}
	}
}


import java.util.Scanner;
class ProgrameTest4 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		int a[]=new int[11];
		System.out.println("enter the elements");
		for(int i=0;i<=10;i++)
		{
			a[i]=ob.nextInt();
		}
        System.out.println("answer is ......");
		int res[]=new int[9];
		int k=0;
		for(int i=1;i<=9;i++)
		{
			int count=0;
			for(int j=0;j<=10;j++)
			{
				if (a[j]%i==0)
				{
					count++;
				}
			}
			res[k]=count;
			k++;
			}
			for(int i=0; i<=res.length-1;i++)
			{
				System.out.println("{"+(i+1)+":"+res[i]+"}");
	        }
}
}



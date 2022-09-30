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

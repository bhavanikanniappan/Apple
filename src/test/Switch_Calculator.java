package test;

import java.util.Scanner;

public class Switch_Calculator {

	public static void main(String[] args) {
		
	int num1 , num2 ;
	
	System.out.println( "CALCULATOR FOR ADD ,SUB ,MUL ,DIV ");
	System.out.println("-----------------------------------");
	System.out.println();
	
System.out.println(" Enter the option number for calculation eg: 1. add--> Enter 1 " );
System.out.println();

System.out.println( " Options ARE: ");

System.out.println(" 1. For Addition . ENTER 1");
System.out.println(" 2. For Substraction . ENTER 2");	
System.out.println(" 3. For Multiplication . ENTER 3");
System.out.println(" 4. For Division . ENTER 4");
	
int  Sum , Diff, Mul ,Div ;

int Option = 0;

Scanner sc = new Scanner(System.in);
Option = sc.nextInt();


System.out.println(" Enter the first number : ");
Scanner sc1 = new Scanner(System.in);
num1 = sc1.nextInt();

System.out.println(" Enter the first number : ");
Scanner sc2 = new Scanner(System.in);
num2 = sc2.nextInt();

switch(Option)
{

		case(1):
			
			Sum = num1+num2;
			System.out.println( " Addition of two numbers is : " + Sum );
			System.out.println("_______________________________________");
	break;
	
      case(2):
			
    	  Diff = num1-num2;
			System.out.println( " Difference of two numbers is : " + Diff );
			System.out.println("_______________________________________");
	break;
	
      case(3):
					
			Mul = num1*num2;
			System.out.println( " Mulitplication of  two numbers is : " + Mul );
			System.out.println("_______________________________________");
	break;
	
      case(4):
			
			Div = num1/num2;
			System.out.println( " Division of  two numbers is : " + Div );
			System.out.println("_______________________________________");
	break;
	
      default:
		System.out.println(" Invalid Number");
	break;
	
	}
	}
}

package test;

import java.util.Scanner;

public class Splitstringandaddnumbers {

	public static void main(String[] args) {
		String usertxt,usertxt1;
		int stringlength;
		int i;
		int countvowel=0,countnumber=0,countspace=0,countconstant=0;
		
		System.out.println(" Enter the string to count vowels and constant");
		Scanner string = new Scanner(System.in);
        usertxt = string.nextLine();
        usertxt1= usertxt.toLowerCase();       
        stringlength = usertxt.length();
        char a[]= usertxt1.toCharArray();
        for(i=0;i<stringlength;i++)
        {
    	if(a[i]=='a' || a[i]=='e' ||a[i]=='i' ||a[i]=='o'||a[ i]=='u')
    	{
    	System.out.println(a[ i] + " : is a vowel");
    	countvowel++;
       	}
    	else if (a[i]=='0' ||a[i]=='1' ||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9')
    	{
    	System.out.println(a[i] + " : is a  Number");
    	countnumber++;
    	}
    	else if (a[i]== ' ')
    	{
    	System.out.println(a[i] + " : is a  space");
        countspace++;
       	}
    	else
    	{
    	System.out.println(a[i] + " : is a constant");
    	countconstant++;
       	}
       
        }
    	
        System.out.println("_________________________________");
        System.out.println("The entered string is :" + usertxt);
        System.out.println("Vowels: " + countvowel);
        System.out.println("Constant: " + countconstant);
        System.out.println("space: " + countspace);
        System.out.println("number: " + countnumber);
        System.out.println("_________________________________");    
	}
        }       
        
        
        
        
        
        
        
        
        
        
     
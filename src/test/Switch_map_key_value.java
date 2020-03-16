package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class Switch_map_key_value {

public static void main(String[] args) {


int key=0;


Map <Integer , String > id = new HashMap< Integer,String>();

id.put(1001,"hello");
id.put(1002,"Welcome");
id.put(1003,"next");
id.put(1004,"ok");
id.put(1005,"exit");

System.out.println(" Enter the  Key Value : 1001 or 1002 or 1003 or 1004 or 1005  ");

Scanner sc = new Scanner(System.in);
key = sc.nextInt();


switch(key)
{
case(1001):
	System.out.println("Key is : 1001");
	System.out.println("key value is :" + id.get(1001));
break;

case(1002):
	System.out.println("Hello");
	System.out.println("Key is : 1002");
	System.out.println("key value is :" + id.get(1002));
break;

case(1003):

System.out.println("Key is : 1003");
System.out.println("key value is :" + id.get(1003));
break;

case(1004):
	System.out.println("Key is : 1004");
	System.out.println("key value is :" + id.get(1004));
break;

case(1005):
	System.out.println("Key is : 1005");
	System.out.println("key value is :" + id.get(1005));
break;

default:
System.out.println("invalid values");	
break;

}
}
}



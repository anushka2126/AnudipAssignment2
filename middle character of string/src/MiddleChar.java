import java.util.Scanner;

//this is a program to find middle character of a string
public class MiddleChar {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);//create a scanner class object
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine();//declare and initialize a string
		
		System.out.print("The middle character in the string is:" + middle(str)+"\n");
		//print the middle character in a string
     }
     public static String middle(String str)//middle method to check index & length of a character in a string
     {
    	 int index;
    	 int length;
    	 if(str.length()%2 == 0)
    	 {
    		 index=str.length() / 2 - 1;
    		 length=2;
    	  }
    	 else
    	 {
    		 index=str.length() / 2;
    		 length=1;
    	 }
    	 return str.substring(index,index + length);
     }

	}


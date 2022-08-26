import java.util.Scanner;
//this is a program to count all words of a string
public class CountWords {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);// create a scanner class object
		
		System.out.println("Enter the String");
		String str=s.nextLine();// declare and initialize a string
		
		System.out.print("Number of words in this string are:" + count_Words(str)+"\n");
                             
	}
	public static int count_Words(String str)//count method to check how many words in a string
	{
		int count=0;
		if (!(" ".equals(str.substring(0,1))) || !(" ".equals(str.substring(str.length()-1))))
			//check if char[i] is character or word
		{
				for(int i=0;i<str.length();i++)//for loop 
			{
				if (str.charAt(i)==' ')
				{
					count++;
					
				}
			}
			count=count+1;
		}
		return count;
	}


	}



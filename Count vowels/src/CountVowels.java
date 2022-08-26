import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);//create a scanner class object
		
		System.out.println("Enter the string");
		
		String str=sc.nextLine();//declare and initialize a string
		
	    System.out.print("Number of vowels in the string:"+count_Vowels(str)+" \n");
		//print total number of vowels
		}
    public static  int count_Vowels(String str)//count_Vowels method check how many vowels in a string
    {
    	int count=0;
    	for(int i=0;i<str.length();i++)//for loop 
    	{
    		//check if char[i] is vowel
    		if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| 
    				str.charAt(i)=='o'|| str.charAt(i)=='u')
            {
    			count++;//count increment if there is vowel in 
         }
    }
    	return count;
   }
 

	}



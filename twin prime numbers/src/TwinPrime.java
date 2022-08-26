
public class TwinPrime {
	
	//program to find twin prime number less than 100

	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) //for loop to access twin prime number
		   {

		       if (is_Prime(i) && is_Prime(i + 2)) 
		       {
		                System.out.printf("(%d, %d)\n", i, i + 2);
		                
		            }
		        }
		    }
	////boolean method to check number is prime or not
		    public static boolean is_Prime(long n)
		    {
                if (n < 2) return false;

	        for (int i = 2; i <= n / 2; i++) 
	        {

	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	
	}



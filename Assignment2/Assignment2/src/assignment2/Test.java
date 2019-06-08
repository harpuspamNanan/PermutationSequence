import java.util.*;

public class Test {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		ArrayList<String> takeInput1 = new ArrayList<>();
		ArrayList<String> takeInput2 = new ArrayList<>();
		

		String str1, str2;
		char ch1, ch2;
		int length1, length2;
		int[] takeRandomNumbers = new int[10];
		boolean checkNumberExistsInTheArray;

		System.out.println("Enter 1st Sequence: ");
		takeInput1.add(keyboard.nextLine());
		System.out.println("Enter 2nd Sequence: ");
		takeInput2.add(keyboard.nextLine());

		//System.out.println(takeInput1); 			 So far working fine
		//System.out.println(takeInput2);

		str1 = takeInput1.toString();
		length1 = str1.length();
		str2 = takeInput2.toString();
		length2 = str2.length();

		// Calling the Lambda Function Permutation here.

		if (str1.equals(str2))
			System.out.println("Equal Sequence");
		else
		{
			int fact = 1;
			for(int i=1; i<length1-1; i++)				// Only one string's max possibilities needed as, if the length is different, they'll automatically not match
			{
				fact *= i;
			}
			// System.out.println("Factorial: "+fact);        Factorial working fine
			
			/*Random randomNumber = new Random();
			
			int temp=0; 
			
			
				for(int j = 0; j<takeRandomNumbers.length; j++)
				{
					int num = randomNumber.nextInt(length1);
					
					if (takeRandomNumbers[j] == num)
						checkNumberExistsInTheArray = false;
					else
						takeRandomNumbers[temp] = num;				
				}			
			
			
			for(int i =0; i<takeRandomNumbers.length; i++)
			{
				System.out.println(takeRandomNumbers[i]);
			}
				
				
				*/
		}
		
		

	}

}

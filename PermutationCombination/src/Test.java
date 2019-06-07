import java.util.*;

public class Test 
{

	public static void main(String[] args)
	{
		ArrayList<String> input1 = new ArrayList<>();
		ArrayList<String> input2 = new ArrayList<>();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter First Sequence of Letters - ");
		input1 = keyboard.next();
		System.out.println("Now, Please Enter Second Sequence - ");
		input2 = keyboard.next();
		
		// System.out.println(input1+"\n"+input2);        -- Input is Working Fine
		
		if (input1.length() != input2.length())
			System.out.println("Not same sequence");
		
		
	}

}

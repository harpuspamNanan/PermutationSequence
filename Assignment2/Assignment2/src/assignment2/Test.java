package assignment2;

import java.util.*;
public class Test 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> takeInput1 = new ArrayList<>();
		ArrayList<String> takeInput2 = new ArrayList<>();
		
		String str1, str2;
		char ch1, ch2;
		int length1, length2;
		
		System.out.println("Enter 1st Sequence: ");
		takeInput1.add(keyboard.nextLine());
		System.out.println("Enter 2nd Sequence: ");
		takeInput2.add(keyboard.nextLine());
		
		System.out.println(takeInput1);						// So far working fine
		System.out.println(takeInput2);		
		
		str1 = takeInput1.toString();		length1 = str1.length();
		str2 = takeInput2.toString();		length2 = str2.length();
		
		// Calling the Lambda Function Permutation here.
		
		Test tRun = new Test();
		tRun.Permutation(str1, 0, (length1-1));;
	}
	
	public void Permutation(String input, int startingPoint, int endingPoint)
	{
		if(startingPoint == endingPoint)
			System.out.println(input);
		else
		{
			for(int i=0; i<endingPoint;  i++)
			{
				input = makePossibleCombinations(input, startingPoint, endingPoint);
				Permutation(input, (startingPoint+1), endingPoint);
				input = makePossibleCombinations(input, startingPoint, endingPoint);
			}
		}
	}
	
	public static String makePossibleCombinations(String input, int startingPoint, int endingPoint)
	{
		char ch;
		char[] takeEachLetter = input.toCharArray();
		ch = takeEachLetter[startingPoint];
		takeEachLetter[startingPoint] = takeEachLetter[endingPoint];
		takeEachLetter[endingPoint] = ch;
		return takeEachLetter.toString();
	}

}

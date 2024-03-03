package JavaAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class Java {

	@Test
	public void P1()
	{
		String s="welcome to expleo"; // input
		String[] s1 = s.split(" ");
		for(int i=s1.length-1; i>=0; i--)
		{
			System.out.print(s1[i]+" ");
		}
	}

	@Test
	public void P2()
	{
		String str = "I am from am from Testyantra";
		String s1 = str.toLowerCase();
		String[] s2 = s1.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<s2.length; i++)
		{
			set.add(s2[i]);
		}
		for(String op:set) 
		{
			System.out.print(op+" ");
		}
	}

	@Test
	public void P3()
	{
		String string = "aabbccdd";
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		System.out.println(sb.toString()+" ");
	}

	@Test
	public void P4()
	{
		String s="today is friday"; // input
		String[] s1 = s.split(" ");
		for(int i=s1.length-1; i>=0; i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
	@Test
	public void P41()
	{
		int[] s= {1,2,3,4,5,6};
		int m=s.length/2;
		for(int i=0;i<s.length;i++)
		{
			if(i<m)
				{
				System.out.print(s[i]);
				}
			else
			{
				for(int j=s.length-1;j>=s.length/2;j--)//6>3 5>3 4>3 3>3
				{
					System.out.print(s[j]);
					
				}
			}
		}
		
	}
	@Test
	public void P5()
	{
		String[] originalArray = {"cat", "dog", "ant", "cow"};
		String[] newArray = new String[originalArray.length + 1]; 
		String insertString = "deer"; 
		int middleIndex = originalArray.length / 2;
		for (int i = 0; i < middleIndex; i++) {
			newArray[i] = originalArray[i];
		}
		newArray[middleIndex] = insertString;
		for (int i = middleIndex + 1; i < newArray.length; i++) {
			newArray[i] = originalArray[i - 1];
		}
		for (String element : newArray) {
			System.out.println(element);
		}
	}
	@Test
	public void insertMiddle()
	{
		String[] s = {"cat", "dog", "ant", "cow"};
		int middle=s.length/2;
		ArrayList<String> ar=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{
			ar.add(s[i]);
		}
		ar.add(middle, "king");
		System.out.println(ar);
		
	}

	@Test
	public void P6()
	{
		String s="Bangluru";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

	@Test
	public void P7()
	{
		String str = "aaabbcdddf";
		String s1=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(op==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.print(op+""+count+"");
		}
	}
	@Test
	public void P71()
	{
		String s="aabcbbdeaa";
		for(int i=0;i<s.length()-1;i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(i+1)+" ");// 0 1 ..1 2..2 3..2 2..4 5 ..5 6..7 8
		}
	}
	@Test
	public void P72()
	{
		String s="aabbaa";
		for(int i=0;i<s.length()-1;i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(i+1)+" ");// 0 1 ..1 2..2 3..2 2..4 5 ..5 6..7 8
		}
	}
	@Test
	public void P8()
	{
		int [] a= {7,-3,0,2,1,-9} ;
		int max=a[0];     //assume first array element as maximum
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("The first maximum number in an array "+max);
	}

	@Test
	public void P9()
	{
		int [] a= {5,3,4,10,1};
		int c=a.length;
		for(int i=0; i<c; i++)
		{
			for(int j=i+1; j<c; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int mul=1;
		for(int i=0; i<3; i++)
		{
			mul=mul*a[i];
		}
		System.out.println("Product of max 3 element:"+mul);
	}

	@Test
	public void P10()
	{
		String s="i am selenium";
		String s1 = s.replace(" ", "");
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
		   rev+=s1.charAt(i);
		}
		for(int k=0;k<rev.length();k++)
		{
			if(k==0||k==2)
			{
				System.out.print(rev.charAt(k)+" ");
			}
			else
			{
				System.out.print(rev.charAt(k));
			}
		}
	}
	@Test
	public void P100()
	{
//		String s="charan";
//		char[] ch=new char[];
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)!=' ')
//			{
//				dup+=s.charAt(i);
//				System.out.print(Arrays.sort(s.charAt(i)));
//				s=s.replace(s.charAt(i),' ');
//			}
//		}
	}
	@Test
	public void P11()
	{
		int [] array= {1,3,4,2,5};
		try{
			System.out.println(array[7]);
		}
		catch (Exception e) {

		}
		finally {
			// even though if we not addressed exception in catch block 
			//finally block will execute
			System.out.println("---exception handaled----");
		}
	}

	@Test
	public void P14()
	{
		for(int i=1; i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}

	@Test
	public void P16()
	{
		int i =0;
		int num =0;
		String  primeNumbers = "";

		for (i = 1; i <= 100; i++)         
		{ 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				primeNumbers = primeNumbers + i + " ";
			}	
		}	
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

	@Test
	public void P17()
	{
		String str = "aweexxxyyyyyy";
		String s1=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(op==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.println(op+" is repeating  "+count+" times");
		}
	}
	@Test
	public void KOUSHI()
	{
		
		String[] s= {"cat","cake","can"};
		for(int i=0; i<s.length; i++)
		{
			
		}
		
		
	}
	@Test
	public void P18()
	{
		int [] array= {30,5,6,7,2,1,20,8,9};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

	@Test
	public void P19()
	{
		String str = "Malayalam";
		String s1=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(op==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.print(op+":"+count+" ");
		}
	}

	@Test
	public void P20()
	{
		int [] a= {7,-6,11,9,0,4};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0; i<3; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

	@Test
	public void P21()
	{
		String s="Testyantra";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(op==s1.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(op+" "+count+"");
		}
	}

	@Test
	public void P22()
	{
		String str = "testyantra";
		String s1=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(op==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.println(op+" is repeating  "+count+" times");
		}
	}

	@Test
	public void P23()
	{
		String s="Testyantra";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(op==s1.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(op+" "+count+"");
		}
	}

	@Test
	public void P29()
	{
		String s="aabbaa";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			System.out.print(op+" ");		
		}
	}
	@Test
	public void P299()
	{
		String s="aabbaa";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {

         for(int i=0;i<s.length();i++)
         {
        	 if(op==s1.charAt(i))
        	 {
        		 System.out.print(op+""+s1.charAt(i)+" ");
        		 break;  
        	 }
         }
		}
	}

	@Test
	public void P30()
	{
		String s="javaprogram";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

	@Test
	public void P32()
	{
		int[] a= {10,3,2,8,4,7};
		int b=a.length;
		for(int i=0; i<b; i++)
		{
			for(int j=i+1; j<b; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0; k<b; k++)
		{
			System.out.println(a[k]+" ");
		}
	}

	@Test
	public void P33()
	{
		String input = "iam a tester";
		String result = input.replace(" ", ",");

		System.out.println("Modified String: " + result);
	}

	@Test
	public void P34()
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("TestYantra");
		l.add("In ");
		l.add("Bangalore");
		String[] stringArray = l.toArray(new String[0]);

		System.out.println("Array:");
		for (String element : stringArray) {
			System.out.print(element+" ");
		}
	}

	@Test
	public void P35()
	{
		String inputString = "my name is vishal";
		String stringWithoutSpaces = inputString.replaceAll("\\s", "");
		System.out.println("String without spaces: " + stringWithoutSpaces);
	}

	@Test
	public void P36()
	{
		String s = "my name is ok";
		String str="";
		char ch;
		for(int i=0; i<s.length(); i++)
		{
			ch=s.charAt(i);
			str=ch+str;
		}
		System.out.println(str);
	}

	@Test
	public void ProgramPrime()
	{
		int no=7;
		int count=0;
		for (int i = 1; i <=no; i++) 
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(no+" is a prime number");
		}
		else
		{
			System.out.println(no+" is not a prime number");
		}
	}

	@Test
	public void palindromeProgram()
	{
		int r,sum=0,temp;    
		int n=454;  

		temp=n;    
		while(n>0){    
			r=n%10;    
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
	}

	@Test
	public void stringPalindrome()
	{
		String string = "kunigal";    
		boolean flag = true;       
		string = string.toLowerCase();       
		for(int i = 0; i < string.length()/2; i++){    
			if(string.charAt(i) != string.charAt(string.length()-i-1)){    
				flag = false;    
				break;    
			}    
		}    
		if(flag)    
			System.out.println("Given string is palindrome");    
		else    
			System.out.println("Given string is not a palindrome");    
	}

	@Test
	public void reverseString()
	{
		String s = "i am in ooty";
		String[] s1 = s.split(" ");
		StringBuilder rev = new StringBuilder();
		for (String word : s1) 
		{
			StringBuilder reversedWord = new StringBuilder();
			for (int i = word.length() - 1; i >= 0; i--) 
			{
				reversedWord.append(word.charAt(i));
			}
			rev.append(reversedWord).append(" ");
		}
		String outputString = rev.toString().trim();
		System.out.println("Input String: " + s);
		System.out.println("Output String: " + outputString);
	}

	@Test
	public void countUalphabet()
	{
		String s = "{IMMUNUTIES";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) =='U') {
				count++;
			}
		}
		System.out.println("String: " + s);
		System.out.println("Count of '" + 'U' + "' alphabet present: " + count);
	}

	@Test
	public void printVowels()
	{
		String s = "education";
		String s1 = s.toLowerCase();
		System.out.println("String: " + s);
		System.out.print("Vowels: ");

		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				System.out.print(ch + " ");
			}
		}
	}

	@Test
	public void pattern()
	{
		int n = 5; 

		for (int i = 1; i <= n; i++) {
			for (char ch = 'A'; ch <= 'A' + i - 1; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println(); 
		}
	}

	@Test
	public void occuranceOfcharacter()
	{
		String str = "practicejava";
		String s1=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(op==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.println(op+" is repeating  "+count+" times");
		}
	}

	@Test
	public void basedOnAsciiGreatestCharacter()
	{
		String inputString = "AfgaDFkGd";
		int[] charCount = new int[128]; 
		for (char c : inputString.toCharArray()) {
			charCount[c]++;
		}
		char maxAsciiChar = 0;
		int maxCount = 0;
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > maxCount) {
				maxCount = charCount[i];
				maxAsciiChar = (char) i;
			}
		}
		System.out.println("Input String: " + inputString);
		System.out.println("Character with greatest ASCII value: " + maxAsciiChar);
		System.out.println("Occurrences of the character: " + maxCount);
	}

	@Test
	public void missingElementsInArray()
	{
		int[] arr = {1, 2, 4, 6, 7, 9};
		int n = 10; 
		Arrays.sort(arr);
		int current = 1; 
		System.out.print("Missing elements: ");
		for (int num : arr) {
			while (current < num) {
				System.out.print(current + " ");
				current++;
			}
			current++; 
		}
		while (current <= n) {
			System.out.print(current + " ");
			current++;
		}
		System.out.println(); 
	}

	@Test
	public void getFrequencyOfOddEvenNumbersInGivenMatrix()
	{
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int oddCount = 0;
		int evenCount = 0;
		for (int[] row : matrix) {
			for (int num : row) {
				if (num % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println("Matrix:");
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num+" " );
			}
			System.out.println();
		}
		System.out.println("Frequency of even numbers: " + evenCount);
		System.out.println("Frequency of odd numbers: " + oddCount);
	}

	@Test
	public void occurrenceOfString()
	{
		String inputString = "aabbcettrrraaee";
		StringBuilder result = new StringBuilder();
		char currentChar = inputString.charAt(0);
		int count = 1;
		for (int i = 1; i < inputString.length(); i++) {
			char nextChar = inputString.charAt(i);

			if (nextChar == currentChar) {
				count++;
			} else {
				result.append(currentChar);
				result.append(count);
				currentChar = nextChar;
				count = 1;
			}
		}
		result.append(currentChar);
		result.append(count);
		System.out.println("Input String: " + inputString);
		System.out.println("Output: " + result.toString());
	}

	@Test
	public void printOutput()
	{
		String inputString = "I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
		int product = 1;
		StringBuilder currentNumber = new StringBuilder();
		for (char ch : inputString.toCharArray()) {
			if (Character.isDigit(ch)) {
				currentNumber.append(ch);
			} else {
				if (currentNumber.length() > 0) {
					int number = Integer.parseInt(currentNumber.toString());
					product *= number;
					currentNumber.setLength(0); 
				}
			}
		}
		if (currentNumber.length() > 0) {
			int number = Integer.parseInt(currentNumber.toString());
			product *= number;
		}
		System.out.println("Input String: " + inputString);
		System.out.println("Output: " + product);
	}
	@Test
	public void printOutputt()
	{
		String s = "I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
      String s1=s.replace(""," ");
      int pr=1;
		for(int i=0;i<s1.length();i++)
           {    	
        		if(Character.isDigit(s1.charAt(i)))
        		{
        			
        		   String s2=String.valueOf(s1.charAt(i));
        		   int a=Integer.parseInt(s2);
        		   pr*=a;
        		}	
        	}
        	System.out.println(pr);
        	

	}

	@Test
	public void reverseAlteranativeWords()
	{
		String s = "this is Java programming questions";
		String[] s1 = s.split(" ");
		String s2=s1[0];
		s1[0]=s1[2];
		s1[2]=s1[4];
		s1[4]=s2;
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
	}

	@Test
	public void reverseAlternateWords2()
	{
		String s = "I love programming";
		String[] s1 = s.split(" ");
		StringBuilder rev = new StringBuilder();
		for (String word : s1) 
		{
			StringBuilder reversedWord = new StringBuilder();
			for (int i = word.length() - 1; i >= 0; i--) 
			{
				reversedWord.append(word.charAt(i));
			}
			rev.append(reversedWord).append(" ");
		}
		String outputString = rev.toString().trim();
		System.out.println("Input String: " + s);
		System.out.println("Output String: " + outputString);
	}

	@Test
	public void printDuplicateValues()
	{
		String[] dropdown = {"Rishabh", "Rohan", "Rishabh", "Neha", "Venketesh"};
		int count = 0;
		System.out.print("Duplicate Values: ");
		for (int i = 0; i < dropdown.length - 1; i++) {
			for (int j = i + 1; j < dropdown.length; j++) {
				if (dropdown[i].equalsIgnoreCase(dropdown[j])) {
					System.out.print(dropdown[i] + " ");
					count++;
					break; 
				}
			}
		}
		System.out.println("\nCount of Duplicate Values: " + count);
	}

	@Test
	public void outputFormat()
	{
		int[] arr = {3, 4, 5, 6};
		int target = 7;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("Indices: " + i + ", " + j);
					return; 
				}
			}
		}
		System.out.println("No such pair found.");
	}

	@Test
	public void outputFormat2()
	{
		int[] a = {7, 2, 12, 15};
		int target = 9;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			int complement = target - a[i];
			if (map.containsKey(complement)) {
				int j = map.get(complement);
				System.out.println("Index I: " + j + ", Index J: " + i);
				return;
			}
			map.put(a[i], i);
		}
		System.out.println("No such indices found.");
	}

	@Test
	public void repeatedDigits()
	{
		System.out.println("Repeated Digit Numbers from 0 to 100:");
		for (int i = 11; i <= 99; i++) {
			int tensDigit = i / 10;
			int unitsDigit = i % 10;
			if (tensDigit == unitsDigit) {
				System.out.print(i + " "); 
			}
		}
	}

	@Test
	public void fibonaciSeries()
	{
		int n = 20; 
		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		System.out.println("Fibonacci Series (First " + n + " numbers):");
		System.out.print(fibonacci[0] + " "); 
		System.out.print(fibonacci[1] + " ");
		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			if (fibonacci[i] % 3 == 0 && fibonacci[i] % 5 == 0) {
				System.out.print(fibonacci[i] + " ");
			}
		}
	}

	@Test
	public void printTable()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		System.out.println("Multiplication Table for " + number + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		scanner.close();
	}

	@Test
	public void armStrongNumber()
	{
		int n = 145;
		int n1 = n;
		int numberOfDigits = 0;
		int sum = 0;
		while (n1 != 0) {
			n1 /= 10;
			numberOfDigits++;
		}
		n1 = n;
		while (n1 != 0) {
			int digit = n1 % 10;
			sum += Math.pow(digit, numberOfDigits);//rem power
			n1 /= 10;
		}
		if (sum == n) {
			System.out.println(n + " is an Armstrong number.");
		} else {
			System.out.println(n + " is not an Armstrong number.");
		}
	}

	@Test
	public void Pattern2()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void sop()
	{
		System.out.println('A'+'B');
		// Output is 131 

		System.out.println(15+35+"Athar");
		// output is 50chandan

		String STR ="java234str789";
		String str = STR.replaceAll("", "[^0-9]");
		System.out.println(str);
		// Output is 234789
	}

	@Test
	public void characterOccurrence()
	{
		String s="hello";
		String s1 = s.toLowerCase();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<s1.length(); i++)
		{
			lhm.put(s1.charAt(i), i);
		}
		for(Entry<Character, Integer> m:lhm.entrySet())
		{
			int count=0;
			for(int i=0; i<s1.length(); i++) 
			{
				if(m.getKey()==s1.charAt(i))
				{
					count++;
					lhm.put(m.getKey(), count);
				}
			}
			System.out.println(m.getKey()+" is repeating  "+count+" times");
		}
	}

	@Test
	public void removeDotWithSpace()
	{
		String inputString = "update.decline.accept.include";
		char[] charArray = inputString.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '.') {
				charArray[i] = ' ';
			}
		}
		String stringWithoutDots = new String(charArray);
		System.out.println("String without dots: " + stringWithoutDots);
		int countOfC = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'c' || charArray[i] == 'C') {
				countOfC++;
			}
		}
		System.out.println("Count of 'c' in the string: " + countOfC);
		int[] charCount = new int[256]; 
		for (int i = 0; i < charArray.length; i++) {
			char currentChar = charArray[i];
			charCount[currentChar]++;
		}        
		System.out.println("Character Counts:");
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println((char) i + ": " + charCount[i]);
			}
		}
	}
	@Test
	public void removeDotWithSpacee()
	{
		String inputString = "update.decline.accept.include";
		String s="";
		for(int i=0;i<inputString.length();i++)
		{
			if(inputString.charAt(i)=='.')
			{
				s+=" ";
			}
			else
			{
				s+=inputString.charAt(i);
			}
		}
		System.out.println(s);
	}

	@Test
	public void optimizedOccurrence()
	{
		String s="aaabbbccceeegggfff";
		String s1 = s.toLowerCase();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<s1.length(); i++)
		{
			lhm.put(s1.charAt(i), i);
		}
		for(Entry<Character, Integer> m:lhm.entrySet())
		{
			int count=0;
			for(int i=0; i<s1.length(); i++) 
			{
				if(m.getKey()==s1.charAt(i))
				{
					count++;
					lhm.put(m.getKey(), count);
				}
			}
			System.out.println(m.getKey()+" is repeating  "+count+" times");
		}
	}

	@Test
	public void stringStorage()
	{
		String s1="hello";
		String s2=new String("hello");
		System.out.println(s1==s2);

	//output is false since s1 string value is store in string fool area
	//and s2 string value stored in heap memory so which are in different storage 

	}
	@Test
	public void pat()
	{
		for(int i=0;i<5;i++)
		{
			
			char c='A';
			for(int j=0;j<i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
	}

	@Test
	public void reverseCompleteStringwords()
	{
		String s = "my name is vishal";
		String[] s1 = s.split(" ");
		StringBuilder rev = new StringBuilder();
		for (String word : s1) 
		{
			StringBuilder reversedWord = new StringBuilder();
			for (int i = word.length() - 1; i >= 0; i--) 
			{
				reversedWord.append(word.charAt(i));
			}
			rev.append(reversedWord).append(" ");
		}
		String outputString = rev.toString().trim();
		System.out.println("Input String: " + s);
		System.out.println("Output String: " + outputString);
	}
	
	@Test
	public void factorial()
	{
		int n=5;
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number 5 is: "+fact);
	}

	@Test
	public void swapWithoutThird()
	{
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value a is--->"+a+"  value b is -->"+b);
	}

	@Test
	public void outputFormat3()
	{
		List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        List<Integer> outputList = new ArrayList<Integer>();
        for (int i = 0; i < inputList.size(); i++) {
            int current = inputList.get(i);
            if (i > 0) {
                current += inputList.get(i - 1);
            }
            if (i < inputList.size() - 1) {
                current += inputList.get(i + 1);
            }
            outputList.add(current);
        }
        System.out.println("Input List: " + inputList);
        System.out.println("Output List: " + outputList);	
	}

	@Test
	public void anagram()
	{
		String str1 = "tab";
        String str2 = "bat";
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();
        if (str1.length() == str2.length()) {
        	
        	char[] ch1=str1.toCharArray();
        	char[] ch2=str2.toCharArray();
        	
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	
        	boolean Condition = Arrays.equals(ch1,ch2);
        	if(Condition==true)
        	{
        		System.out.println("its a anagram   " +ch1+"     "+ch2);
        	}
        	else
        	{
        		System.out.println("its a not anagram "+ch1+"   "+ch2);
        	}
        
        }
           
        else
        {
            System.out.println("The two strings are not anagrams.");
        }
	}

	@Test
	public void pattern3()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	@Test
	public void stringPalindrome1()
	{
		String s="madam";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrom");
		}
	}
	@Test
	public void s()
	{
      String s="imhereyou";
      String s1="for";
      System.out.println(s.substring(0, 6)+s1+s.substring(6));
    }
	
	
	@Test
	public void s2() 
	{
		String s="aabcbbbdcaa";
		String[] st=new String[s.length()];
		for(int i=0;i<s.length()-1;i++)
		{
			st[i]=s.substring(i, i+1);
			st[i]=s.substring(i, i+2);
			System.out.print(st[i]+" ");
		}
	}
	@Test
	public void s3() 
	{
		int[] a= {1,2,3};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+2+" ");
		}
		
	}
	@Test
	public void s4() 
	{
		String s="selenium";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				//System.out.print();
			}
		}
	}
}

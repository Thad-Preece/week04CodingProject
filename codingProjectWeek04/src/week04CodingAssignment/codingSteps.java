package week04CodingAssignment;

public class codingSteps {

	public static void main(String[] args) {
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//		a. Programmatically subtract the value of the first element in the array from the value in the last 
//		element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
				System.out.println("Answer one:");
				int value = ages[ages.length - 1] - ages[0];
				System.out.println(value);
				System.out.println("-------");
//		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, 
//		and have more elements).  
			int[] ages2 = new int[9];
//		i. Make sure that there are 9 elements of type int in this new array.  
				for (int i = 0; i < ages2.length; i++) { // -Here i use a traditional for loop to populate my array incrementing i by 1.
					ages2[i] = i;
					System.out.println(ages2[i]);
				}	System.out.println("------");
//		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element 
//		in the new array ages2 from the last element of ages2). 
				int value2 = ages2[ages2.length - 1] - ages2[0];
				System.out.println(value2);
				System.out.println("-------");
//		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
//				-using the ".length - 1" method for an array we can can calculate exactly how many elements the array contains regardless of size.
//		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			int sum = 0;	// -An integer to hold the sum value.
			for (int age : ages) {
				sum += age;						   // -Here an enhanced for loops is used to iterate over ages to add all the ages together within the curly braces.
			} System.out.println(sum/ages.length); // -Within the sysout i divide the sum by the length of the array to get the mean value
//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			System.out.println("Answer 2:");
//		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			int sum2 = 0;
			for (String name : names) {
				sum2 += name.length(); 					//-Here the .length() method is used for each name in the array of names to calculate the amount of 
														//characters each string contains
			}System.out.println(sum2/names.length);
			System.out.println("-------");
//		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
//		and print the result to the console.
			String str = ""; 
			for (String strConc : names) {
			str = strConc + " " + str; // -Here the block of code will add every name of names to the empty str variable accompanied by a space.
			} System.out.println(str);
			System.out.println("-------");
			System.out.println("Answer 5:");
//		3. How do you access the last element of any array?
//			-By calling the length of the array - 1 like so: names[names.length - 1];
//		4. How do you access the first element of any array?
//			-By calling the first element which starts at 0: names[0];
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and 
//		add the length of each name to the nameLengths array.
			int[] nameLengths = new int[names.length];
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] = names[i].length(); //-Here i populate the nameLengths array by equating it to the names array and using the .length() 
						System.out.println(nameLengths[i]);	// method to attain the length of each string of names at the index of i.
					} System.out.println("Answer 6:");
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print 
//		the result to the console.
					int sum3 = 0;
				for (int i = 0; i < nameLengths.length; i++) { // -Using the same logic in the above questions i calculate the sum by adding each element in 
						sum3 = sum3 + i;					   //  nameLengths to the empty value in sum3 incrementing the index by i.
				} System.out.println(sum3);
				System.out.println("Answer 7:");

// 7: 
				int n = 3;	// -Here i call on method repeatStr to concatenate  the String word "Hello" together n number of times.
				String word = "Hello";
				System.out.println(repeatStr(word, n));
				System.out.println("Answer 8:");
			
// 8:
				String firstName = "Thaddeus"; // -Here i call the concatStr method to concatenate my first and last name with a space in between.
				String lastName = "Preece";
				System.out.println(concatStr(firstName, lastName));
				System.out.println("Answer 9:");
				
// 9:
				int[] arr = {1, 5, 43, 21, 61}; // -Using a random array i created i calculate whether it's true if the sum of the elements is above 100 or not
												//  by calling on method isTrue.
				System.out.println(isTrue(arr));
				System.out.println("Answer 10:");
// 10:
				double[] arrDouble = {1, 4, 23, 32, 43, 13}; // -Another random array to calculate the average of all the elements in the array by calling on
				System.out.println(avg(arrDouble));			 //  method avg.
				System.out.println("Answer 11:");
// 11:
				double[] arr1Double = {2, 54, 32, 15, 26};   // -The avgDif method will return true if the arr1Double average is greater than that of arrayDouble.
				double[] arrayDouble = {4, 15, 25, 32, 13};
				System.out.println(avgDif(arr1Double, arrayDouble));
				System.out.println("Answer 12:");
// 12: 
				double money = 10.51;						 // -Calls the willBuyDrink method to determine if its both hot and you have over $10.50 to buy a drink.
				boolean itsHot = true;
				System.out.println(willBuyDrink(itsHot, money));
				System.out.println("Answer 13:");
// 13:			
				boolean isSummer = false;						 // -Calls the goSwimming method to determine if it is Summer and if it's the weekend.
				boolean weekend = true;							 
				System.out.println(goSwimming(isSummer, weekend));
}
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself 
//	n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String repeatStr(String word, int n) {
		String result = "";
			for (int i = 0; i < n; i++) {
				result += word;
			} return result;
	} 

//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be 
//	the first and the last name as a String separated by a space).
	public static String concatStr(String firstName, String lastName) {
		String fullName = "";
			fullName = firstName + " " + lastName;
			return fullName;
	} 
//	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isTrue(int[] arr) {
		int sumAll = 0;
		for (int i = 0; i < arr.length; i++) {
		sumAll+= arr[i];
			} if (sumAll > 100) { // -A simple if, else statement to determine the boolean of method isTrue.
				return true;
			}else {
				return false;
			}
	}
	
			
	
//	10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static int avg(double[] arrDouble) {
		int sumAll = 0;
		int mean = 0;
			for (int i = 0; i < arrDouble.length; i++) {
				sumAll+= arrDouble[i];
				mean = sumAll/arrDouble.length;
			}return mean;
	}
//	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
//	is greater than the average of the elements in the second array.
	public static boolean avgDif(double[] arr1Double, double[] arrayDouble) {
		int avg = (avg(arr1Double));		// -Here i cheat the code a bit and just send each array to the method of avg to determine the averages to then
		int avg2 = (avg(arrayDouble));		//  put them through a simple if, else statement to determine the boolean.
		if (avg > avg2) {
			return true;
		}else {
			return false;
		}
	}

//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns 
//	true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {  // -I just use the if else conditional to determine if it is indeed hot, and you are indeed 
				return true;									  //  not too broke to buy a drink.
			}else {
				return false;
			}
		}

//	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		public static boolean goSwimming(boolean isSummer, boolean offWork) {
			if (isSummer == true && offWork == true) {			 // -I created this method because I miss swimming and it's the dead of winter.
				return true;
			}else {
				return false;
			}
		}
}

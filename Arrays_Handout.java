/******************************************************************************
*******************************************************************************
*******************************************************************************

				ID INFORMATION

	Programmer			:		
	Assignment #			:		
	Assignment Name			:		
	Course # and Title		:		CISC 190 - Java
	Class Meeting Time		:		TTH 1:00 - 4:05
	Instructor			:		Professor Forman
	Hours				:		
	Difficulty			:		
	Completion Date			:		04/20/17
	File Name			:		Arrays_Handout

*******************************************************************************
*******************************************************************************

				PROGRAM DESCRIPTION
	
   

*******************************************************************************
*******************************************************************************

				CUSTOM-DEFINED METHODS
	

*******************************************************************************
*******************************************************************************
******************************************************************************/

public class Arrays_Handout
{
	public static void main(String[] args)
	{
		int[] numbers;
		//Declares a reference variable called "numbers" that points to an array of integers.
	   
		numbers = new int[3];
		//Create an array of 3 integers and assign its address to the "numbers" reference variable.
	   
		//Note that "numbers" without the [] only holds the address of the array.
		//Brackets must be used to access the values stored in the array.
		
		numbers[0] = 4;
		//The number inside the brackets is called the subscript. The value 4 was just assigned to the
		//first element of the array.
		//The first element of an array is always subscript 0.
		//The last element of an array is the array size - 1.
		
		int x = 10;
		numbers[1] = x;
		//Variables can also be assigned to array elements. The 2nd element now holds the value 10.
		
		int i = 2;
		numbers[i] = 7;
		//The subscript can also be a variable, as long as it's an int between 0 and the array size - 1.
		//The third element, numbers[2], now holds the value 7.
		
		displayIntArray(numbers);
		//Send numbers array to display method.
		
		int[] moreNumbers = {1, 2, 3, 4, 5, 6};
		//Arrays can be initialized with values. Here we created an array of ints called "moreNumbers".
		//The numbers inside the {} are the values to initialize the array way. Since we entered 6 ints,
		//the array will be given a size of 6.
		
		displayIntArray(moreNumbers);
		//Send moreNumbers array to display method.
		
		int[9] evenMoreNumbers = {1, 2, 3, 4};
		//Here we specified a size while initializing an array. The 9 inside the [] overrides the default size
		//that would be given when intializing 4 values. The first 4 elements will be what is inside the {}.
		//The last 5 elements are not intialized and will be given default values of 0.
		
		displayIntArray(evenMoreNumbers);
		//Send numbers array to display method.
		
		
		
		//Have a method to fill an array and return it to main, then pass to display method.
		
		
			   	// what yvans wants to do, the very very basics
		str[1] = "Is";
		num[0] = 100;
		num[1] = 200;
	
	   
		 String[] str = {"Java","Isn't","Awesome"};
	
		int[] num = new int[3]
        
		JOptionPane.showMessageDialog(null,
				      "The string list is " + str.length + " words long \n"    // should say 3
				     +"The integer list is " + num.length + "numbers long \n"  // should say 3
				     + num[0] + "," +num[1] + "," +num[2] +"\n"  //should say 100, 200, 0
				     + str[0] + str[1] + str[2]);  //shoud say java is awesome
		
		
		
		
		
		
		
		
		
	}

	public void displayIntArray(int[] array)
	{
		//This basic for loop steps through each element of the array, displaying the element number and value.
		//It will continue until the index is no longer < the array size, which indicates the end of the array.
		
		for(i = 0; i < array.length(); i++)
		{
			JOptionPane.showMessageDialog(null, "Element: " + i + " Value: " + array[i]);
		}
	}
	
}

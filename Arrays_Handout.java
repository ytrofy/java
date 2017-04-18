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
		
		//Have a method to fill an array and return it to main, then pass to display method.
	}
	
	public void displayIntArray(int[] array)
	{
		for(i = 0; i < array.length(); i++)
		{
			JOptionPane.showMessageDialog(null, "Element: " + i + " Value: " + array[i]);
		}
	}
}

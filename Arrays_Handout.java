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
import java.awt.*;

public class Arrays_Handout
{
   public static void main(String[] args)
   {
      //Initialize array and pass it to a method to display it.
      
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
}

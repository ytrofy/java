/****************************************************************************** 
******************************************************************************* 
******************************************************************************* 
                                                                                
                   		        ID INFORMATION                                 
                                                                                
   Programmer			                  :	    1. Jared Furlong 
                                                            2. Daimeon Rodriguez
                                                            3. Robert Cardenes
                                                            4. Yvan Hanscom-Trofy       
   Assignment                          :                    Team Project
   Assignment Name                     :                    Arrays
   Course # and Title                  :                    CISC 190 - Java
   Class Meeting Time                  :                    MW 1:00 - 4:05
   Instructor                          :                    Professor Forman
   Hours                               :                    1. 
                                                            2. 
                                                            3.
                                                            4. 
   Difficulty                          :                    1.
                                                            2.
                                                            3.
                                                            4. 
   Completion Date                     :                    4/20/2017
   File Name                           :                    Arrays_Handout             

*******************************************************************************
*******************************************************************************

                             PROGRAM DESCRIPTION                   
                              
                                                 

*******************************************************************************               
*******************************************************************************

                          CUSTOMED-DEFINED METHODS LIST 
                          
                            
*******************************************************************************
*******************************************************************************

                                    CREDITS
                                    
                                  
                                    
*******************************************************************************
******************************************************************************/
import javax.swing.*;
import java.util.*;

public class Arrays_Handout
{
	public static void main(String[] args)
	{
      Arrays_Handout object = new Arrays_Handout();
   
		basicArrays();
		
		int[] numbers;
		//Declares a reference variable called "numbers" that points to an array of integers.
	   
		numbers = new int[3];
		//Create an array of 3 integers and assign its address to the "numbers" reference variable.
	   
		//The previous 2 lines can also be executed at the same time, like below:
      //int[] numbers = new int[3];
      
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
		
		object.displayIntArray(numbers);
		//Send numbers array to display method.
		
		int[] moreNumbers = {1, 2, 3, 4, 5, 6};
		//Arrays can be initialized with values. Here we created an array of ints called "moreNumbers".
		//The numbers inside the {} are the values to initialize the array way. Since we entered 6 ints,
		//the array will be given a size of 6.
		
		object.displayIntArray(moreNumbers);
		//Send moreNumbers array to display method.
      
      int size = 5;
      int[] evenMoreNumbers = new int[size];
      evenMoreNumbers = object.returnIntArray(size);
		object.displayIntArray(evenMoreNumbers);
      //Methods can also return arrays, making them useful for returning multiple values at once.
      //Here we create a new empty array and deploy a method to fill it with values, and then display it.


		
		
		object.showArrayListsExample();
		
		

		
		
	}
   
   /*****************************************************************************/
	/*************************START CUSTOM	DEFINED METHODS************************/
	/*****************************************************************************/
    
    //*********************************************************************************************** 
    //NAME:	  basicArrays 
    //DESCRIPTION: shows the basic array structure and how to create, edit, overwrite them, and pul
    // 		   the information
    //BY: Yvan Hanscom-Trofy
    //*********************************************************************************************** 
 
   public void basicArrays()
   {
		//////////////////////////////////////////////////////////////////////////////
	
		//		LOCAL VARIABLE/OBJECT DECLARATIONS 
	
		//////////////////////////////////////////////////////////////////////////////
	   
 	int[] num = new int[3] //the 3 is the amount of variable in that array
        String[] str = {"Java","Isn't","Awesome"};     //creating an array and defining at the same time
	   //////////////////////////////////////////////////////////////////////////////////////////
	   
	        //assigning the  variables to specific places in the array
 		num[0] = 100;
 		num[1] = 200;	   
	   
        	str[1] = "Is";  //what is this doing?

         
 		JOptionPane.showMessageDialog(null,
 				      "The string list is " + str.length + " words long \n"    // should say 3
 				     +"The integer list is " + num.length + " numbers long \n"  // should say 3
 				     + num[0] + " ," +num[1] + " ," +num[2] +"\n"  //should say 100, 200, 0
 				     + str[0] +" "+ str[1] +" "+ str[2]);  //shoud say java is awesome
   }
	
	
	
	
	
	
    //*********************************************************************************************** 
    //NAME:	  displayIntArray 
    //DESCRIPTION: 
    //BY: 
    //***********************************************************************************************	
	
   public void displayIntArray(int[] array)
	{
		//This basic for loop steps through each element of the array, displaying the element number and value.
		//It will continue until the index is no longer < the array size, which indicates the end of the array.
		
		for(int i = 0; i < array.length; i++)
		{
			JOptionPane.showMessageDialog(null, "Element: " + i + " Value: " + array[i]);
		}
	}
    //*********************************************************************************************** 
    //NAME:	  returnIntArray 
    //DESCRIPTION: 
    //BY: 
    //***********************************************************************************************
	
   public int[] returnIntArray(int size)
   {
      int[] newArray = new int[size];
		//This methods creates an array of the size sent in the argument.
      
      for(int i = 0; i < size; i++)
      {
         newArray[i] = i * 2;
      }
      //The for loop goes through each element and assigns twice the element number to the value of that element.
      
      return newArray;
      //Return works just like any other variable, you just need to make sure the array type matches
      //the method declaration.
   }

    //*********************************************************************************************** 
    //NAME:	  showArrayListsExample 
    //DESCRIPTION: 
    //BY: 
    //***********************************************************************************************
	
   public void showArrayListsExample()
   {
      ArrayList<String> list = new ArrayList<String>();
      JFrame frame = new JFrame();
      frame.setSize(500,500);
      frame.setVisible(true);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //list.add(34);
      String element;
      JOptionPane.showMessageDialog(frame, "Adding as many elements as you want to the ArrayList");
      while(true)
      {
         element = JOptionPane.showInputDialog(frame, "Enter anything(Type close to stop adding elements)):");
         if (element.equalsIgnoreCase("close"))
         {
            break;
         }
         list.add(element);
      }
      JOptionPane.showMessageDialog(frame, "Displaying the values stored in the ArrayList");
      for(int x=0; x<list.size();x++)
      {
         JOptionPane.showMessageDialog(frame,"Element #"+(x+1)+": "+list.get(x));
      }
      
   }
   
   /*****************************************************************************/
	/**************************END CUSTOM DEFINED METHODS*************************/
	/*****************************************************************************/	
}

//         Everyone you will ever meet knows something you don't.
//                           -Bill Nye

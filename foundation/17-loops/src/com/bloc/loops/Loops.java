package com.bloc.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops extends Object {

	public static void main(String [] args) {
		boolean[] someBools = {true, false, true, true, false, true, false, false};
		boolean temp = false;

<<<<<<< HEAD:milestone_00_welcome_to_android_development/03_basic_java/loops/src/com/bloc/loops/Loops.java
		/********************************** Starts Here *********************************
=======
		//********** Starts Here ************************/
>>>>>>> upstream/master:foundation/17-loops/src/com/bloc/loops/Loops.java
		temp = someBools[7];
		someBools[7] = someBools[0];
		someBools[0] = temp;

		temp = someBools[6];
		someBools[6] = someBools[1];
		someBools[1] = temp;

		temp = someBools[5];
		someBools[5] = someBools[2];
		someBools[2] = temp;

		temp = someBools[4];
		someBools[4] = someBools[3];
		someBools[3] = temp;
<<<<<<< HEAD:milestone_00_welcome_to_android_development/03_basic_java/loops/src/com/bloc/loops/Loops.java
		//********************************** Ends Here ***********************************/
		

		//********************************************************************************
		// ASSIGNMENT:
		// Replace the operations above with a while loop
		//********************************************************************************
		
		/* NOTES: 
		Its a 0 base index so someBools.length = 8, in order 
		get 7 you must subtract 1 to the length or create a variable
		that holds the number 7. Simpler form would be to cut 
		in half someBool by dividing the .length by 2
		*/

		int i = 0;
		int sBoolsLength = someBools.length - 1;
		while (sBoolsLength > i) {
			temp = someBools[sBoolsLength];
			someBools[sBoolsLength] = someBools[i];
			someBools[i] = temp;
			sBoolsLength--; //decrement sBoolsLength
			i++;
		}
=======
		//********** Ends Here **************************/
		

		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Replace the operations above with a `while` loop
		/************************************************/
>>>>>>> upstream/master:foundation/17-loops/src/com/bloc/loops/Loops.java

		if (testBools(someBools)) {
			System.out.print("Your booleans are in proper order!\n");
		} else {
			System.out.print("Something in the while loop…\n");
			System.exit(0);
		}

		int[] numArray = new int[someBools.length];

<<<<<<< HEAD:milestone_00_welcome_to_android_development/03_basic_java/loops/src/com/bloc/loops/Loops.java
		/********************************** Starts Here *********************************
=======
		/************************************************
	 	 *	TIP:
	 	 *	This is known as an in-line conditional.
		 * 	Learn more here: http://www.cafeaulait.org/course/week2/43.html
		/************************************************/

		//********** Starts Here ************************/
>>>>>>> upstream/master:foundation/17-loops/src/com/bloc/loops/Loops.java
		numArray[0] = !someBools[0] ? 1 : 0;
		numArray[1] = !someBools[1] ? 1 : 0;
		numArray[2] = !someBools[2] ? 1 : 0;
		numArray[3] = !someBools[3] ? 1 : 0;
		numArray[4] = !someBools[4] ? 1 : 0;
		numArray[5] = !someBools[5] ? 1 : 0;
		numArray[6] = !someBools[6] ? 1 : 0;
<<<<<<< HEAD:milestone_00_welcome_to_android_development/03_basic_java/loops/src/com/bloc/loops/Loops.java
		numArray[7] = !someBools[7] ? 1 : 0; 
		//********************************** Ends Here ***********************************/
=======
		numArray[7] = !someBools[7] ? 1 : 0;
		//********** Ends Here **************************/
>>>>>>> upstream/master:foundation/17-loops/src/com/bloc/loops/Loops.java

		for (i = 0; i < numArray.length; i++) {
    		numArray[i] = !someBools[i] ? 1 : 0;
		}

		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Replace the operations above with a for loop
		/************************************************/

		if (testInts(numArray)) {
			System.out.print("And you nailed the number array!\n");
		} else {
			System.out.print("Issue with the numbers…\n");
		}
	}


	/************************************************
	 *	DO NOT MODIFY BELOW THIS BLOCK
	/************************************************/

	
	static final boolean testBools(boolean[] bools) {
		if (bools == null || bools.length != 8) {
			return false;
		}
		return bools[0] == false &&
			   bools[1] == false &&
			   bools[2] == true &&
			   bools[3] == false &&
			   bools[4] == true &&
			   bools[5] == true &&
			   bools[6] == false &&
			   bools[7] == true;
	}

	static final boolean testInts(int[] ints) {
		if (ints == null || ints.length != 8) {
			return false;
		}
		return ints[0] == 1 &&
			   ints[1] == 1 &&
			   ints[2] == 0 &&
			   ints[3] == 1 &&
			   ints[4] == 0 &&
			   ints[5] == 0 &&
			   ints[6] == 1 &&
			   ints[7] == 0;
	}
}

package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
<<<<<<< HEAD:milestone_01_java/02_nuance/recursion/src/com/bloc/recursion/RecursionUtils.java
    /*
     * findMaxRecursively
     * Takes a list of numbers and finds the largest among them
     * using recursive calls.
     *
     * @param numbers a list of numbers, can be odd or even numbered
     * @return the largest number in the list
     *
     * Hint: your base case may be a comparison of 2 numbers
     */
    public static final int findMaxRecursively(List<Integer> numbers) {
        /*
        System.out.print("List of Numbers: " + numbers);
        System.out.println();
        */

        //find how many numbers are in the list and get the number thats in the last index. To do this we
        //get the list size - 1 because its 0 base index
        int numInList = numbers.size() - 1;

        /*
        System.out.print("There are " + numInList + " numbers in this list.");
        System.out.println();
        */

        //if there is one number left in list
        if (numbers.size() == 1) {
            /*
            System.out.print("The is only one number in this list and this is the max number, " + numbers.get(0) );
            System.out.println();
            */

            // return the last number left
            return numbers.get(0);

        } else {
            /*
            System.out.print("Number in index " + numInList + " is " + numbers.get(numInList) );
            System.out.println();
            System.out.print("Index before " + numInList + " is index " + (numInList - 1) + ". The number in this index is " + numbers.get(numInList - 1) );
            System.out.println();
            System.out.print("Is " + numbers.get(numInList) + " < " + numbers.get(numInList - 1) );
            System.out.println();
            */

            // check is the number in index (list size) < than the number in index (list size - 1) and remove one of them
            if (numbers.get(numInList) < numbers.get(numInList - 1)) {
                /*
                System.out.print("Remove the smallest number of the two: " + numbers.get(numInList) + " is removed from the list" );
                System.out.println();
                */

                // remove number in index (list size)
                numbers.remove(numInList);
            } else {
               /*
               System.out.print("Remove the smallest number of the two: " + numbers.get(numInList - 1) + " is removed from the list" );
               System.out.println();
               */

                // otherwise remove number in index (list size - 1)
                numbers.remove(numInList - 1);
            }
            /*
            System.out.print("Try again with updated list");
            System.out.println();
            System.out.println();
            */

            //pass new updated list to the itself and lets keep trying till we are down to one number left in the list
            return findMaxRecursively(numbers);
        }

    }
=======
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
		return 0;
	}
>>>>>>> upstream/master:foundation/28-recursion/src/com/bloc/recursion/RecursionUtils.java
}
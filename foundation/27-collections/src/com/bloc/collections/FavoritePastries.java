package com.bloc.collections;

import java.util.*;

/*
 * FavoritePastries
 * 
 * This class maintains a record of Pastry objects and their
 * relation to a 1 to 5 rating scale.
 *
 * For example:
 * 5 Star Pastries: Cronut, Cherry Pie
 * 4 Star Pastries: Strudel, Apple Pie
 * 3 Star Pastries: Bear Claw
 * 2 Star Pastries: Pop-Tart
 * 1 Star Pastries: Pot Pie
 *
 * A pastry may not have duplicate entries
 */        

public class FavoritePastries {

<<<<<<< HEAD:milestone_01_java/01_polymorphism/collections/src/com/bloc/collections/FavoritePastries.java
	/*
	 * Use a HashMap to store the relationship
	 * between rating and pastry
	 */
    private HashMap<Pastry, Integer> pastryMap; 

	public FavoritePastries() {
		// WORK HERE  
		pastryMap = new HashMap<Pastry, Integer>();
=======
	/************************************************
 	 *	ASSIGNMENT:
	 *	Use a HashMap to store the relationship
	 *	between rating and pastry: HashMap<Integer, List<Pastry>>
	/************************************************/


	public FavoritePastries() {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
>>>>>>> upstream/master:foundation/27-collections/src/com/bloc/collections/FavoritePastries.java
	}

	/* 
	 * addPastry
	 *
	 * Add a Pastry to the FavoritePastries class.
	 *
	 * This method stores this Pastry and its
	 * associated rating in some sort of data structure.
	 *
	 * If this Pastry already exists in FavoritePastries,
	 * its old rating should be updated.
	 *
	 * @param pastry The Pastry to store
	 * @param rating The rating to associate with it
	 * @return nothing
	 */
	public void addPastry(Pastry pastry, int rating) {
<<<<<<< HEAD:milestone_01_java/01_polymorphism/collections/src/com/bloc/collections/FavoritePastries.java
		// WORK HERE     
		pastryMap.put(pastry, rating);
=======
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
>>>>>>> upstream/master:foundation/27-collections/src/com/bloc/collections/FavoritePastries.java
	}

	/* 
	 * removePastry
	 *
	 * Remove a Pastry from FavoritePastries
	 *
	 * This method removes any reference to this exact
	 * Pastry object and its associated rating
	 *
	 * @param pastry The Pastry to remove
	 * @return true if the Pastry was found and removed,
	 *		   false otherwise
	 */
	public boolean removePastry(Pastry pastry) {
<<<<<<< HEAD:milestone_01_java/01_polymorphism/collections/src/com/bloc/collections/FavoritePastries.java
		// WORK HERE
		if (pastryMap.containsKey(pastry)) {
						pastryMap.remove(pastry);
					return true;
				} else {
					return false;
				}
=======
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		return false;
>>>>>>> upstream/master:foundation/27-collections/src/com/bloc/collections/FavoritePastries.java
	}

	/* 
	 * getRatingForPastry
	 *
	 * Return the associated rating for a given Pastry
	 *
	 * This method will find the associated rating for
	 * this Pastry inside of FavoritePastries and return
	 * it to its caller.
	 *
	 * @param  pastry The Pastry for which a rating must
	 * 		   be recovered
	 * @return the rating associated with this Pastry or
	 *		   -1 if not found among FavoritePastries
	 */
	public int getRatingForPastry(Pastry pastry) {
<<<<<<< HEAD:milestone_01_java/01_polymorphism/collections/src/com/bloc/collections/FavoritePastries.java
		// WORK HERE
				if (pastryMap.containsKey(pastry)) {
					return pastryMap.get(pastry);
				} else {
					return -1;
				}
			}
=======
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		return -1;
	}
>>>>>>> upstream/master:foundation/27-collections/src/com/bloc/collections/FavoritePastries.java

	/* 
	 * getPastriesForRating
	 *
	 * Return a Set of all the Pastries with a given
	 * rating.
	 *
	 * This method returns a Set<Pastry> object containing
	 * references to all of the Pastries associated with
	 * a particular rating.
	 *
	 * @param  rating The rating of the Pastry objects the
	 *		   caller wishes to recover
	 * @return A Set of all the Pastry objects with a rating
	 * 		   of `rating`. Returns an empty set if none are
	 *         found
	 */
	public Collection<Pastry> getPastriesForRating(int rating) {
<<<<<<< HEAD:milestone_01_java/01_polymorphism/collections/src/com/bloc/collections/FavoritePastries.java
		// WORK HERE
		  Set<Pastry> pastries = new HashSet<Pastry>();  //create new HashSet to store filtered list               
			for (Pastry pastry : pastryMap.keySet()) { //shorthand for in loop  
				/*  what it does:
				 for (int i = 0; i < pastries.size; i++) {
					Pastry pastry = pastries[i];
				} 
				*/
					if (pastryMap.get(pastry) == rating) {
						pastries.add(pastry); //add results to new HashSet
            		}
			}  
			return pastries;
		}    
=======
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		return null;
	}

>>>>>>> upstream/master:foundation/27-collections/src/com/bloc/collections/FavoritePastries.java
}
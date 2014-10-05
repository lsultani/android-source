package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	// CONSTRUCTOR CODE GOES HERE 
	Song() {    
			/*
			this.mEnsemble = new Ensemble("The Doors"); 
			Ensemble(Artist[] artists) {  //Ensemble is an array that holds an Artist array 
			        mArtists = artists;
			    }
			Sample: Balloon redBalloon = new Balloon("red"); //create a new instance                  
			*/  
			// Ensemble e = new Ensemble(); //creates new Ensemble object
			// Artist[] x = new Artist[];  //creates new Artist array          
			//Artist[] artists = new Artist[]{"The Doors"}; //creates new array with "The Doors" as an array value 
			//however in the example above, you can't store a string in an array of artists. 
			//You can only put artist data types. Artist data type takes:  Artist(String firstName, String lastName)   
			this.mEnsemble = new Ensemble(new Artist[] {new Artist("The", " Doors")});    
			this.mTitle ="Light My Fire";
			this.mYearReleased = 1967;  
	    }

	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
     Song(Ensemble ensemble, String title) { 
        this.mEnsemble = ensemble;
        this.mTitle = title;  
		this.mYearReleased = 0;  
    }

	/*
	 * Full Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
	Song(Ensemble ensemble, String title, int yearReleased) { 
        this.mEnsemble = ensemble;
        this.mTitle = title;
		this.mYearReleased = yearReleased;  
    }
}
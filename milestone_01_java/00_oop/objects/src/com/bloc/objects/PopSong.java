package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and weeks on billboard
	 */
	// CONSTRUCTOR CODE GOES HERE
     PopSong() {                                          
			this.mEnsemble = new Ensemble(new Artist[] {new Artist("The", " Doors")});      
			this.mTitle ="Light My Fire";
			this.mYearReleased = 1967; 
			this.mWeeksOnBillboard = 3;
    }

	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
     PopSong(Ensemble ensemble, String title) { 
    	this.mEnsemble = ensemble;
    	this.mTitle = title;  
		this.mYearReleased = 0;  
	}

	/*
	 * Full Song Constructor
	 * Side-effects: Sets the weeks on billboard to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
      PopSong(Ensemble ensemble, String title, int yearReleased) { 
		this.mEnsemble = ensemble;
		this.mTitle = title;  
		this.mYearReleased = yearReleased;
		this.mWeeksOnBillboard = 0;  
	}
	/*
	 * Full PopSong Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100
	 */
	// CONSTRUCTOR CODE GOES HERE 
	PopSong(Ensemble ensemble, String title, int yearReleased, int weeksOnBillboard) { 
		this.mEnsemble = ensemble;
		this.mTitle = title;  
		this.mYearReleased = yearReleased;
		this.mWeeksOnBillboard = weeksOnBillboard;  
	}
}
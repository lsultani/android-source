package com.bloc.inherit;

// CLASS DEFINITION GOES HERE 
/* 
	Extend the Dog class. Great Danes can get rather large… 
	Let's add another size category for them: "huge"
*/ 
class GreatDane extends Dog {
    
	/*
	 * final changeSize
	 * Modify the size of the Dog by 1 move
	 * @param grow if true, gain a size, shrink otherwise
	 * @return nothing
	 */
    @Override 
  	void changeSize(boolean grow) {
		int sizeIndex = getSizeIndex();
		sizeIndex = sizeIndex + (grow ? 1 : -1);
		if (sizeIndex > 4) {
			sizeIndex = 4;
		} else if (sizeIndex < 0) {
			sizeIndex = 0;
		}
		setSize(fromSizeIndex(sizeIndex));
	}  
     
	
	/*
	 * getSizeIndex
	 * @param size the string value representing the size
	 * @return an index between 0 and 4 in the
	 * 		   array of {"tiny", "small", "average", "large", "huge"}
	 */
	@Override  
	int getSizeIndex(String size) {
		if (size == null) {
			// Return default "average" when missing size
			return 2;
		}

		if( "tiny".equals(size) ) {
			return 0;
		} else if( "small".equals(size) ) {
			return 1;
		} else if( "average".equals(size) ) {
			return 2;
		} else if( "large".equals(size) ) {
			return 3; 
		} else if( "huge".equals(size) ) {
			return 4;
		} else {
			return 2;
		}
	}

	/*
	 * fromSizeIndex
	 * @param index the index into the sizes array
	 * @return a String, one of {"tiny", "small", "average", "large", "huge"}
	 */
	@Override  
	String fromSizeIndex(int index) {
		switch(index) {
			case 0: return "tiny";
			case 1: return "small";
			case 2: return "average";
			case 3: return "large";
			case 4: 
			default: return "huge";
		}
	}
}
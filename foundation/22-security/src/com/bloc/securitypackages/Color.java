package com.bloc.securitypackages;  

<<<<<<< HEAD:milestone_01_java/00_oop/security_packages/src/com/bloc/securitypackages/Color.java
public class Color extends Object {
=======
/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

class Color extends Object {
>>>>>>> upstream/master:foundation/22-security/src/com/bloc/securitypackages/Color.java
	// Name of the color
	String mName;
	// Alpha value
	int mAlpha;
	// Red value
	int mRed;
	// Green value
	int mGreen;
	// Blue value
	int mBlue;

	public Color(int red, int green, int blue) {
		this(null, red, green, blue);
	}

	public Color(String name, int red, int green, int blue) {
		mName = name;
		mRed = red;
		mGreen = green;
		mBlue = blue;
	}
}        

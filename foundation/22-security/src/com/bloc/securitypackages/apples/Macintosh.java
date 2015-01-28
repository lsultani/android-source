package com.bloc.securitypackages.apples;
  
import com.bloc.securitypackages.colors.Red;

<<<<<<< HEAD:milestone_01_java/00_oop/security_packages/src/com/bloc/securitypackages/apples/Macintosh.java
public class Macintosh extends Apple {
=======
/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

class Macintosh extends Apple {
>>>>>>> upstream/master:foundation/22-security/src/com/bloc/securitypackages/apples/Macintosh.java

	public Macintosh() {
		super(Macintosh.class.getSimpleName(), 200, new Red(), 0.14d);
	}

	void bite() {
		setWeight(getWeight() - 0.01d);
	}

}

package com.bloc.securitypackages.apples; 

<<<<<<< HEAD:milestone_01_java/00_oop/security_packages/src/com/bloc/securitypackages/apples/Green.java
import com.bloc.securitypackages.colors.LimeGreen;
=======
/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

class Green extends Apple {
>>>>>>> upstream/master:foundation/22-security/src/com/bloc/securitypackages/apples/Green.java

public class Green extends Apple {

	public Green() {
		super(Green.class.getSimpleName(), 230, new LimeGreen(), 0.21d);
	}

	void bite() {
		setWeight(getWeight() - 0.02d);
	}

}

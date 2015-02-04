package com.bloc.threads;

import java.net.URL;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;

public class Main extends Object {

	public static void main(String [] args) {

		/************************************************
		 *	ASSIGNMENT:
		 *	Perform the following block of code on a separate
		 *	Thread, use the ImageGetter class.
		/************************************************/

<<<<<<< HEAD:milestone_01_java/02_nuance/threads/src/com/bloc/threads/Main.java
        ImageGetter thread = new ImageGetter();
        thread.start();

		// ^^^ Extract the above to ImageGetter

        File logo = new File("google_logo.png");
        boolean exists = false;
        try {
            exists = logo.exists();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

		// This shouldn't exist yet, therefore we should be able to print 
		if (exists == false) {
=======
		try {
			File existingImage = new File("google_logo.png");
			if (existingImage.exists()) {
				existingImage.delete();
			}
			URL url = new URL("https://www.google.com/images/srpr/logo11w.png");
			BufferedImage bufferedImage = ImageIO.read(url);
			File outputfile = new File("google_logo.png");
			ImageIO.write(bufferedImage, "png", outputfile);
			if ("/".equals(System.getProperties().getProperty("file.separator"))) {
				Runtime.getRuntime().exec("open google_logo.png");
			} else {
				Runtime.getRuntime().exec("google_logo.png");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		/************************************************
		 *	ASSIGNMENT:
		 *	Perform the previous block of code on a separate
		 *	Thread, use the ImageGetter class.
		/************************************************/

		File logo = new File("google_logo.png");
		boolean exists = false;
		try {
			exists = logo.exists();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		if (exists) {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/* Download that image  */");
			System.out.println("/* on a separate thread */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/\n");
		} else {
>>>>>>> upstream/master:foundation/31-threads/src/com/bloc/threads/Main.java
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/* Nice work, you pass! */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/\n");
		}
	}
}
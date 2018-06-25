/*Copyright (c) 07-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: SingletonPatternBreakUp.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapterDesign;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Singleton class
class Singleton {
	// public instance initialized when loading the class
	public static Singleton instance = new Singleton();

	private Singleton() {
		// private constructor
	}
}



public class SingletonPatternBreakUp {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton singleton1 = Singleton.instance;

		Singleton instance2 = null;
		Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			constructor.setAccessible(true);
			instance2 = (Singleton) constructor.newInstance();
			break;
		}

		System.out.println("singleton1 hashcode :" + singleton1.hashCode());
		System.out.println("singleton2 hashcode :" + instance2.hashCode());
	}

}

/*Copyright (c) 07-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: GFG.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapterDesign;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton2 implements Serializable {
	/** IF implement the cloneing object it with create similor object 
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 *           throw new CloneNotSupportedException(); }
	 */
	private static final long serialVersionUID = 1L;
	// public instance initialized when loading the class
	public static Singleton2 instance = new Singleton2();

	private Singleton2() {
		// private constructor
	}

	// implement readResolve method
	protected Object readResolve() {
		return instance;
	}
}

public class GFG {

	public static void main(String[] args) {
		try {
			Singleton2 instance1 = Singleton2.instance;
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
			Singleton2 instance2 = (Singleton2) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
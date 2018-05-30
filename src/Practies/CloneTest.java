/*Copyright (c) 30-May-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: CloneTest.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Java program to show how to override clone method for deep copying.
 * This example includes a mutable filed in class to be cloned to show how you deal with
 * practical classes which contains both immutable and mutable fields.
 *
 * @author Javin
 */
public class CloneTest {

	public static void main(String args[]) {

		Programmer javaguru = new Programmer("John", 31);
		javaguru.addCertificates("OCPJP");
		javaguru.addCertificates("OCMJD");
		javaguru.addCertificates("PMP");
		javaguru.addCertificates("CISM");

		System.out.println("Real Java Guru     : {}" + javaguru);

		Programmer clone = javaguru.clone();
		System.out.println("Clone of Java Guru : {}" + clone);
		Programmer clone1=	(Programmer) deepCopy(javaguru);
		// let's add another certification to java guru
		javaguru.addCertificates("Oracle DBA");
		System.out.println("Real Java Guru     : {}" + javaguru);
		System.out.println("Clone of Java Guru : {}" + clone);
		System.out.println("clone1 of Java Guru : {}" + clone1);
	}
	
	 private static Object deepCopy(Object object) {
		   try {
		     ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		     ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
		     outputStrm.writeObject(object);
		     ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
		     ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
		     return objInputStream.readObject();
		   }
		   catch (Exception e) {
		     e.printStackTrace();
		     return null;
		   }
		 }
}

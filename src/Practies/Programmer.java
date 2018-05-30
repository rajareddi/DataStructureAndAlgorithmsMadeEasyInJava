/*Copyright (c) 30-May-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Programmer.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Programmer implements Cloneable ,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private List certifications;

	public Programmer(String name, int age) {
		this.name = name;
		this.age = age;
		this.certifications = new ArrayList();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCertificates(String certs) {
		certifications.add(certs);
	}

	@Override
	public String toString() {
		return String.format("%s, %d, Certifications: %s", name, age, certifications.toString());
	}

	@Override
	protected Programmer clone() {
		Programmer clone = null;
		try {
			clone = (Programmer) super.clone();
			clone.certifications = new ArrayList(certifications); // deep
																	// copying

		} catch (CloneNotSupportedException cns) {
			System.out.println("Error while cloning programmer" + cns);
		}
		return clone;
	}

}

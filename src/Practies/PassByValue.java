/*Copyright (c) 26-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: PassByValue.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

//A Java program to demonstrate that simply swapping
//object references doesn't work

//A car with number and name
class Car {
	int model, no;

	// Constructor
	Car(int model, int no) {
		this.model = model;
		this.no = no;
	}

	// Utility method to print Car
	void print() {
		System.out.println("no = " + no + ", model = " + model);
	}
}

// A class that uses Car
public class PassByValue {
	// swap() doesn't swap c1 and c2
	public static void swap(Car c1, Car c2) {
		Car temp = c1;
		c1 = c2;
		c2 = temp;
	}

	// Driver method
	public static void main(String[] args) {
		Car c1 = new Car(101, 1);
		Car c2 = new Car(202, 2);
		swap(c1, c2);
		c1.print();
		c2.print();
	}
}

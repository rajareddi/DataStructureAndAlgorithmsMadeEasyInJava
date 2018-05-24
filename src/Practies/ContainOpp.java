/*Copyright (c) 05-Apr-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: ContainOpp.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package Practies;

public class ContainOpp {

	public static void main(String[] args) {

		String urlpatther = "cmdb_ci_service\\.do\\";
		String snowTableName = "cmdb_ci";

		boolean isU = snowTableName.contains(urlpatther);
		System.out.println(isU);
		ContainOpp containOpp= new ContainOpp();
		System.out.println(containOpp);
	}

	public void display(int i, String str) {
		System.out.println();
	}

	public void display(String str, int i) {
		System.out.println();
	}
}

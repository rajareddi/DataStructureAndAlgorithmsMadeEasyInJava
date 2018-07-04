package com.java9s.tutorials.designpattern.observer1;
/**
 * Design Pattern series by http://java9s.com
 * @author java9s.com
 *
 */
public class DisplayBoard implements Observer{

	@Override
	public void update(Stock stock) {
	System.out.println("DISPLAYBOARD - The Price of "+stock.getStockName()+" has changed:"+stock.getStockPrice());
	}

}

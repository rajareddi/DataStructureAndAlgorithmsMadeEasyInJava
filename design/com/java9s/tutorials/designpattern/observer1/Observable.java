package com.java9s.tutorials.designpattern.observer1;
/**
 * Design Pattern series by http://java9s.com
 * @author java9s.com
 *
 */
public interface Observable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
	public void removeObserver(Observer observer);
}

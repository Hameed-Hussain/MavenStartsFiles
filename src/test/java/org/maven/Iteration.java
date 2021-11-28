package org.maven;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Iteration {

	public static void main(String[] args) {
		 Vector<String> v = new  Vector<String>();
		 
		 v.add("H");
		 v.add("A");
		 v.add("M");
		 v.add("E");
		 v.add("E");
		 v.add("D");
	
		 
		 Enumeration<String> elements = v.elements();
		 
		 while (elements.hasMoreElements()) {
			String string = (String) elements.nextElement();
			System.out.println(string);
			
		}
	
		 Iterator<String> iterator = v.iterator();
		 
		 while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			if (string.equals("H")) {
				iterator.remove();
				System.out.println(v);
			}
		ListIterator<String> listIterator = v.listIterator();
		while (listIterator.hasNext()) {
			String string2 = (String) listIterator.next();
			System.out.println(listIterator);
		}
		
		 
		}
		 
	}
}

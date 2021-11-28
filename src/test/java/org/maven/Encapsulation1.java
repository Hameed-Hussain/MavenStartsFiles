package org.maven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Encapsulation1{

	public static void main(String[] args) {
		
		Encapsulation s = new Encapsulation();
		s.setA(29);
		s.setB("Partha Sarathy");
		s.setC(9710821771l);
		
		Encapsulation s1 = new Encapsulation();
		s1.setA(25);
		s1.setB("Hameed");
		s1.setC(9677160681l);
		
		Encapsulation s2 = new Encapsulation();
		
		s2.setA(27);
		s2.setB("pushpa");
		s2.setC(8661252154l);
		
		List<Encapsulation> l = new ArrayList();
		l.add(s);
		l.add(s1);
		l.add(s2);
		
		
		for (int i = 0; i < l.size(); i++) {
			
		
		System.out.println("my age is"+ l.get(i).getA());
		System.out.println("my name is"+l.get(i).getB());
		System.out.println("My mobno is"+l.get(i).getC());
		System.out.println(s2);
		
	}
	     Set ss = new HashSet();
	     ss.add(s);
	     ss.add(s1);
	     ss.add(s2);
	     
	     for (Object x : ss) {
			System.out.println("my name is ");
		}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
}

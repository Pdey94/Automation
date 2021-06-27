package Popups;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Manish");
		a1.add("Harsit");
		a1.add("Naimisha");
		a1.add(null);
		a1.add("Pooja");
		a1.add("harsit");
		a1.add("asu");
		System.out.println(a1.size());
		System.out.println(a1);
		a1.add(0,"rasika");
		System.out.println(a1);
		
		ArrayList<String> al1=new ArrayList<>();
		System.out.println(al1.size());
		System.out.println(al1);
		al1.addAll(a1);
		System.out.println(al1);
		
	}

}

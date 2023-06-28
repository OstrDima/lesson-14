package ua.ostr_1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<ArbitrarilyClass> ac = new HashSet<ArbitrarilyClass>();
		ac.add(new ArbitrarilyClass("String1", 27));
		ac.add(new ArbitrarilyClass("String4", 4));
		ac.add(new ArbitrarilyClass("String3", 41));
		ac.add(new ArbitrarilyClass("String2", 97));
		ac.add(new ArbitrarilyClass("String5", 33));

		System.out.println("HashSet виводить елементи у випадковому порядку");
		for (ArbitrarilyClass arbitrarilyClassItem : ac) {
			System.out.println(arbitrarilyClassItem);
		}

		Set<ArbitrarilyClass> ac1 = new LinkedHashSet<ArbitrarilyClass>();
		ac1.add(new ArbitrarilyClass("String1", 27));
		ac1.add(new ArbitrarilyClass("String4", 4));
		ac1.add(new ArbitrarilyClass("String3", 41));
		ac1.add(new ArbitrarilyClass("String2", 97));
		ac1.add(new ArbitrarilyClass("String5", 33));

		System.out.println();
		System.out.println("LinkedHashSet виводить елементи в порядку їх додавання");
		for (ArbitrarilyClass arbitrarilyClassItem : ac1) {
			System.out.println(arbitrarilyClassItem);
		}

		Set<ArbitrarilyClass> ac2 = new TreeSet<ArbitrarilyClass>();
		ac2.add(new ArbitrarilyClass("String1", 27));
		ac2.add(new ArbitrarilyClass("String4", 4));
		ac2.add(new ArbitrarilyClass("String3", 41));
		ac2.add(new ArbitrarilyClass("String2", 97));
		ac2.add(new ArbitrarilyClass("String5", 33));

		System.out.println();
		System.out.println("TreeSet виводить елементи в порядку, перевизначеному в Comparable (за замовчуванням)");
		for (ArbitrarilyClass arbitrarilyClassItem : ac2) {
			System.out.println(arbitrarilyClassItem);
		}

		Set<ArbitrarilyClass> ac3 = new TreeSet<ArbitrarilyClass>(new ArbitrarilyClassIntegerComparator());
		ac3.add(new ArbitrarilyClass("String1", 27));
		ac3.add(new ArbitrarilyClass("String4", 4));
		ac3.add(new ArbitrarilyClass("String3", 41));
		ac3.add(new ArbitrarilyClass("String2", 97));
		ac3.add(new ArbitrarilyClass("String5", 33));

		System.out.println();
		System.out.println("TreeSet виводить елементи в порядку, перевизначеному в Comparator");
		for (ArbitrarilyClass arbitrarilyClassItem : ac3) {
			System.out.println(arbitrarilyClassItem);
		}
	}

}
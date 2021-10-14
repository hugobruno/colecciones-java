package com.generation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	/*String universidades [];
	universidades = new String [5];
	universidades[0] = "UNAM";
	universidades[1] = "IPN";
	universidades[2] = "UAM";
	universidades[3] = "ITESM";
	universidades[4] = "ULA";
	for(String universidad : universidades){
	    System.out.println(universidad);
    }
    }

		Set<String> frutas = new HashSet(4); //NO Respeta el orden de inserción de elementos
		frutas.add("Mango");
		frutas.add("Fresa");
		frutas.add("Pera");
		frutas.add("Uva");
		frutas.add("Lima");

		for (String fruta : frutas) {
			System.out.println(fruta);
		}

		System.out.println("-------------------------------");

		Set<String> frutas2 = new TreeSet(); //Ordena de forma alfabética los elementos
		frutas2.add("Mango");
		frutas2.add("Fresa");
		frutas2.add("Pera");
		frutas2.add("Uva");
		frutas2.add("Lima");
		frutas2.add("Frambuesa");

		for (String fruta : frutas2) {
			System.out.println(fruta);
		}
		System.out.println("-------------------------------");

		Set<String> frutas3 = new LinkedHashSet(4); //Respeta el orden de inserción de elementos
		frutas3.add("Mango");
		frutas3.add("Fresa");
		frutas3.add("Pera");
		frutas3.add("Uva");
		frutas3.add("Lima");
		frutas3.add("Frambuesa");

		for (String fruta : frutas3) {
			System.out.println(fruta);
		}
	}
}
}*/
		System.out.println("----------------Bruno---------------");

		final Set hashSet = new HashSet(1_000_000);
		final Long startHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

		final Set treeSet = new TreeSet();
		final Long startTreeSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

		final Set linkedHashSet = new LinkedHashSet(1_000_000);
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
	}
}
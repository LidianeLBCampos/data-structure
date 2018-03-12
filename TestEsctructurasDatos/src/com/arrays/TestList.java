package com.arrays;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		ArrayList<Integer> miLista = new ArrayList<>();

		miLista.add(6);
		miLista.add(16);
		miLista.add(26);

		for (Integer num : miLista) {
			System.out.println(num);
		}
		
		miLista.forEach(e -> System.out.println(e)); //lambda para paradgma funcional

		System.out.println(miLista.get(1));
	}

}

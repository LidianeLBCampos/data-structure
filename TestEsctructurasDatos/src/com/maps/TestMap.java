package com.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Alumno {
	String nom;
	ArrayList<Double> notas;

	Alumno(String nom, Double... notas) {
		this.nom = nom;
		this.notas = new ArrayList<>(Arrays.asList(notas));
	}

	@Override
	public String toString() {
		return "Alumno [nom=" + nom + ", notas=" + notas + "]";
	}

}

public class TestMap {

	public static void main(String[] args) {
		HashMap<Integer, Alumno> miMapa = new HashMap<>();

		miMapa.put(1112223, new Alumno("Paco", 6.0, 9.4, 7.4));
		miMapa.put(4445666, new Alumno("Rosa Ramirez", 10.0, 10.0, 10.0, 10.0));
		miMapa.put(9232322, new Alumno("Javier Santos", 7.4, 4.8));

		Alumno alumno = miMapa.get(1112223);
		System.out.println(alumno.nom + alumno.notas);

		Set<Integer> claves = miMapa.keySet();
		// Lambda
		claves.forEach(e -> System.out.println(e));
		// reference method
		claves.forEach(System.out::print);

		Collection<Alumno> valores = miMapa.values();
		valores.forEach(System.out::println);
		
		//visita cada entrada do mapa
		for (Entry<Integer, Alumno> entrada : miMapa.entrySet()) {
			Integer dni = entrada.getKey();
			Alumno alumno_ = entrada.getValue();
		}

		//visita cada entrada do mapa
		miMapa.forEach((k,v) -> {
			Integer dni = k;
			Alumno alumno_ = v;
		});
		
		
		miMapa.entrySet().forEach(e -> {
			Integer dni = e.getKey();
			Alumno alumno_ = e.getValue();

		});
	}

}

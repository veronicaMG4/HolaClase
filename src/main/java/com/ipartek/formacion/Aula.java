package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {

		/*
		 * // TODO Auto-generated method stub // declarar array con nombre alumnos
		 * String[] alumnos = { "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz",
		 * "Aritz", "Manuel", "Eduardo", "Eder I", "Eder S", "Gaizka", "Borja",
		 * "Verónica", "Jon A", "José Luis"}; System.out.println(); for (int j = 0; j <
		 * alumnos.length; j++) {
		 * 
		 * System.out.println(alumnos[j]);
		 * 
		 * }
		 * 
		 * // generar numero aleatorio
		 * 
		 * int numero = (int) (Math.random() * alumnos.length);
		 * 
		 * for (int j = 0; j < alumnos.length; j++) {
		 * 
		 * if (numero != j) { System.out.println("***" + alumnos[j]); } else {
		 * System.out.println(j + "" + alumnos[j]); } }
		 * 
		 * // mostrar voluntario para leer
		 * 
		 */

		// 1.listar alumnos y ranking

		// static final int OPCION_LISTAR=1 --hacer un swicth
		ArrayList<Person> listaPersonas = new ArrayList<Person>();

		System.out.println("ALUMNOS:");
		listaPersonas.add(new Person("asier", 24, 'M'));
		listaPersonas.add(new Person("andoni", 20, 'M'));
		listaPersonas.add(new Person("jonc", 19, 'M'));
		listaPersonas.add(new Person("arkaitz", 21, 'M'));
		listaPersonas.add(new Person("aritz", 28, 'M'));
		listaPersonas.add(new Person("manuel", 21, 'M'));
		// System.out.println(listaPersonas);

		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i).getNombre());
		}

		// 2.crear alumno

		System.out.println("Introduce un nuevo alumno:");
		Scanner sc_nombre = new Scanner(System.in);
		String nombre;
		nombre = sc_nombre.next();

		System.out.println("Introduce la edad del nuevo alumno:");
		Scanner sc_edad = new Scanner(System.in);
		int edad;
		edad = sc_edad.nextInt();

		System.out.println("Introduce el sexo del nuevo alumno:");
		Scanner sc_sexo = new Scanner(System.in);
		char sexo;
		sexo = sc_sexo.next().charAt(0);

		// listaPersonas.add(new Person(sc_nombre));

		listaPersonas.add(new Person(nombre, edad, sexo));
		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i).getNombre());
		}

		// 3.eliminar alumno

		System.out.println("Introduce el alumno a eliminar:");
		Scanner sc_nombre1 = new Scanner(System.in);
		String nombre1;
		nombre1 = sc_nombre1.nextLine();
		sc_nombre1.close();
		System.out.println("eliminar" + nombre1 + "?");

		// listaPersonas.remove(nombre1);no sirve no lo borra
		/*
		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i).getNombre());
		}*/

		for (int j = 0; j < listaPersonas.size(); j++) {
			listaPersonas.get(j).getNombre();
			String nombre_eliminar;
			nombre_eliminar = listaPersonas.get(j).getNombre();
			//int numero_alumno=listaPersonas.get(index)
			//System.out.println(nombre1 + nombre_eliminar);
			if (nombre1.equals(nombre_eliminar)) {

				System.out.println("vamos a eliminarte");
				 listaPersonas.remove(0);
			} else {
				//System.out.println("no coinciden");
			}
			
			for (int i = 0; i < listaPersonas.size(); i++) {
				System.out.println(listaPersonas.get(i).getNombre());
			}

			/*
			 * listaPersonas.get(i).getNombre(); String nombre_eliminar;
			 * nombre_eliminar=listaPersonas.get(i).getNombre();
			 * System.out.println("quiero borrar a: " + nombre_eliminar);
			 */

			// if (nombre1=nombre_eliminar) {

		}

		// listaPersonas.remove(index)
	}
}

// 4.buscar voluntario

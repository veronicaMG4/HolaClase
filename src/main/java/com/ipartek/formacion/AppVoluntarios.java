package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;
import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class AppVoluntarios {

	final static int  OPCION_LISTAR     = 1;
	final static int  OPCION_CREAR      = 2;
	final static int  OPCION_BORRAR     = 3;
	final static int  OPCION_VOLUNTARIO = 4;
	final static int  OPCION_SALIR      = 0;
	
	static int opcionSeleccionada;
	static Scanner sc;
	static ArrayList<Alumno> lista;
	static DAOAlumnoArrayList dao;
	
	
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		dao = new DAOAlumnoArrayList();
		
		
		// dao.getById(id)
		
		// dao.delete(id)
		
		
		do {
		
			pintarMenuYpedirOpcion();
			
			switch (opcionSeleccionada) {
			case OPCION_LISTAR:
				listar();
				break;
				
			case OPCION_BORRAR:
				borrar();
				break;
	
			default:
				break;
			}
			
		}while(opcionSeleccionada != OPCION_SALIR);
		
		System.out.println("Agur Venur");
		
		
		sc.close();
		

	}



	private static void borrar() {
		System.out.println("Borrar Alumno");
		
	}

	private static void listar() {
		System.out.println("Listado de Alumnos");
		System.out.println("-----------------------------");
		
		//TODO ordenar
		
		for (Alumno alumno : dao.getAll() ) {
			System.out.println( alumno.getNumVecesLeer() + " " + alumno.getNombre() );
		}
		
		
	}

	private static void pintarMenuYpedirOpcion() {
		
		System.out.println("-------------------------------");
		System.out.println("1 Listar");
		System.out.println("2 Crear");
		System.out.println("3 Eliminar");
		System.out.println("4 Voluntario");		
		System.out.println("-------------------------------");
		System.out.println(" 0 para salir");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("Dime tu opcion.....");
		
		try {
		
			opcionSeleccionada = Integer.parseInt(sc.nextLine());
			
		}catch (Exception e) {
			System.out.println("*** opcion no posible **** ");
			
			pintarMenuYpedirOpcion();
			
		}	
		
		
		
	}

}
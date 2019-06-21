package com.ipartek.formacion;

import com.ipartek.formacion.Employee;
import com.ipartek.formacion.Person;

public class Pruebasperson {

	public static void main(String[] args) {
		
		
		Person p = new Person();
		System.out.println( p.toString() );
		
		
		Person p2 = new Person("Pepe", 23, 'h');
		System.out.println(p2);
		
		
		Employee e = new Employee();
		System.out.println(e);
		
		
		Employee e2 = new Employee("Manolito", 44, 'h', 1.200f );
		System.out.println(e2);
		
		
		System.out.println("------------------------------------------");
		System.out.println("------------ TOP YOUTUBE -----------------");
		System.out.println("------------------------------------------");
		
		// crear 3 personas famosas de Youtube
		
		Employee y1 = new Employee("Logan Paul", 23 , 'h', 14500000f );
		Employee y2 = new Employee("PewDiePie", 23 , 'h', 15500000f );
		Employee y3 = new Employee("Jacksepticeye", 23 , 'h', 16000000f );
		
		// incializara array con 3 posiciones
		Employee[] youtubers = new Employee[3];
		
		//relleno el array
		youtubers[0] = y1;
		youtubers[1] = y2;
		youtubers[2] = y3;
		
		//	  numero  nombre  salario
		// ej: 1      Logan   14.500.000 $
		//Employee emp=null;variable fuera de memoria fuera de for
		//DecimalFormat dc= new DecimalFormat
		//for (int i = 0; i < youtubers.length; i++) {
		for (int i = 0; i < youtubers.length; i++) {
			
			System.out.println( youtubers[i] );
			
			System.out.println(i+ "" +youtubers[i].getNombre()+ "");
			
		} 
		
		
	}

}

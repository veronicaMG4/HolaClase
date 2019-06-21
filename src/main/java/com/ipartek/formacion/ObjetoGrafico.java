package com.ipartek.formacion;

public abstract class ObjetoGrafico {
	
	//atributos...
	//constructores...
	
	public void mover(int x, int y) {
		System.out.println("movemos el objeto a su nueva posicion");
		
	}
	
	public abstract void dibujar(String color);//prototipo
	

}

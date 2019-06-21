package com.ipartek.formacion;

/**
 * Esto es JavaDoc, son comentarios para documentar tu codigo fuente
 *
 */
public class PersonException1 {

	// atributos privados para encapsular

	private String nombre;
	
	private int edad;
	
	private float altura;  // 1.70 metros
	
	private float peso;  // 50.5 kg
	
	private String ojos;  // color
    
	private char sexo;  //  'h' hombre 'm' mujer 'i' indefinido 
	
    
	// constructores
	
	public PersonException1() {
		super();  // java.lang.Object
		this.nombre = "Anonimo";
		this.edad = 18;
		this.altura = 0;
		this.peso = 0;
		this.ojos = "marrones";
		this.sexo = 'i';
	}



	public PersonException1(String nombre, int edad, char sexo) {
		//super();
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}





	// getters y setters
	
    public String saludar() {
    	
    	return "Hola me llamo " + getNombre();
    			
    }




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		if ( nombre == null ) {			
			this.nombre = "Sin Nombre";
		}else {
		
			this.nombre = nombre;
		}	
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public String getOjos() {
		return ojos;
	}


	public void setOjos(String ojos) {
		this.ojos = ojos;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	
	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", ojos="
				+ ojos + ", sexo=" + sexo + "]";
	}
  
    


	
}

package ar.edu.utn.frba.dds.holamundo;

import ar.edu.utn.frba.dds.entes.Nombrable;
import ar.edu.utn.frba.dds.entes.Persona;

public class Test {

	public static void main (String [] args){
		Recepcionista recepcionista = makeRecepcionista();
		Nombrable nombrable = new Mundo();
		recepcionista.saludar(nombrable);
		nombrable = new Persona("Agustin"); 
		recepcionista.saludar(nombrable); 

	}
	private static Recepcionista makeRecepcionista() { 
		 return new RecepcionistaClasico(); 
		} 

}

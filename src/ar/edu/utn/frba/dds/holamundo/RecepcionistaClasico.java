package ar.edu.utn.frba.dds.holamundo;

import ar.edu.utn.frba.dds.entes.Nombrable;

public class RecepcionistaClasico extends Recepcionista {

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "hola" + nombrable.getNombre();
	}

}

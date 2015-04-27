package ar.edu.utn.frba.dds.holamundo;

import ar.edu.utn.frba.dds.entes.Nombrable;

public class RecepcionistaFormal extends Recepcionista {

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "buen día estimado" + nombrable.getNombre();
	}

}

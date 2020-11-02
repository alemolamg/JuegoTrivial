package juegoTrivial;

import java.util.ArrayList;
import java.util.List;
import juegoTrivial.Respuesta;

public class Pregunta {
	private String textoPregunta;
	public List<Respuesta> listaRespuestas = new ArrayList<Respuesta>();
	
	public Pregunta(String texto, List<Respuesta> respuestasPregunta) {
		textoPregunta = texto;
		listaRespuestas = respuestasPregunta;		
	}
	
	

}

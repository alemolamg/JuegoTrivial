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
	
	public void mostrarPregunta() {
		System.out.println(textoPregunta);
	}
	
	/**
	 * Muestra por pantalla las 4 respuestas.
	 */
	public void mostrarRespuestas() {
		for (int i = 0; i < this.listaRespuestas.size(); i++) 
			System.out.println(this.listaRespuestas.get(i).getTextoRespuesta());
	}
	
	
	

}

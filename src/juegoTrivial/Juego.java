package juegoTrivial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import juegoTrivial.Pregunta;

public class Juego {
	
	
	public static void textoBienvenida() {
		System.out.println(""
				+ " ▄▄▄▄▄▄▄ ▄▄▄ ▄▄▄▄▄▄▄ ▄▄    ▄ ▄▄   ▄▄ ▄▄▄▄▄▄▄ ▄▄    ▄ ▄▄▄ ▄▄▄▄▄▄  ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄    ▄▄▄▄▄▄    \r\n"
				+ "█  ▄    █   █       █  █  █ █  █ █  █       █  █  █ █   █      ██       █       █  █      █   \r\n"
				+ "█ █▄█   █   █    ▄▄▄█   █▄█ █  █▄█  █    ▄▄▄█   █▄█ █   █  ▄    █   ▄   █  ▄▄▄▄▄█  █  ▄   █   \r\n"
				+ "█       █   █   █▄▄▄█       █       █   █▄▄▄█       █   █ █ █   █  █ █  █ █▄▄▄▄▄   █ █▄█  █   \r\n"
				+ "█  ▄   ██   █    ▄▄▄█  ▄    █       █    ▄▄▄█  ▄    █   █ █▄█   █  █▄█  █▄▄▄▄▄  █  █      █   \r\n"
				+ "█ █▄█   █   █   █▄▄▄█ █ █   ██     ██   █▄▄▄█ █ █   █   █       █       █▄▄▄▄▄█ █  █  ▄   █   \r\n"
				+ "█▄▄▄▄▄▄▄█▄▄▄█▄▄▄▄▄▄▄█▄█  █▄▄█ █▄▄▄█ █▄▄▄▄▄▄▄█▄█  █▄▄█▄▄▄█▄▄▄▄▄▄██▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█  █▄█ █▄▄█   \r\n"
				+ "");
		
		System.out.println("\n"
				+ " ▄▄▄▄▄▄▄ ▄▄▄▄▄▄   ▄▄▄ ▄▄   ▄▄ ▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄     \r\n"
				+ "█       █   ▄  █ █   █  █ █  █   █       █   █    \r\n"
				+ "█▄     ▄█  █ █ █ █   █  █▄█  █   █   ▄   █   █    \r\n"
				+ "  █   █ █   █▄▄█▄█   █       █   █  █▄█  █   █    \r\n"
				+ "  █   █ █    ▄▄  █   █       █   █       █   █▄▄▄ \r\n"
				+ "  █   █ █   █  █ █   ██     ██   █   ▄   █       █\r\n"
				+ "  █▄▄▄█ █▄▄▄█  █▄█▄▄▄█ █▄▄▄█ █▄▄▄█▄▄█ █▄▄█▄▄▄▄▄▄▄█\r\n"
				+ "");
		
		
	}

	public static void main(String[] args) {
		int puntosPartida = 0, cantidad = 10;
		int preFalladas = 0, preAcertadas = 0;
		textoBienvenida();
		
		List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();
		
		crearPreguntas(listaPreguntas);
		
		System.out.println("\n\n  Comenzamos con la ronda de preguntas:  ");
		
		for (Pregunta iterator : listaPreguntas ) {
			iterator.listaRespuestas.get(cantidad).;			
		}
		
		
	}
	
	
	public static void crearPreguntas(List<Pregunta> todasLasPreguntas) {
				
		List<Respuesta> listaR1 = new ArrayList<Respuesta>();
		listaR1.add(new Respuesta ("José Calvo Sotero", false));
		listaR1.add(new Respuesta ("Manuel Azaña", false));
		listaR1.add(new Respuesta ("Felipe González", false));
		listaR1.add(new Respuesta ("Adolfo Suarez", true));
		
		
		List<Respuesta> listaR2 = new ArrayList<Respuesta>();
		listaR2.add(new Respuesta ("Rastafari", true));
		listaR2.add(new Respuesta ("Jedismo", false));
		listaR2.add(new Respuesta ("Nuwaubianismo", false));
		listaR2.add(new Respuesta ("hinduismo", false));  

		List<Respuesta> listaR3 = new ArrayList<Respuesta>();
		listaR3.add(new Respuesta ("Gitega", false));
		listaR3.add(new Respuesta ("Tirana", true));
		listaR3.add(new Respuesta ("Moroni", false));
		listaR3.add(new Respuesta ("Lusaka", false));
		
		List<Respuesta> listaR4 = new ArrayList<Respuesta>();
		listaR4.add(new Respuesta("2000", false));
		listaR4.add(new Respuesta("1999", true));
		listaR4.add( new Respuesta("2001", false));
		listaR4.add(new Respuesta("1998", false));
		
		List<Respuesta> listaR5 = new ArrayList<Respuesta>();
		listaR5.add(new Respuesta("Pícaro", false));
		listaR5.add(new Respuesta("Rocinante", true));
		listaR5.add(new Respuesta("Dorado", false));
		listaR5.add(new Respuesta("Babieca",false));
		
		
		List<Respuesta> listaR6 = new ArrayList<Respuesta>();
		listaR6.add(new Respuesta("Tango", false));
		listaR6.add(new Respuesta("Frevo", false));
		listaR6.add(new Respuesta("Capoeira", true));
		listaR6.add(new Respuesta("Kathakali", false));
		
		
		List<Respuesta> listaR7 = new ArrayList<Respuesta>();
		listaR7.add(new Respuesta("Invernalia", true));			// desembarco del Rey  / 
		listaR7.add(new Respuesta("Riverrun", false));
		listaR7.add(new Respuesta("Desembarco del Rey", false));
		listaR7.add(new Respuesta("OldTown", false));
		
		
		todasLasPreguntas.add(new Pregunta ("¿ Quién fue el primer presidente de la "
				+ "democracia española tras el franquismo?", listaR1));
		todasLasPreguntas.add(new Pregunta("Para qué religión es especialmente importante el rey Haile Selassie I",listaR2));
		todasLasPreguntas.add(new Pregunta("¿Cuál es el nombre de la capital de Albania?",listaR3));
		todasLasPreguntas.add(new Pregunta("¿Cuándo se estrenó la película The Matrix?",listaR4));
		todasLasPreguntas.add(new Pregunta("¿Cómo se llamaba el caballo que pertenecía a "
				+ "Don Quijote de La Mancha?", listaR5));
		todasLasPreguntas.add(new Pregunta("¿Qué baile tiene su origen en un arte marcial?", listaR6));
		todasLasPreguntas.add(new Pregunta("¿Dónde nació Arya Stark, de la saga \"Canción de hielo y Fuego\"?", listaR7));
		
		
	}
		
}

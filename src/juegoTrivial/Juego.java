package juegoTrivial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import juegoTrivial.Pregunta;

public class Juego {
	public static int puntosPartida = 0, cantidad = 10;
	public static int preFalladas = 0, preAcertadas = 0;
	
//	public List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();
	
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
		textoBienvenida();
		
		List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();
		
		crearPreguntas(listaPreguntas);
		
		System.out.println("\n\n  Comenzamos con la ronda de preguntas:  ");
		
		for (int i = 0; i < listaPreguntas.size(); i++) {
			listaPreguntas.get(i).mostrarPregunta();
			listaPreguntas.get(i).mostrarRespuestas();
			boolean laRespuesta = verificarRespuesta(listaPreguntas, i);
			if (laRespuesta) {
				System.out.println("La respuesta es correcta.");
				preAcertadas++;
			}else {
				System.out.println("La respuesta es incorrecta");
				preFalladas++;
			}
		}
		
		int puntuacionTotal = (10 * preAcertadas) - (5 * preFalladas);
		
		System.out.println("Se han acertado " + preAcertadas + " preguntas y fallado " + preFalladas);
		System.out.println("La puntuación total es: " + puntuacionTotal);		
	}
	
	/**
	 * rellena el vector con las preguntas deseadas 
	 * @param todasLasPreguntas	(list<Pregunta>) entra vacío y se le añaden las preguntas.
	 */
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
		
		
		List<Respuesta> listaR8 = new ArrayList<Respuesta>();
		listaR8.add(new Respuesta("Febrero", false));
		listaR8.add(new Respuesta("Junio", false));
		listaR8.add(new Respuesta("Agosto", true));
		listaR8.add(new Respuesta("Noviembre", false));
		
		List<Respuesta> listaR9 = new ArrayList<Respuesta>();
		
		
		List<Respuesta> listaR10 = new ArrayList<Respuesta>();
		
		todasLasPreguntas.add(new Pregunta ("¿ Quién fue el primer presidente de la "
				+ "democracia española tras el franquismo?", listaR1));
		todasLasPreguntas.add(new Pregunta("Para qué religión es especialmente importante el rey Haile Selassie I",listaR2));
		todasLasPreguntas.add(new Pregunta("¿Cuál es el nombre de la capital de Albania?",listaR3));
		todasLasPreguntas.add(new Pregunta("¿Cuándo se estrenó la película The Matrix?",listaR4));
		todasLasPreguntas.add(new Pregunta("¿Cómo se llamaba el caballo que pertenecía a "
				+ "Don Quijote de La Mancha?", listaR5));
		todasLasPreguntas.add(new Pregunta("¿Qué baile tiene su origen en un arte marcial?", listaR6));
		todasLasPreguntas.add(new Pregunta("¿Dónde nació Arya Stark, de la saga \"Canción de hielo y Fuego\"?", listaR7));
		todasLasPreguntas.add(new Pregunta("¿Qué mes tiene 31 días?", listaR8));
		todasLasPreguntas.add(new Pregunta(texto, listaR9));
		todasLasPreguntas.add(new Pregunta(texto, listaR10));
		
		
	}
	
	
	public static boolean verificarRespuesta (List<Pregunta> listPreguntas, int numPregunta) {
		System.out.println("Elige la respuesta correcta: ");
		int lectura = obtenerEnteroScanner();
		boolean wanda = false;
		
		for (int i = 0; i < listPreguntas.get(numPregunta).listaRespuestas.size(); i++ ) 
			if(lectura == i)
				wanda = listPreguntas.get(numPregunta).listaRespuestas.get(i).isEsCorrecta();
		return wanda;		
	}
	
	
	/**
	 * Usa el método Scanner para obtener el entero
	 * @return int
	 */
	public static int obtenerEnteroScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
		
}

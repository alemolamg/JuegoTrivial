package juegoTrivial;

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
		textoBienvenida();
		
		
		
	}
	
	
	public static void preguntas(String vectorPreguntas []) {
		Pregunta p1 = new Pregunta ("¿ Quién fue el primer presidente de la democracia española tras el franquismo?");
		Pregunta p2 = new Pregunta("Para qué religión es especialmente importante el rey Haile Selassie I");
		Pregunta p3 = new Pregunta("¿Cuál es el nombre de la capital de Albania?");
		
		
		Respuesta r11 = new Respuesta ("José Calvo Sotero", false);
		Respuesta r12 = new Respuesta ("Manuel Azaña", false);
		Respuesta r13 = new Respuesta ("Felipe González", false);
		Respuesta r14 = new Respuesta ("Adolfo Suarez", true);
		
		Respuesta r21 = new Respuesta ("Rastafari", true);
		Respuesta r22 = new Respuesta ("Jedismo", false);
		Respuesta r23 = new Respuesta ("Nuwaubianismo", false);
		Respuesta r24 = new Respuesta ("hinduismo", false);  

		Respuesta r31 = new Respuesta ("Gitega", false);
		Respuesta r32 = new Respuesta ("Tirana", true);
		Respuesta r33 = new Respuesta ("Moroni", false);
		Respuesta r34 = new Respuesta ("Lusaka", false);
		
		
		
		
	}
		
}

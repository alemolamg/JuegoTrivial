package juegoTrivial;

public class Respuesta {
	private String textoRespuesta;
	private boolean esCorrecta;
	
	public Respuesta(String texto) {
		textoRespuesta = texto;
		this.esCorrecta = false;		
	}
	
	/**
	 * Constructor de respuesta con dos parámetros.
	 * @param texto (string) Texto con la respuesta correcta.
	 * @param correcta	(bool) Estado de la respuesta correcta.
	 */
	public Respuesta (String texto, boolean correcta) {
		textoRespuesta = texto;
		esCorrecta = correcta;
	}

	/**
	 * @return the textoRespuesta
	 */
	public String getTextoRespuesta() {
		return textoRespuesta;
	}

	/**
	 * @param textoRespuesta the textoRespuesta to set
	 */
	public void setTextoRespuesta(String textoRespuesta) {
		this.textoRespuesta = textoRespuesta;
	}

	/**
	 * @return the esCorrecta
	 */
	public boolean isEsCorrecta() {
		return esCorrecta;
	}

	/**
	 * @param esCorrecta the esCorrecta to set
	 */
	public void setEsCorrecta(boolean esCorrecta) {
		this.esCorrecta = esCorrecta;
	}
	
	
}

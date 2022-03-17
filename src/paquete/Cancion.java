package paquete;
/**
 * Clase para construir canciones y m�todos
 * @author Jorge
 *@version 02.2002
 *
 */

public class Cancion {

	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
	
	/**
	 * Constructor por defecto, que inicializa t�tulo vacio, duraci�n cero y no est� sonando
	 */
	
	Cancion() // Constructor sin par�metros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	
	/**
	 * 
	 * @param titulo,aqui que ponemos t�tulo a la canci�n
	 * @param duracion, aqui le pones duraci�n a el video
	 */

	Cancion(String titulo, int duracion)// constructor con 2 par�metros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}

	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 par�metros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	/**
	 * aqui pone el booleano a true si est� sonando
	 * @return repite la acci�n
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
	/**
	 * Si la canci�n est� activa, no se pausar�
	 * @return devuelve si se para la canci�n
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}
	// meter m�todos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	/**
	 * 
	 * @param cancion ,si la canci�n coincide con el grupo, la cancion ser� el grupo
	 * @return compara cancion y grupo
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
	/**
	 * 
	 * @param canciones , muestra las canciones m�s largas
	 * @return bucle que a�ade las canciones largas y sobrescribe
	 */
	
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	/**
	 * 
	 * @param canciones , escoge una a una por posicion de array las canciones con su nombre
	 * @param titulo , nombre de la cancion 
	 * @return m�todo del bucle
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}

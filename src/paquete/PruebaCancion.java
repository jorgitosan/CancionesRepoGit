package paquete;
/**
 * clase donde creamos el programita 
 * @author Jorge
 * @version 02/2022
 */
public class PruebaCancion {
	/**
	 * MAIN
	 * @param args a
	 */
	public static void main(String[] args) {
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don�t Stop Believin�", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion("La gitanas lo bailan asi","Canelita",380,false);
		Cancion quintaCancion = new Cancion("Baila el chiki chiki","Chiquilicuatre",410,false);
		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "est� sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canci�n");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva ,cuartaCancion,quintaCancion};
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}
	//AQUI TERMINA EL MAIN
	/**
	 * 
	 * @param miCancion m�todo que recoge la canci�n seleccionada
	 * @param canciones aqu� las canciones son mixeadas en el array
	 */
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canci�n que sonar� despu�s de " + miCancion.getTitulo() + " ser� "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

	/**
	 * 	
	 * @param canciones Muestreo de la canci�n m�s larga
	 */
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canci�n m�s larga es: " + Cancion.MayorDuracion(canciones));
	}

/**
 * 
 * @param canciones Muestreo de canciones
 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canci�n es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	
}

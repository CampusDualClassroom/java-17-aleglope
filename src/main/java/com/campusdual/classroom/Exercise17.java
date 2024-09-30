package com.campusdual.classroom;

/**
 * La clase {@code Exercise17} proporciona métodos para manipular arrays de tipo
 * {@code int} y {@code String}, incluyendo la creación, inicialización, asignación
 * de valores, obtención de la longitud y visualización de elementos específicos.
 * <p>
 * Esta clase demuestra operaciones básicas con arrays en Java, cumpliendo con los
 * requisitos especificados en el ejercicio.
 * </p>
 *
 * @version 1.0
 */
public class Exercise17 {

	/**
	 * Crea un array de enteros vacío con el número de posiciones especificado.
	 * <p>
	 * Cada posición del array de enteros se inicializa automáticamente a {@code 0}.
	 * </p>
	 *
	 * @param positions El número de posiciones que tendrá el array.
	 * @return Un array de enteros de la longitud especificada.
	 */
	public static int[] createEmptyIntArray(int positions) {
		// Crea un array de enteros con la longitud especificada.
		return new int[positions];
	}

	/**
	 * Crea e inicializa un array de {@code String} con los valores "1", "2" y "3".
	 * <p>
	 * Este método retorna un array de {@code String} de 3 elementos, cada uno
	 * conteniendo la representación en cadena de números del 1 al 3.
	 * </p>
	 *
	 * @return Un array de {@code String} inicializado con los valores "1", "2" y "3".
	 */
	public static String[] createInitializedStringArray() {
		// Crea un array de String con 3 posiciones y lo inicializa con "1", "2", "3".
		String[] stringArray = new String[3];
		stringArray[0] = "1";
		stringArray[1] = "2";
		stringArray[2] = "3";
		return stringArray;
	}

	/**
	 * Asigna un valor específico a un índice concreto de un array de enteros.
	 * <p>
	 * Este método modifica el array proporcionado asignando el valor {@code value}
	 * en la posición {@code index}.
	 * </p>
	 *
	 * @param array El array de enteros a modificar.
	 * @param index El índice en el que se asignará el valor.
	 * @param value El valor a asignar en el índice especificado.
	 * @throws ArrayIndexOutOfBoundsException Si el índice está fuera de los límites del array.
	 */
	public static void populateArray(int[] array, int index, int value) {
		// Asigna el valor al índice especificado del array.
		array[index] = value;
	}

	/**
	 * Obtiene la longitud de un array de enteros.
	 * <p>
	 * Este método retorna el número de elementos que contiene el array proporcionado.
	 * </p>
	 *
	 * @param array El array de enteros cuya longitud se desea obtener.
	 * @return La longitud del array.
	 */
	public static int arrayLength(int[] array) {
		// Retorna la longitud del array.
		return array.length;
	}

	/**
	 * Muestra por pantalla el valor de un índice concreto de un array de enteros.
	 * <p>
	 * Este método imprime en la consola el valor almacenado en la posición
	 * {@code index} del array proporcionado.
	 * </p>
	 *
	 * @param array El array de enteros del cual se mostrará el valor.
	 * @param index El índice del cual se desea mostrar el valor.
	 * @throws ArrayIndexOutOfBoundsException Si el índice está fuera de los límites del array.
	 */
	public static void showValue(int[] array, int index) {
		// Muestra el valor en el índice especificado del array.
		System.out.println(array[index]);
	}

	/**
	 * Punto de entrada del programa que demuestra el uso de los métodos definidos
	 * para manipular arrays de enteros y cadenas.
	 * <p>
	 * Crea y manipula un array de enteros y un array de {@code String}, mostrando
	 * sus valores y características.
	 * </p>
	 *
	 * @param args Argumentos de la línea de comandos (no utilizados).
	 */
	public static void main(String[] args) {
		// Crear un array de enteros vacío con 3 posiciones.
		int[] intArray = createEmptyIntArray(3);

		// Crear e inicializar un array de cadenas con "1", "2" y "3".
		String[] stringArray = createInitializedStringArray();

		// Asignar valores específicos a cada posición del array de enteros.
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);

		// Mostrar el valor en el índice 0 del array de enteros.
		showValue(intArray, 0); // Espera mostrar: 10

		// Mostrar la longitud del array de enteros.
		System.out.println(arrayLength(intArray)); // Espera mostrar: 3
	}
}

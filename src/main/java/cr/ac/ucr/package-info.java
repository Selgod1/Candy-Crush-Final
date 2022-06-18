/***
 * ------------------------------------------------------------------------
 * PROJECT TITLE: Candy Crush
 * PURPOSE OF PROJECT: Tarea Programada
 * AUTHORS: Selassie Quijada
 * ------------------------------------------------------------------------
 * Pseudocodigo de Candy Crush
 *
 * 1. Crearemos un scanner que lea la entrada y cree una matriz con las dimensiones del tablero, filas y
 * columnas deseadas, dentro de las cuales se encontrarán los caramelos y colores ingresados.
 *     this.input = new Scanner(System.in);
 *     int[] dimensiones
 *     dimensiones[0] = input  FILAS
 *     dimensiones[1] = input  COLUMNAS
 *     se le asigna a tablero las dimensiones de las filas y columnas
 *     String[][] tablero = new String[dimensiones[0]][dimensiones[1]];
 *
 * 2. Revisaremos si se formaron combinaciones, primero comenzaremos por las combinaciones
 * de las de 5 caramelos(quintetos) de colores iguales horizontales y verticales,
 * for (row = 0; row < tablero.length; row++) {
 *             for (int col = 0; col < tablero[row].length; col++) {
 *                 if (tablero[row][col].equals(tablero[row + 1][col])) {
 *                     contadorFilas++;
 *
 * despues tendremos de 4(cuartetos),
 * revisaremos si encontramos L o T, y al final trios.
 * Después iremos en orden revisando caramelos especiales.
 * ciertas formaciones y condiciones van a generar caramelos especiales.
 * Si al eliminar una combinación se elimina un caramelo especial (rayado,
 * empaquetado o bomba multicolor), se deben eliminar los caramelos que se ven
 * afectados por la explosión del caramelo especial.
 *
 * 3. Generar los caramelos especiales como el empaquetado.
 *
 * 4. Desplazar hacia abajo los caramelos simulando gravedad.
 * if (col+1 != caramelo){
 *     col++
 * }
 *
 * 5. Imprimir en la salida estándar la nueva versión del tablero.
 * imprimirTablero (String[][] nuevoTablero) {
 *         for (int i = 0; i < nuevoTablero.length; i++) {
 *             for (int j = 0; j < nuevoTablero[1].length; j++) {
 *                 System.out.print(nuevoTablero[i][j]);
 *             }
 *         }
 *     }
 *
 *
 */
package cr.ac.ucr;

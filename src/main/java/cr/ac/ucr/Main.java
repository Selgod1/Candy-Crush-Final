//importamos librerias
import java.util.Scanner;
import java.io.*;
/**
 *Clase principal del juego Candy Crush
 */
public class Main {
    /**
     * El metodo {@code main} se inicializa a si mismo y ejecuta el metodo ejecuta todo el juego.
     */
    public static void main(final String[] args) {
        Scanner input = null;
        Main main = new Main();
        input = new Scanner(System.in).useDelimiter("\\s");
        String[] caramelos = new String[4];
        String carameloRegular = ("R");
        String carameloRayaHorizontal = ("H");
        String carameloRayaVertical = ("V");
        String carameloEmpaquetado = ("W");
        String carameloMulticolor = ("B");
        int multicolor = 0;
        int rojo = 1;
        int naranja = 2;
        int amarillo = 3;
        int verde = 4;
        int azul = 5;
        int morado = 6;

        int[] coloress = new int[7];

        coloress[0] = 0;
        coloress[1] = rojo;
        coloress[2] = naranja;
        coloress[3] = amarillo;
        coloress[4] = verde;
        coloress[5] = azul;
        coloress[6] = morado;
        String colores = String.valueOf(coloress);
        /***
         * /**
         * {@code tablero} se encargara de establecer todos los parametros del tablero
         * ademas de la creacion del mismo tablero con las respectivas dimensiones que se ingresen
         * y los valores de cada casilla
         * Se crea el tablero de las dimensiones necesarias.
         * row va a ser el numero de filas
         * col va a ser el numero de columnas
         */
        int row = input.nextInt();
        int col = input.nextInt();
        //se le asigna a tablero las dimensiones de las filas y columnas
        String tablero[][] = new String[row][col];
        //if para que mientras que haya mas entrada siga metiendole al for
        if (input.hasNext()) {
            //for que recorre el tablero y le asigna los valores a cada casilla
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    tablero[i][j] = input.next();
                }
            }
        }
        /***
         * El for {@code Revisar filas 1x5} va a ejecutarse cuando se encuentren 5
         * caramelos del mismo color en una fila
         */
        //Revisar filas 1x5
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length-4; j++) {
                if (tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2])
                        &&tablero[i][j].equals(tablero[i][j+3])&&tablero[i][j].equals(tablero[i][j+4])
                        &&!tablero[i][j].equals("--")) {
                    tablero[i][j] = ("B0");
                    tablero[i][j+1] = ("--");
                    tablero[i][j+2] = ("--");
                    tablero[i][j+3] = ("--");
                    tablero[i][j+4] = ("--");
                }
            }
        }
        /***
         * El for {@code Revisar columnas 1x5} va a ejecutarse cuando se encuentren 5
         * caramelos del mismo color en una columna
         */
        //Revisar columnas 1x5
        for (int i = 0; i < tablero.length-4; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals(tablero[i+1][j])&&tablero[i][j].equals(tablero[i+2][j])
                        &&tablero[i][j].equals(tablero[i+3][j])&&tablero[i][j].equals(tablero[i+4][j])
                        &&!tablero[i][j].equals("--")) {
                    tablero[i][j] = ("B0");
                    tablero[i+1][j] = ("--");
                    tablero[i+2][j] = ("--");
                    tablero[i+3][j] = ("--");
                    tablero[i+4][j] = ("--");
                }
            }
        }
        /***
         * El for {@code Revisar filas 1x4} va a ejecutarse cuando se encuentren 4
         * caramelos del mismo color en una fila
         */
        //Revisar filas 1x4
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length-3; j++) {
                if (tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2])
                        &&tablero[i][j].equals(tablero[i][j+3])&&!tablero[i][j].equals("--")) {
                    tablero[i][j] = ("V1");
                    tablero[i][j+1] = ("--");
                    tablero[i][j+2] = ("--");
                    tablero[i][j+3] = ("--");
                }
            }
        }
        /***
         * El for {@code Revisar columnas 1x4} va a ejecutarse cuando se encuentren 4
         * caramelos del mismo color en una colunma
         */
        //Revisar columnas 1x4
        for (int i = 0; i < tablero.length-3; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals(tablero[i+1][j])&&tablero[i][j].equals(tablero[i+2][j])
                        &&tablero[i][j].equals(tablero[i+3][j])&&!tablero[i][j].equals("--")) {
                    tablero[i][j] = ("H2");
                    tablero[i+1][j] = ("--");
                    tablero[i+2][j] = ("--");
                    tablero[i+3][j] = ("--");
                }
            }
        }
        /***
         * El for {@code revisar T 1} va a ejecutarse cuando se encuentre el primer tipo ende T
         * con caramelos del mismo color en todas las posibles posiciones del tablero
         * los tipos de T van en el mismo orden que la hoja Tarea 1 2022a Candy Crush.pdf
         */
        //revisar T 1
        for (int i = 0; i < tablero.length-2; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2])
                        &&!tablero[i][j].equals("--")) {
                    if((tablero[i][j].equals(tablero[i+1][j+1])&&tablero[i][j].equals(tablero[i+2][j+1]))){
                        tablero[i][j] = ("W4");
                        tablero[i][j+1] = ("--");
                        tablero[i][j+2] = ("--");
                        tablero[i+1][j+1] = ("--");
                        tablero[i+2][j+1] = ("--");
                    }
                }
            }
        }
        /***
         * El for {@code revisar T 3} va a ejecutarse cuando se encuentre el segundo tipo de T
         * con caramelos del mismo color en todas las posibles posiciones del tablero.
         */
        //revisar T 2
        for (int i = 2; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2])
                        &&!tablero[i][j].equals("--")) {
                    if((tablero[i][j].equals(tablero[i-1][j+1])&&tablero[i][j].equals(tablero[i-2][j+1]))){
                        tablero[i][j] = ("W4");
                        tablero[i][j+1] = ("--");
                        tablero[i][j+2] = ("--");
                        tablero[i-1][j+1] = ("--");
                        tablero[i-2][j+1] = ("--");
                    }
                }
            }
        }
        /***
         * El for {@code revisar T 3} va a ejecutarse cuando se encuentre el tercer tipo de T
         * con caramelos del mismo color en todas las posibles posiciones del tablero.
         */
        //revisar T 3
        for (int i = 0; i < tablero.length-2; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i+1][j])&&tablero[i][j].equals(tablero[i+2][j])
                        &&!tablero[i][j].equals("--")) {
                    if((tablero[i][j].equals(tablero[i+1][j+1])&&tablero[i][j].equals(tablero[i+1][j+2]))){
                        tablero[i][j] = ("W4");
                        tablero[i+1][j] = ("--");
                        tablero[i+2][j] = ("--");
                        tablero[i+1][j+1] = ("--");
                        tablero[i+1][j+2] = ("--");
                    }
                }
            }
        }
        /***
         * El for {@code revisar T 4} va a ejecutarse cuando se encuentre el cuarto tipo de T
         * con caramelos del mismo color en todas las posibles posiciones del tablero.
         */
        //revisar T 4
        for (int i = 1; i < tablero.length-1; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2])
                        &&!tablero[i][j].equals("--")) {
                    if((tablero[i][j].equals(tablero[i-1][j+2])&&tablero[i][j].equals(tablero[i+1][j+2]))){
                        tablero[i][j] = ("W4");
                        tablero[i][j+1] = ("--");
                        tablero[i][j+2] = ("--");
                        tablero[i-1][j+2] = ("--");
                        tablero[i+1][j+2] = ("--");
                    }
                }
            }
        }
        /***
         * El for {@code revisar L 1} va a ejecutarse cuando se encuentre el primer tipo de L
         * con caramelos del mismo color en todas las posibles posiciones del tablero.
         */
        //revisar L 1
        for (int i = 0; i < tablero.length-2; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i+1][j])&&tablero[i][j].equals(tablero[i+2][j])
                        &&!tablero[i][j].equals("--")) {
                    if((tablero[i][j].equals(tablero[i+2][j+1])&&tablero[i][j].equals(tablero[i+2][j+2]))){
                        tablero[i][j] = ("W4");
                        tablero[i+1][j] = ("--");
                        tablero[i+2][j] = ("--");
                        tablero[i+2][j+1] = ("--");
                        tablero[i+2][j+2] = ("--");
                    }
                }
            }
        }
        /***
         * El for {@code revisar L 2} va a ejecutarse cuando se encuentre el segundo tipo de L
         * con caramelos del mismo color en todas las posibles posiciones del tablero.
         */
        //revisar L 2
        for (int i = 2; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2])
                        &&!tablero[i][j].equals("--")) {
                    if((tablero[i][j].equals(tablero[i-1][j+2])&&tablero[i][j].equals(tablero[i-2][j+2]))){
                        tablero[i][j] = ("W4");
                        tablero[i][j+1] = ("--");
                        tablero[i][j+2] = ("--");
                        tablero[i-1][j+2] = ("--");
                        tablero[i-2][j+2] = ("--");
                    }
                }
            }
        }
        /***
         * El for {@code revisar L 3} va a ejecutarse cuando se encuentre el tecer tipo de L
         * con caramelos del mismo color en todas las posibles posiciones del tablero.
         */
        //revisar L 3
        for (int i = 0; i < tablero.length-2; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i+1][j])&&tablero[i][j].equals(tablero[i+2][j])
                        &&!tablero[i][j].equals("--")) {
                    if((tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2]))){
                        tablero[i][j] = ("W4");
                        tablero[i+1][j] = ("--");
                        tablero[i+2][j] = ("--");
                        tablero[i][j+1] = ("--");
                        tablero[i][j+2] = ("--");
                    }
                }
            }
        }
        /***
         * El for {@code revisar L 4} va a ejecutarse cuando se encuentre el cuarto tipo de L
         * con caramelos del mismo color en todas las posibles posiciones del tablero.
         */
        //revisar L 4
        for (int i = 0; i < tablero.length-2; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2])
                        &&!tablero[i][j].equals("--")) {
                    if((tablero[i][j].equals(tablero[i+1][j+2])&&tablero[i][j].equals(tablero[i+2][j+2]))){
                        tablero[i][j] = ("W4");
                        tablero[i][j+1] = ("--");
                        tablero[i][j+2] = ("--");
                        tablero[i+1][j+2] = ("--");
                        tablero[i+2][j+2] = ("--");
                    }
                }
            }
        }
        /***
         * El for {@code revisar filas 1x3} va a ejecutarse cuando se encuentren 3 caramelos
         * del mismo color en una fila de todas las posibles posiciones posibles del tablero.
         */
        //Revisar filas 1x3
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length-2; j++) {
                if (tablero[i][j].equals(tablero[i][j+1])&&tablero[i][j].equals(tablero[i][j+2])
                        &&!tablero[i][j].equals("--")) {
                    tablero[i][j] = ("--");
                    tablero[i][j+1] = ("--");
                    tablero[i][j+2] = ("--");
                }
            }
        }
        /***
         * El for {@code revisar columnas 1x3} va a ejecutarse cuando se encuentren 3 caramelos
         * del mismo color en una columna de todas las posibles posiciones posibles del tablero.
         */
        //Revisar columnas 1x3
        for (int i = 0; i < tablero.length-2; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals(tablero[i+1][j])&&tablero[i][j].equals(tablero[i+2][j])
                        &&!tablero[i][j].equals("--")) {
                    tablero[i][j] = ("--");
                    tablero[i+1][j] = ("--");
                    tablero[i+2][j] = ("--");
                }
            }
        }
        /***
         * Se encarga de simular la gravedad despues de todas las posibles combinaciones del
         * tablero y se ejecuta justo antes de imprimir el tablero
         */
        //simula gravedad para crear el nuevo tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals("--") && !tablero[i-1][j].equals("--")){
                    tablero[i][j].equals(tablero[i-1][j]);
                    tablero[i-1][j].equals("--");
                }
            }
        }
        /***
         * Se encarga de imprimir el nuevo tablero despues de que las combinaciones se hayan ejecutado
         */
        //imprime el nuevo tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
    }
}


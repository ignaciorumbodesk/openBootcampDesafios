/**
 * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
 
@author Ignacio Rumbo - Openbootcamp
@version 1.0
*/


public class desafioBucles3 {
    public static void main(String[] args) {
        
        int numeroDoWhile = 0;

        do {
            numeroDoWhile = numeroDoWhile + 3;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);
    }
}

/** 
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    pista: Los números inferiores a 0 son negativos y los superiores, positivos.

@author Ignacio Rumbo - Openbootcamp
@version 1.0
*/


public class desafioBucles {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf >= 1 ) {
            System.out.println("El numero es positivo.");
         } else if(numeroIf <= -1) {
                System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero 0 es neutro.");
        }
    }
}

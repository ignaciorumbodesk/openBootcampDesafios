/**

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se 
deberá mandar un mensaje por consola informando de la estación en la que está. 
También habrá que poner un default para cuando el valor de la variable no sea una estación.

@author Ignacio Rumbo - Openbootcamp
@version 1.0
*/

public class desafioBucles5 {
    public static void main(String[] args) {
        
        String estacion = "summer";

        switch (estacion) {
            case "fall":
                System.out.println("Es otoño.");
                break;
            case "winter":
                System.out.println("Es Invierno.");
                break;
            
            case "spring":
                System.out.println("Es Primavera.");
                break;
            
            case "summer":
                System.out.println("Es Verano.");
                break;
            
            default:
            System.out.println("El valor ingresado no concuerda con ningun valor esperado.");
                break;
        }
    }
}

/*


 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su Universidad");
        String universidad = entrada.nextLine();
        // nombre = "atacames"
        nombre = nombre.toLowerCase();

        char valor = nombre.charAt(0); // obtener el primer caracter de una
        // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch (valor) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s %s con edad %d, es estudiante de la %s",
                         nombre.toUpperCase(),
                        apellido.toUpperCase(), edad, universidad);

            default:
                System.out.printf("%s %s con edad %d, es estudiante de la %s",
                         nombre.toLowerCase(),
                        apellido.toLowerCase(), edad, universidad);
                break;

        }

    }
}

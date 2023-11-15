/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase());
        // El toLowerCase transforma una variable cadena a letras minusculas
        System.out.printf("%s\n", ciudad.toUpperCase());
        // El toUpperCase transforma una variable cadena a letras mayusculas
        System.out.printf("%s\n", ciudad);
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicospatrones;

import java.util.Scanner;
//
///**
// *
// * @author David.P
// */
public class ejercico1Examen {

    /**
     * @param args the command line arguments
     */
    //Poner dos numero y un caracter el cual si pongo un * me multiplica esos numero o si pongo una + me los sume 
    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
        int resultadosuma = 0; // Inicializamos en 0 para sumar
        int resultadomulti =1;
        
        System.out.println("Introduce el numero1:");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el numero2:");
        int numero2 = teclado.nextInt();
        teclado.nextLine(); // Limpiamos buffer de entrada

        System.out.println("Introduce el caracter (* para multiplicar, + para sumar):");
        String caracter = teclado.nextLine();

        if (caracter.equals("*")) {
            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) { // Verificamos si el número es par
                    resultadomulti *= i; // Multiplicamos el número par al resultado
                }
            }
            System.out.println("El resultado de la multiplicación de los pares entre " + numero1 + " y " + numero2 + " es: " + resultadomulti);

        } else if (caracter.equals("+")) {
            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) { // Verificamos si el número es par
                    resultadosuma += i; // Sumamos el número par al resultado
                }
            }
            System.out.println("El resultado de la suma de los pares entre " + numero1 + " y " + numero2 + " es: " + resultadosuma);

        } else {
            System.out.println("Caracter no reconocido. Introduce '*' para multiplicar o '+' para sumar.");
        }
    }
}

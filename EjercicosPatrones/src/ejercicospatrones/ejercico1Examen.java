/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicospatrones;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class ejercico1Examen {

    /**
     * @param args the command line arguments
     */
    //Poner dos numero y un caracter el cual si pongo un * me multiplica esos numero o si pongo una + me los sume 
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero1");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el numero2");
        int numero2 = teclado.nextInt();
        teclado.nextLine();//Limpiamos buffer de entrada

        System.out.println("Introduce el caracter");
        String caracter = teclado.nextLine();

        if  (caracter.equals("*")) {
            int operacion = numero1 * numero2;
            System.out.println(operacion);

        } else {
            int operacion = numero1 + numero2;
            System.out.println(operacion);

        }
    }

}

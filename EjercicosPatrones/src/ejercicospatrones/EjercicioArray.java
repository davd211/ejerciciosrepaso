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
//Programa que lea 12 números enteros sobre un vector y los visualice al revés, 
//es decir, comienza por final del vector y termina por el elemento 0. 
//¡Ojo! El for tiene que decrementar la variable de control, no incrementarla.
public class EjercicioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = teclado.nextInt();
        }
        for (int j = array.length; j < 0; j--) {
            System.out.println(array.length);

        }
    }

}

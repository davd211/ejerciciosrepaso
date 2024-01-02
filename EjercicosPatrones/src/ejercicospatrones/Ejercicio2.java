/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicospatrones;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author David.P
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
 //   Validar una matricula. 4 dígitos y 3 letras. Utilizar expresiones regulares.


    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(teclado.nextLine());
        if (m.matches()) {

            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

    }

}

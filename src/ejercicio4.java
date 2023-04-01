
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar 
         //su equivalente en grados Fahrenheit. 
         //La fórmula correspondiente es: F = 32 + (9 * C / 5).
         Scanner num = new Scanner(System.in);
         int fah;
         int num1;
         System.out.println("Escriba un grado para pasarlo a grados Fahrenheit");
         num1 = num.nextInt();
         
        fah = 32 + (9 * num1 / 5);
         System.out.println("Pasado a grados Fahrenheit serian unos " + fah);
    }
    
}

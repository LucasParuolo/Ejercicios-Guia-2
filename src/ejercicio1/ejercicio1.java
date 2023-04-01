/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);   
    int num1;
    int num2;
    System.out.println("Escriba un numero;");
    num1 = reader.nextInt();
    System.out.println("Escriba un numero;");
    num2 = reader.nextInt();
    int suma = num1 + num2;
    System.out.println(num1 + " + " + num2 +" = " + suma);
    }
    
}

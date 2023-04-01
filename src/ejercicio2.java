
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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("¿Como te llamas?");
        nombre = leer.next();
        System.out.println("Hola " + nombre + " Bienvenido");
    }
    
}

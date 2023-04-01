
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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner numero = new Scanner(System.in);
        int num;
        int doble;
        int triple;
        int raiz;
        System.out.println("Introdusca un numero");
        num = numero.nextInt();
        doble = num * 2;
         System.out.println("El doble de " + num + " es igual a " + doble);
        triple = num * 3;
        System.out.println("El triple de " + num + " es igual a " + triple);
        raiz= (int) Math.sqrt(num);
        System.out.println("La Raiz Cuadrada de " + num + " es igual a " + raiz);
    }
    
}

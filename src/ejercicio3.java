
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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        String escrito;
       
        System.out.println("escriba una frase");
        escrito = frase.nextLine();
        escrito = escrito.toUpperCase();
        System.out.println("la frase en mayurscula(toUpperCase) es " + escrito);
        escrito = escrito.toLowerCase();
        System.out.println("la frase en minuscula(toLowerCase) es " + escrito);
       
                
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author adilson.pereira
 */
public class EstruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
       float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
       float n2 = teclado.nextFloat();
       float m = (n1+n2)/2;
       System.out.println("A média é: " + m);
       if (m > 6) {
           System.out.println("PARABÉNS");
       }
    }
    
   
    
}

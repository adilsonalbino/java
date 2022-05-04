/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author adilson.pereira
 */
public class Testefuncao01 {

   /**
    * Procedimento que não retornoa nada...
    static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma é "+ s);
    }*/
   /** Procedimento que retornoa algo...*/
    static int soma (int a, int b){
        int s = a + b;
        return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Começou o programa...");
        //soma (5,2);
        int sm = soma(5,2);
        System.out.println("A soma é " + sm);
    }
    
}

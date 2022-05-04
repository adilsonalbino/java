/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author adilson.pereira
 */
public class IdadeMaiorMenor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
            int nasc = teclado.nextInt();
            int i = 2022-nasc;
                 if (i>=18){
                      System.out.format("Idade: %d anos\n\"MAIOR DE IDADE\"\n", i);
             } 
                    else{System.out.format("Idade: %d anos\n\"MENOR DE IDADE\"\n", i);
        }
    }
}

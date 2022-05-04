/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idadevoto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author adilson.pereira
 */
public class IdadeVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Date date = new Date();
        int year = date.getYear();
        int dtAtual = year+1900;
        //System.out.println(dtAtual);
        System.out.println("Digite o ano de nascimento: ");
        int an = teclado.nextInt();
        int idade = dtAtual - an;
            if(idade<16){
                System.out.format("A idade é: %d anos\nNÃO VOTA..!\n", idade);
            } else if ((idade>=16 && idade<18) || (idade >70)){
                System.out.format("A idade é: %d anos\nVOTO OPCIONAL..!\n", idade);
                } else{
                    System.out.format("A idade é: %d anos\nVOTO OBRIGATORIO..!\n",idade);
                    }
        
        
    }
    
}

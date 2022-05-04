/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author adilson.pereira
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {5.3,9,7.9,-3.4,4};
        //organizando a sequência do vetor
        Arrays.sort(v);
        //estrutura foreach abaixo
        for(double valor:v){
            System.out.print(valor + ", ");
        }
    }
    
}

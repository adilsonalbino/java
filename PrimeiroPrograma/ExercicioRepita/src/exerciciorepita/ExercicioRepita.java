/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author adilson.pereira
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, totVal=0, totPar=0, totImp=0,ac100=0;
        float m;
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        do{
             n = Integer.parseInt(JOptionPane.showInputDialog
                    ("Digite um número (Valor 0 interrompe)"));
                       // JOptionPane.showMessageDialog(null, n);
         s += n;
         if (n > 100){
             ac100++;
         }if (n != 0){
            totVal++;
        }if (n % 2 == 1){
            totImp++;
        }if (n % 2 == 0){
            totPar++;
        }
         m=s/totVal;
        }while(n != 0);
            JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr><br>"
                    + "Total de Valores:  " + totVal + "<br>" 
                    + "Total de pares:  " + totPar + "<br>"
                    + "Total ímpares:  " + totImp + "<br>"
                    + "Acima de 100:  " + ac100 + "<br>"
                    + "Média dos valores:  " + m + "<br>"
                    + "Somatório Vale:  " + s);   
            JOptionPane.showMessageDialog(null, "Programa encerrado.");   
    }
    
}

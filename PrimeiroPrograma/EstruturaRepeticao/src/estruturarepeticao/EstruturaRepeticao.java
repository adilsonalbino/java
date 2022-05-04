/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturarepeticao;

/**
 *
 * @author adilson.pereira
 */
public class EstruturaRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc<10){
            cc++;
            if(cc==4 || cc==6 || cc==9){
                continue;
            }
            if(cc==7){
                break;
            }
            System.out.println("Contador " + cc);
           
        }
    }
    
}

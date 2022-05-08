/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adilson.pereira
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Meotodos acessores
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria() .equals(l2.getCategoria())) && (l1 != l2)){
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("----------------------------------------");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            JOptionPane.showMessageDialog(null, "<html>A partida começou...<br><br>" 
                    + "Lutando...<br><br>" 
                    + "Verificando resultado da partida..." + "</html>");
            JOptionPane.showMessageDialog(null, "====RESULTADO FINAL====");
            switch(vencedor){
                case 0 -> {
                    //Empate
                    JOptionPane.showMessageDialog(null, "A luta Empatou");
                   // System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                }
                case 1 -> {
                    //Ganhou desafiado
                    JOptionPane.showMessageDialog(null , "O vencedor é " + desafiado.getNome());
                   // System.out.println("Vitória do " + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                }
                case 2 -> {
                    //Ganhar desafiante
                    JOptionPane.showMessageDialog(null , "O vencedor é " + desafiante.getNome());
                   // System.out.println("Vitória do " + desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                }
            }
        }else {
                JOptionPane.showMessageDialog(null, "A luta não pode acontecer!");
              }
    }
    //Metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
   
}

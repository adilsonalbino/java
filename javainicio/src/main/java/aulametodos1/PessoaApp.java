/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aulametodos1;

/**
 *
 * @author adilson.pereira
 */
public class PessoaApp {
    /**Criando método executável da classe pessoa*/
    public static void main (string[] args){
    
    /**Criando objetos para classe pessoa*/
     Pessoa pessoa1 = new Pessoa(1, "Helder");
     Pessoa pessoa2 = new Pessoa(2, "Ana");
    
     /**Chamando o metodo getNome e mostrando o atributo na tela*/
     system.out.println("O nome da pessoa 1 é: "+Pessoa.getNome());
    }
    
}

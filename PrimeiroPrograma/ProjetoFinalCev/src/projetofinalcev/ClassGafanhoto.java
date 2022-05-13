/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinalcev;

/**
 *
 * @author adilson.pereira
 */
public class ClassGafanhoto extends ClassPessoa {
    private String login;
    private int totAssistido;

    public ClassGafanhoto(String login, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viewMaisUm(){
        totAssistido =+ 1; 
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "ClassGafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}

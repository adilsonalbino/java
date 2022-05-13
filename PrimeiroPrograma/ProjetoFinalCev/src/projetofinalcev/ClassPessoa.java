/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinalcev;

/**
 *
 * @author adilson.pereira
 */
public abstract class ClassPessoa {
    protected String nome, sexo;
    protected int idade;
    protected float esperiencia;

    public ClassPessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.esperiencia = 0;
    }
     
    private void ganharExp(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEsperiencia() {
        return esperiencia;
    }

    public void setEsperiencia(float esperiencia) {
        this.esperiencia = esperiencia;
    }

    @Override
    public String toString() {
        return "ClassPessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", esperiencia=" + esperiencia + '}';
    }
    
    
}

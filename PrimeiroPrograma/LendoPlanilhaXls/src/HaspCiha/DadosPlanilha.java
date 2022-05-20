/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HaspCiha;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adilson.pereira
 */
public class DadosPlanilha extends Dado {
 
    public DadosPlanilha(String id, String nome, String email, String telefone){
        super(id, nome, email, telefone);
    }
    //private final List<Dado> dados = new ArrayList();
    private final List<DadosPlanilha> dadosPlanilha = new ArrayList();
    
 
    
    public List<DadosPlanilha> pegarDadosplanilha() {
        dadosPlanilha.add(new DadosPlanilha("1", "Jose da Silva", "jose@feltex.com.br", "2199988-777441"));
        dadosPlanilha.add(new DadosPlanilha("2", "Maria da Silva", "maria@feltex.com.br", "2155547-3341"));
        dadosPlanilha.add(new DadosPlanilha("3", "Joana dos Santos", "joanas@feltex.com.br", "55224-147523"));
        dadosPlanilha.add(new DadosPlanilha("4", "Joao da Silva", "joao@feltex.com.br", "55224-00000"));
        
        
        return dadosPlanilha;
        
     } 
    
    void criarArquivo() {
        var criaArquivo = new CriarArquivo();
        //assertNotNull(criaArquivo);
        criaArquivo.CriarArquivoXls("pacientesCIHA.xlsx", dadosPlanilha);
    }
}
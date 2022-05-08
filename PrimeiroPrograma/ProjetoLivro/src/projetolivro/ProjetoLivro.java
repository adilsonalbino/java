package projetolivro;

/**
 *
 * @author adilson.pereira
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", "M", 27);
        p[1] = new Pessoa("Sheila", "F", 28);
        
        l[0] = new Livro("Apredendo JAVA", "Adilson Albino", 30, p[0]);
        l[1] = new Livro("Nutrição Mágica", "Jocilene Pizon", 100, p[1]);
        l[2] = new Livro("Raio X", "Pedro Albino", 200, p[0]);
        
        l[0].abrir();
        l[0].detalhes();
        System.out.println(l[0].detalhes());
        l[0].avancarPag();
                System.out.println(l[0].detalhes());

    }
    
}

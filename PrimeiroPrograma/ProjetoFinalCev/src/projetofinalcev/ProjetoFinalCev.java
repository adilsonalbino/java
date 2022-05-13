package projetofinalcev;

/**
 *
 * @author adilson.pereira
 */
public class ProjetoFinalCev {
    public static void main(String[] args) {
        // Código principal
        ClassVideo v[] = new ClassVideo[3];
        //ClassVideo v = new ClassVideo("teste 23467");
        v[0] = new ClassVideo("Aprendendo JAVA POO");
        v[1] = new ClassVideo("Quero aprender python depois");
        v[2] = new ClassVideo("Como ganhar muita grana");
        
        ClassGafanhoto g[] = new ClassGafanhoto[2];
        g[0] = new ClassGafanhoto("adilson", "Adilson Albino", "M", 27);
        g[1] = new ClassGafanhoto("joice", "Joice Albino", "F", 28);
       //v.toString();
        //System.out.println(v[2].toString());
        //System.out.println(g[1].toString());
        
        Visualizacao vis = new Visualizacao(g[0], v[1]);
        System.out.println(vis.toString());
    
    }
    
}

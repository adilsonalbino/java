package projetofinalcev;
public class Visualizacao {
    private ClassGafanhoto espectador;
    private ClassVideo filme;

    public Visualizacao(ClassGafanhoto espectador, ClassVideo filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    public void avaliar(){
        this.filme.setAvaliacao(5);
        
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }   
    public void avaliar (float porc){
        int tot = 0;
        if (porc <=20){
            tot = 3;
        }else if(porc <=50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    public ClassGafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(ClassGafanhoto espectador) {
        this.espectador = espectador;
    }

    public ClassVideo getFilme() {
        return filme;
    }

    public void setFilme(ClassVideo filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}

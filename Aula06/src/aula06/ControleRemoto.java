package aula06;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Construtor
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    //Metodos Especiais
    private void setVolume(int i){
        this.volume = i;
    }
    private int getVolume(){
        return this.volume;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    
    //Metodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----------MENU------------------");
        System.out.println("Está ligado? "+this.getLigado() );
        System.out.println("Está tocando? "+getTocando());
        System.out.print("Volume: "+getVolume()+" ");
        for (int i = 0; i <= this.getVolume();i +=10){
            System.out.print("[]");
            
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()== true){
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && getVolume() > 0 ){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}

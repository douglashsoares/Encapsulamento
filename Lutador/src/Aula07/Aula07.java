package Aula07;

public class Aula07 {
    public static void main(String[] args) {
        
         Lutador L[] = new Lutador[6];
         
         L[0] = new Lutador("Pretty Boy","França",31,68.9f,1.75f,11,2,1);
         L[1] = new Lutador("Putscript","Brasil",29,57.8f,1.68f,14,2,3);
         L[2] = new Lutador("Snapshadow","EUA",35,80.9f,1.68f,12,2,1);
         L[3] = new Lutador("Dead Code","Austrália",28,81.6f,1.93f,13,0,2);
         L[4] = new Lutador("UFOCobol","Brasil",37,119.3f,1.70f,5,4,3);
         L[5] = new Lutador("Nerdaart","EUA",30,105.7f,1.81f,12,2,4);
         
        
    Luta campeonato = new Luta();
    campeonato.marcarLuta(L[5], L[5]);
    campeonato.lutar();
         
         
         
       
    }
    
}

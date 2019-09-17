package Aula07;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    //Metodos
    public void marcarLuta(Lutador L1, Lutador L2){
  
        
        
        if (L1.getCategoria().equals(L2.getCategoria()) && L1 != L2){
            this.setAprovado(true);
            this.setDesafiado(L1);
            this.setDesafiante(L2);
        }else{
            System.out.println("Luta inválida");
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        
      if (this.getAprovado() == true){
          System.out.println("#####DESAFIADO#####");
          this.getDesafiado().apresenta();
          System.out.println("#####DESAFIANTE#####");
          this.getDesafiante().apresenta();
          
          Random random = new Random();
          int resultado = random.nextInt(3);
          switch (resultado){
              case 0:
                  System.out.println("------------------------");
                  System.out.println("EMPATE");
                  System.out.println("------------------------");
                  this.desafiado.empatarLuta();
                  this.desafiante.empatarLuta();
                  break;
              case 1 :
                  System.out.println("------------------------");
                  System.out.println("Vitória do "+this.desafiado.getNome());
                  System.out.println("------------------------");
                  this.desafiado.ganharLuta();
                  this.desafiante.perderLuta();
                  break;
              case 2 :
                  System.out.println("------------------------");
                  System.out.println("Vitória do "+this.desafiante.getNome());
                  System.out.println("------------------------");
                  this.desafiante.ganharLuta();
                  this.desafiado.perderLuta();
                  break;
              default:
                  System.out.println("INVALIDO");
                  break;
          }
      } else {  
          System.out.println("Luta não está aprovada");
        }  
    }
    
    
    //Metodos Especiais
    public Lutador getDesafiado(){
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

    private void setRounds(int r) {
        this.rounds = r;
    }
    private int getRounds(){
        return this.rounds;
    }
    private void setAprovado(boolean a){
        this.aprovado = a;
    }
    private boolean getAprovado(){
        return this.aprovado;
    }
    
}

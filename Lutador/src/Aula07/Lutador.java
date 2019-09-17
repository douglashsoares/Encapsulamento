package Aula07;

public class Lutador {
    //Atributos
   private String nome;
   private String nacionalidade;
   private int idade;
   private float peso;
   private float altura;
   private String categoria;
   private int vitorias;
   private int derrotas;
   private int empates;
   
   //Metodos
   public void apresenta(){
       System.out.println("------------------------------------------------------");
       System.out.println("ITSSS TIMEEEEE!!!! Apresentamos o lutador " +getNome());
       System.out.println("Diretamente da "+getNacionalidade());
       System.out.println("Com a idade de "+getIdade()+" Anos");
       System.out.println("Com "+getAltura()+ "m de altura");
       System.out.println("Pesando "+getPeso()+"Kg");
       System.out.println("Categoria: " +getCategoria());
       System.out.println(getVitorias()+" Vitorias");
       System.out.println(getDerrotas()+" Derrotas");
       System.out.println(getEmpates()+" Empates");
   }
   public void status(){
       System.out.println(getNome());
       System.out.println("É um "+getCategoria());
       System.out.println(getVitorias()+" Vitórias");
       System.out.println(getDerrotas()+" Derrotas");
       System.out.println(getEmpates()+" Empates");
   }
   public void ganharLuta(){
      setVitorias(getVitorias() + 1); 
   }
   public void perderLuta(){
       setDerrotas(getDerrotas() + 1);
   }
   public void empatarLuta(){
       setEmpates(getEmpates() + 1);
   }
   
   //Metodo Construtor
   public Lutador(String no, String na, int id, float pe, 
                  float al, int vi, int de, int em){
       this.nome = no;
       this.nacionalidade = na;
       this.idade = id;
       this.setPeso(pe);    //Colocando dessa forma para que quando for chamado executar o setCategoria.
       this.altura = al;
       this.vitorias = vi;
       this.derrotas = de;
       this.empates = em;
   }
   
   //Metodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
     
        if(getPeso() < 52.2){
            this.categoria = "Invalido, Abaixo do peso";
        }else if (getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido, Acima do Peso";
        }    
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
   
}
